package net.demilich.metastone.game.spells;

import co.paralleluniverse.fibers.Suspendable;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import net.demilich.metastone.game.GameContext;
import net.demilich.metastone.game.Player;
import net.demilich.metastone.game.actions.DiscoverAction;
import net.demilich.metastone.game.actions.GameAction;
import net.demilich.metastone.game.cards.Attribute;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.cards.CardArrayList;
import net.demilich.metastone.game.cards.CardList;
import net.demilich.metastone.game.entities.Entity;
import net.demilich.metastone.game.entities.heroes.HeroClass;
import net.demilich.metastone.game.spells.aura.DiscoverNotSelectedSpellBonusAura;
import net.demilich.metastone.game.spells.desc.SpellArg;
import net.demilich.metastone.game.spells.desc.SpellDesc;
import net.demilich.metastone.game.spells.desc.filter.CardFilter;
import net.demilich.metastone.game.spells.desc.source.*;
import net.demilich.metastone.game.targeting.Zones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Prompts the user to make an irreversible choice of some number of cards, and casts a spell for the chosen (and
 * optionally, unchosen) cards.
 * <p>
 * Discover actions prompt the user to select from {@code count=}{@link SpellArg#HOW_MANY} cards, with a default of 3.
 * <p>
 * If an {@link SpellArg#ATTRIBUTE} is specified, it is added to the cards in the {@link Zones#DISCOVER}, and removed
 * when they leave. This is used with the {@link Attribute#UNCENSORED} attribute to indicate that these cards should be
 * visible to the opponent.
 * <p>
 * The cards to prompt the user with are gathered from the {@link SpellArg#CARDS} attribute and the specified {@link
 * CardSource} and {@link CardFilter} in {@link SpellArg#CARD_SOURCE} and {@link SpellArg#CARD_FILTER}. When the number
 * of cards to discover from is greater than {@code count}, cards are chosen at random from the possible options without
 * replacement (i.e., duplicates will not appear).
 * <p>
 * If {@link SpellArg#CARD_FILTER} is specified <b>without</b> a {@link SpellArg#CARD_SOURCE}, it is assumed that the
 * <b>weighted</b> (i.e., class-specific) catalogue source {@link CatalogueSource} should be used. However, if the
 * casting player is the {@link HeroClass#ANY} or {@link HeroClass#TEST} class, an {@link UnweightedCatalogueSource}
 * will be used instead.
 * <p>
 * When {@link SpellArg#CANNOT_RECEIVE_OWNED} is specified, the possible options exclude cards that are already in the
 * player's {@link Zones#HAND} or {@link Zones#HERO_POWER}.
 * <p>
 * Some card sources generate new cards; these card sources implement the {@link HasCardCreationSideEffects} interface.
 * Other card sources, like {@link DeckSource}, will reference the actual cards in the player's deck. Discovers
 * <b>always</b> present copies of cards to users, regardless of their origin. To perform the spell on the
 * <b>actual</b> card, set {@link SpellArg#EXCLUSIVE} to {@code true}. Trying to use an "exclusive" discover on cards
 * that are always generated will throw an exception.
 * <p>
 * When the user makes a discover choice, the spell arguments are interpreted to determine what spell is "cast" with the
 * chosen and unchosen cards:
 *
 * <ul> <li>When {@link SpellArg#SPELL} or {@link SpellArg#SPELL1} is specified and {@link SpellArg#EXCLUSIVE} is
 * {@code false} (the default): The spell is cast with the chosen card placed into the spell's {@link SpellArg#CARD}
 * argument.</li> <li>When {@link SpellArg#SPELL} or {@link SpellArg#SPELL1} is specified and {@link SpellArg#EXCLUSIVE}
 * is {@code true}: The spell is cast with the {@link Card} entity as its {@code target}.</li> <li>When {@link
 * SpellArg#SPELL2} is specified: This spell is cast on the cards that were <b>not</b> chosen, using the same rules of
 * {@link SpellArg#EXCLUSIVE} as above.</li> </ul>
 * <p>
 * If the {@link CardSource} implements the {@link HasWeights} interface, the discover will use the weights for random
 * selection. Since the {@link CatalogueSource} is the default card source and it supports weighting, a discover spell
 * with no card source specified will make a weighted selection from collectible cards in this {@link
 * net.demilich.metastone.game.decks.DeckFormat}. The weighting defaults to 4x likelihood for class cards that match the
 * player's hero class, 1x likelihood for neutral cards, and no likelihood for other class cards.
 * <p>
 * If there are no choices generated by the card source and filter, or if all the choices are removed due to {@link
 * SpellArg#CANNOT_RECEIVE_OWNED}, the user is not prompted for any choices and no spells are cast.
 * <p>
 * To discover a minion and put it in the player's hand:
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "cardFilter": {
 *             "class": "CardFilter",
 *             "cardType": "MINION"
 *         },
 *         "spell": {
 *             "class": "ReceiveCardSpell"
 *         }
 *     }
 * </pre>
 * To discover a random minion from any class without weighting:
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "cardFilter": {
 *             "class": "CardFilter",
 *             "cardType": "MINION"
 *         },
 *         "cardSource": {
 *             "class": "UnweightedCatalogueSource"
 *         },
 *         "spell": {
 *             "class": "ReceiveCardSpell"
 *         }
 *     }
 * </pre>
 * To discover a random Totem, including token totems, use an {@link net.demilich.metastone.game.spells.desc.source.UncollectibleCatalogueSource}
 * to include tokens in the selection:
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "cardFilter": {
 *             "class": "CardFilter",
 *             "cardType": "MINION",
 *             "race": "TOTEM"
 *         },
 *         "cardSource": {
 *             "class": "UncollectibleCatalogueSource"
 *         },
 *         "spell": {
 *             "class": "ReceiveCardSpell"
 *         }
 *     }
 * </pre>
 * To choose amongst 3 of a specific list of cards, specify the {@link SpellArg#CARDS} argument. Only 3 of these 4 cards
 * will be shown to the user, choosing which 3 randomly but without duplicates.
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "cards": [
 *              "minion_bloodfen_raptor",
 *              "minion_argent_squire",
 *              "minion_snowflipper_penguin",
 *              "minion_ironbeak_owl"
 *         ],
 *         "spell": {
 *             "class": "ReceiveCardSpell"
 *         }
 *     }
 * </pre>
 * When {@link SpellArg#HOW_MANY} is specified and it is greater or equal to the number of {@link SpellArg#CARDS}
 * elements there are, the user will be prompted for a discover choice in the exact order the cards appear:
 * <pre>
 *      {
 *          "class": "DiscoverSpell",
 *          "spell": {
 *              "class": "ReceiveCardSpell"
 *          },
 *          "cards": [
 *              "spell_invocation_of_air",
 *              "spell_invocation_of_earth",
 *              "spell_invocation_of_fire",
 *              "spell_invocation_of_water"
 *          ],
 *          "howMany": 4
 *      }
 * </pre>
 * To cast a discovered spell instead of receiving it, change the {@link SpellArg#SPELL} to a {@link CastCardsSpell}.
 * When trying to do different effects with the chosen cards, it's important to check if the {@link Spell} supports the
 * {@link SpellArg#CARD} argument (common ones like {@link CastCardsSpell}, {@link SummonSpell} and {@link
 * ReceiveCardSpell} do:
 * <pre>
 *      {
 *          "class": "DiscoverSpell",
 *          "spell": {
 *              "class": "CastCardsSpell"
 *          },
 *          "cards": [
 *              "spell_invocation_of_air",
 *              "spell_invocation_of_earth",
 *              "spell_invocation_of_fire",
 *              "spell_invocation_of_water"
 *          ],
 *          "howMany": 4
 *      }
 * </pre>
 * You can also cast spells on cards that are not chosen. This effect implements the text: "Discover a Fireball and
 * Pyroblast. Draw it. Put the card you did not choose into the opponent's hand."
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "spell1": {
 *             "class": "ReceiveCardSpell"
 *         },
 *         "spell2": {
 *             "class": "ReceiveCardSpell"
 *         },
 *         "cards": [
 *              "spell_pyroblast",
 *              "spell_fireball"
 *         ],
 *         "howMany": 2
 *     }
 * </pre>
 * If you want to discover a <b>copy</b> of a card in the opponent's deck, use a {@link DeckSource}.
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "spell": {
 *             "class": "ReceiveCardSpell"
 *         },
 *         "cardSource": {
 *             "class": "DeckSource",
 *             "targetPlayer": "OPPONENT"
 *         }
 *     }
 * </pre>
 * If instead you want to <b>steal</b> a card from the opponent's deck, use a {@link StealCardSpell} and set {@link
 * SpellArg#EXCLUSIVE} to {@code true}. The {@link SpellArg#EXCLUSIVE} argument will cast {@link StealCardSpell} with
 * the chosen card's {@link Entity#getId()} as the {@code target}. You must use {@link SpellArg#EXCLUSIVE} whenever you
 * use spells that only accept {@code target} and not {@link SpellArg#CARD}.
 * <pre>
 *     {
 *         "class": "DiscoverSpell",
 *         "spell": {
 *             "class": "StealCardSpell"
 *         },
 *         "cardSource": {
 *             "class": "DeckSource",
 *             "targetPlayer": "OPPONENT"
 *         },
 *         "exclusive": true
 *     }
 * </pre>
 * Discovering spells from weighted sources like {@link CatalogueSource} but with different classes is a little tricky.
 * Currently, only the {@link net.demilich.metastone.game.spells.desc.source.CardSourceArg#TARGET_PLAYER} argument can
 * be used to discover against the opponent's class. For <b>example,</b> this spell will discover a rare card in the
 * opponent's class:
 * <pre>
 *     {
 *          "class": "DiscoverSpell",
 *          "spell": {
 *              "class": "ReceiveCardSpell",
 *              "targetPlayer": "SELF"
 *          },
 *          "cardFilter": {
 *              "class": "AndFilter",
 *              "filters": [
 *                  {
 *                      "class": "CardFilter",
 *                      "heroClass": "OPPONENT"
 *                  },
 *                  {
 *                      "class": "CardFilter",
 *                      "rarity": "RARE"
 *                  }
 *              ]
 *          },
 *          "cardSource": {
 *              "class": "CatalogueSource",
 *              "targetPlayer": "OPPONENT"
 *          }
 *      }
 * </pre>
 *
 * @see SpellDesc#getFilteredCards(GameContext, Player, Entity) for more about how card filtering works.
 */
public class DiscoverSpell extends Spell {

	public static SpellDesc create() {
		return new SpellDesc(DiscoverSpell.class);
	}

	public static SpellDesc create(SpellDesc spellToCastOnSelectedCards) {
		var spell = new SpellDesc(DiscoverSpell.class);
		spell.put(SpellArg.SPELL, spellToCastOnSelectedCards);
		return spell;
	}

	@Override
	@Suspendable
	protected void onCast(GameContext context, Player player, SpellDesc desc, Entity source, Entity target) {
		List<Card> specificCards = Arrays.asList(SpellUtils.getCards(context, desc));
		boolean hasFilter = desc.containsKey(SpellArg.CARD_FILTER);
		boolean hasSource = desc.containsKey(SpellArg.CARD_SOURCE);
		CardList filteredCards;
		CardSource cardSource;
		if (hasFilter || hasSource) {
			if (hasFilter && hasSource) {
				cardSource = desc.getCardSource();
				filteredCards = desc.getFilteredCards(context, player, source);
			} else if (hasFilter /*&& !hasSource*/) {
				if (player.getHero().getSourceCard().hasHeroClass(HeroClass.ANY)
						|| player.getHero().getSourceCard().hasHeroClass(HeroClass.TEST)) {
					cardSource = UnweightedCatalogueSource.create();
				} else {
					cardSource = CatalogueSource.create();
				}
				filteredCards = cardSource.getCards(context, source, player).filtered(desc.getCardFilter().matcher(context, player, source));
			} else /*only has source*/ {
				cardSource = desc.getCardSource();
				// Unfiltered
				filteredCards = cardSource.getCards(context, source, player);
			}
		} else if (!specificCards.isEmpty()) {
			cardSource = UnweightedCatalogueSource.create();
			filteredCards = new CardArrayList();
		} else {
			cardSource = CatalogueSource.create();
			filteredCards = cardSource.getCards(context, source, player);
		}

		int count = desc.getValue(SpellArg.HOW_MANY, context, player, target, source, 3);
		boolean cannotReceiveOwned = desc.getBool(SpellArg.CANNOT_RECEIVE_OWNED);
		// An exclusive of false indicates that the discovered card should be passed as a card ID to the spells. Otherwise,
		// the original cards should be passed to the spells. This should never be called with a CatalogueSource or from
		// cards originating in a cards variable and will throw an exception in that situation.
		boolean exclusive = desc.getBool(SpellArg.EXCLUSIVE);

		if (exclusive
				&& (cardSource instanceof HasCardCreationSideEffects)) {
			throw new UnsupportedOperationException("Cannot specify exclusive (use original copies) with cards that have" +
					" card creation side effects. The original copies came from the catalogue, and thus have entity " +
					"references that correspond to -1 (NONE)");
		}

		// SPELL and SPELL_1 are cast on the chosen cards
		SpellDesc chosenSpellTemplate = SpellDesc.join((SpellDesc) desc.get(SpellArg.SPELL), (SpellDesc) desc.get(SpellArg.SPELL1));
		if (Objects.equals(chosenSpellTemplate.getDescClass(), NullSpell.class)) {
			chosenSpellTemplate = ReceiveCardSpell.create();
		}

		// SPELL_2 is cast on the cards that aren't chosen
		SpellDesc otherSpellDesc = (SpellDesc) desc.getOrDefault(SpellArg.SPELL2, NullSpell.create());
		CardList allCards = new CardArrayList();
		allCards.addAll(specificCards);
		allCards.addAll(filteredCards);

		SpellDesc otherSpell;
		// Implements Rohei the Bold
		if (ReceiveCardSpell.class.isAssignableFrom(chosenSpellTemplate.getDescClass())) {
			if (Objects.equals(otherSpellDesc.getDescClass(), NullSpell.class)
					|| AbstractRemoveCardSpell.class.isAssignableFrom(otherSpellDesc.getDescClass())) {
				;
				otherSpell = SpellDesc.join(null, SpellUtils.getBonusesFromAura(context, player.getId(), DiscoverNotSelectedSpellBonusAura.class, source, target));
			} else {
				otherSpell = SpellDesc.join(otherSpellDesc, ReceiveCardSpell.create());
			}
		} else {
			otherSpell = otherSpellDesc;
		}

		if (cannotReceiveOwned) {
			allCards = allCards.stream().filter(c -> !context.getLogic().hasCard(player, c)).collect(java.util.stream.Collectors.toCollection(CardArrayList::new));
		}

		CardList choices = new CardArrayList();
		// Apply the weights
		final boolean isWeighted = cardSource instanceof HasWeights;
		// Compute weights if weighting is implied
		if (isWeighted) {
			final HasWeights weightedSource = (HasWeights) cardSource;
			final Multiset<Card> weightedOptions = LinkedHashMultiset.create();

			final TargetPlayer targetPlayer = cardSource.getTargetPlayer();

			for (Card card : allCards) {
				final int weight;
				switch (targetPlayer) {
					case SELF:
						weight = weightedSource.getWeight(player, card);
						break;
					case OPPONENT:
						weight = weightedSource.getWeight(context.getOpponent(player), card);
						break;
					case ACTIVE:
						weight = weightedSource.getWeight(context.getActivePlayer(), card);
						break;
					case INACTIVE:
						weight = weightedSource.getWeight(context.getOpponent(context.getActivePlayer()), card);
						break;
					case OWNER:
						weight = weightedSource.getWeight(context.getPlayer(source.getOwner()), card);
						break;
					case BOTH:
					default:
						weight = 1;
						break;
				}
				if (weight > 0) {
					weightedOptions.add(card, weight);
				}
			}

			for (int i = 0; i < count; i++) {
				if (weightedOptions.isEmpty()) {
					break;
				}
				Card chosen = context.getLogic().removeRandom(weightedOptions);
				// Remove all appearances of the option, because weighted discovers are always supposed to show distinct choices
				weightedOptions.remove(chosen, Integer.MAX_VALUE);
				choices.add(chosen);
			}
		} else {
			// If the number of cards is greater than can be fit, do a random pick. Otherwise, keep it in the order
			// that was specified
			if (count >= allCards.size()) {
				choices.addAll(allCards);
			} else {
				for (int i = 0; i < count; i++) {
					choices.add(context.getLogic().removeRandom(allCards));
				}
			}
		}

		choices.removeIf(Objects::isNull);

		if (choices.isEmpty()) {
			return;
		}

		List<GameAction> discoverActions = new ArrayList<>();
		Card[] cardsInDiscover = new Card[choices.size()];
		for (int i = 0; i < choices.size(); i++) {
			Card originalCard = choices.get(i);
			Card copy = originalCard.getCopy();
			copy.setId(context.getLogic().generateId());
			copy.setOwner(player.getId());
			copy.moveOrAddTo(context, Zones.DISCOVER);

			// For each discover, it calls the chosenSpell on its card and notChosenSpell on the other cards
			List<SpellDesc> notChosenSpells;
			SpellDesc chosenSpell;
			final Stream<Card> otherCards = Stream.concat(choices.subList(0, i).stream(), choices.subList(i + 1, choices.size()).stream());
			if (exclusive) {
				chosenSpell = chosenSpellTemplate.addArg(SpellArg.TARGET, originalCard.getReference());
				notChosenSpells = otherCards
						.map(Card::getReference)
						.map(cid -> otherSpell.addArg(SpellArg.TARGET, cid)).collect(toList());
			} else {
				chosenSpell = chosenSpellTemplate.addArg(SpellArg.CARD, originalCard.getCardId());
				notChosenSpells = otherCards
						.map(Card::getCardId)
						.map(cid -> otherSpell.addArg(SpellArg.CARD, cid)).collect(toList());
			}

			// Construct the spell. Usually we include the parent
			final SpellDesc[] notChosenSpellsArray = new SpellDesc[notChosenSpells.size()];
			notChosenSpells.toArray(notChosenSpellsArray);
			// TODO: What order should this be in, in order to not leak information about the choice?
			final SpellDesc spell = SpellDesc.join(chosenSpell, notChosenSpellsArray);

			DiscoverAction discover = DiscoverAction.createDiscover(spell);
			discover.setCard(copy);
			discover.setId(i);
			discover.setSourceReference(source != null ? source.getReference() : null);
			discoverActions.add(discover);
			cardsInDiscover[i] = copy;
		}

		Attribute attribute = desc.getAttribute();
		if (attribute != null) {
			for (Card choice : cardsInDiscover) {
				choice.setAttribute(attribute);
			}
		}

		// Execute the discovery (the target is the both the output and the discovery)
		DiscoverAction chosenAction = SpellUtils.postDiscover(context, player, Arrays.asList(cardsInDiscover), discoverActions);
		SpellUtils.castChildSpell(context, player, chosenAction.getSpell(), source, target);
		// Remove the attribute that was set on all the cards
		if (attribute != null) {
			for (Card choice : cardsInDiscover) {
				choice.getAttributes().remove(attribute);
			}
		}
		context.getLogic().discoverCard(player.getId(), chosenAction.getCard());
	}
}

