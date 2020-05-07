package com.hiddenswitch.spellsource.discordbot.applications;

import com.google.common.collect.Streams;
import com.hiddenswitch.spellsource.client.models.CardType;
import com.hiddenswitch.spellsource.core.JsonConfiguration;
import net.demilich.metastone.game.cards.Card;
import net.demilich.metastone.game.cards.CardArrayList;
import net.demilich.metastone.game.cards.CardCatalogue;
import net.demilich.metastone.game.cards.CardList;
import net.demilich.metastone.game.decks.DeckFormat;
import net.demilich.metastone.game.entities.heroes.HeroClass;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.apache.commons.collections4.ComparatorUtils;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.security.auth.login.LoginException;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static net.dv8tion.jda.api.MessageBuilder.Formatting.ITALICS;
import static net.dv8tion.jda.api.MessageBuilder.Formatting.STRIKETHROUGH;


public class DiscordBot extends ListenerAdapter {
	static {
		JsonConfiguration.configureJson();
		CardCatalogue.loadCardsFromFilesystemDirectories("cards/src/main/resources/cards", "game/src/main/resources/cards");
	}

	final static int MAX_RESULTS = 5;
	final static String CARD_COMMAND_REGEX = "^\\s*![Cc][Aa][Rr][Dd]\\s+(?<nameOrId>.*\\b)\\s*$";
	final static String HELP_COMMAND_REGEX = "^\\s*![Hh][Ee][Ll][Pp]";

	public static void main(String[] args) throws InterruptedException, LoginException {
		var apiKey = System.getenv("DISCORD_BOT_API_KEY");
		var builder = JDABuilder.createLight(apiKey);
		builder.addEventListeners(new DiscordBot())
				.enableIntents(GatewayIntent.GUILD_MESSAGES)
				.disableCache(EnumSet.allOf(CacheFlag.class))
				.setActivity(Activity.playing("Spellsource"));
		var jda = builder.build();
		jda.awaitReady();
	}

	@Override
	public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
		super.onMessageReceived(event);

		if (event.isFromType(ChannelType.TEXT) || event.isFromType(ChannelType.PRIVATE)) {
			String messageContent = event.getMessage().getContentDisplay();
			handleMessage(messageContent, event);
		}

		if (event.getMessage().getMentionedUsers().stream().anyMatch(User::isBot)) {
			event.getMessage().addReaction("❤️").submit();
		}
	}

	public static class Match {
		final Card card;
		final boolean exactMatch;
		final static Comparator<Match> MATCHER = ComparatorUtils.chainedComparator(
				(m1, m2) -> ComparatorUtils.booleanComparator(true).compare(m1.exactMatch, m2.exactMatch),
				(m1, m2) -> ComparatorUtils.booleanComparator(true).compare(m1.card.isCollectible(), m2.card.isCollectible())
		);

		public Match(Card card, boolean exactMatch) {
			this.card = card;
			this.exactMatch = exactMatch;
		}

		public Card getCard() {
			return card;
		}

		public boolean isExactMatch() {
			return exactMatch;
		}
	}

	public static Message handleMessage(String messageContent, MessageReceivedEvent event) {
		Message response = null;
		Matcher cardCommandMatcher = Pattern.compile(CARD_COMMAND_REGEX).matcher(messageContent);
		MessageBuilder messageBuilder = new MessageBuilder();

		if (cardCommandMatcher.find()) {
			if (event != null) {
				messageBuilder.append(event.getAuthor().getAsMention());
			}

			var nameOrId = cardCommandMatcher.group("nameOrId").trim();

			var cards = search(nameOrId);

			if (cards.isEmpty()) {
				messageBuilder.append(" Sorry, I couldn't find anything close to a card with name or ID \"").append(nameOrId).append("\"");
			} else {
				if (cards.get(0).exactMatch) {
					messageBuilder.append(" Here you go: ");
				} else {
					messageBuilder.append(" I couldn't find an exact match, but it could be: ");
				}

				for (var match : cards) {
					sayCard(match.card, messageBuilder);

					// i.e. join
					if (cards.size() > 1) {
						messageBuilder.append("\n");
					}
				}

				if (cards.size() > MAX_RESULTS) {
					messageBuilder.append("\n(Capped at 5 results)");
				}
			}

			response = messageBuilder.build();
		} else if (messageContent.matches(HELP_COMMAND_REGEX)) {
			if (event != null) {
				messageBuilder.append(event.getAuthor().getAsMention());
			}

			messageBuilder.append(" Currently my only command is the `!card` command.\n");
			messageBuilder.append("Put it at the start of your message followed by the name or id of a card.\n");
			messageBuilder.append("If it matches a card, I'll give you its information.\n");
			messageBuilder.append("(An ");
			messageBuilder.append("italicized", ITALICS);
			messageBuilder.append(" card name means it's uncollectible, and ");
			messageBuilder.append("strikethrough", STRIKETHROUGH);
			messageBuilder.append(" means it's from an uncollectible class).\n");
			response = messageBuilder.build();
		}

		if (event != null && response != null) {
			event.getChannel().sendMessage(response).submit();
			System.gc();
		}
		return response;
	}

	@NotNull
	public static List<Match> search(String nameOrId) {
		return Streams.concat(
				// Exact match
				Stream.ofNullable(CardCatalogue.getCards().get(nameOrId)),
				CardCatalogue.getCards()
						.values()
						.stream()
						.filter(c -> c.getName().equalsIgnoreCase(nameOrId) && c.isCollectible())
						.limit(1L)).map(c -> new Match(c, true))
				.findFirst().map(Collections::singletonList).orElse(
						// Partial Match
						Streams.concat(
								CardCatalogue.getCards().values().stream()
										.filter(c -> c.getName().toLowerCase().startsWith(nameOrId.toLowerCase())),
								CardCatalogue.getCards().values().stream()
										.filter(c -> c.getName().toLowerCase().contains(nameOrId.toLowerCase()))
						).map(c -> new Match(c, false))
								.sorted(Match.MATCHER)
								.limit(MAX_RESULTS + 1)
								.collect(Collectors.toList()));
	}

	public static void sayCard(Card card, MessageBuilder messageBuilder) {
		messageBuilder.append("\n");

		boolean cardCollectible = card.isCollectible();
		boolean classCollectible = HeroClass.getClassCard(card.getHeroClass()) == null ||
				HeroClass.getClassCard(card.getHeroClass()).isCollectible();
		if (!cardCollectible && !classCollectible) {
			messageBuilder.append(card.getName(), STRIKETHROUGH, ITALICS);
		} else if (!cardCollectible) {
			messageBuilder.append(card.getName(), ITALICS);
		} else if (!classCollectible) {
			messageBuilder.append(card.getName(), STRIKETHROUGH);
		} else {
			messageBuilder.append(card.getName());
		}

		messageBuilder.append(" - ").append(stringify(card));
	}


	public static String stringify(Card card) {
		StringBuilder builder = new StringBuilder();
		builder.append(card.getBaseManaCost()).append(" Cost ");
		if (card.getCardType() == CardType.MINION) {
			builder.append(card.getBaseAttack()).append("/").append(card.getBaseHp()).append(" ");
		}
		builder.append(card.getRarity().toString()).append(" ");
		builder.append(card.getHeroClass()).append(" (");
		if (card.getHeroClass().equalsIgnoreCase(HeroClass.ANY)) {
			builder.append("Neutral) ");
		} else builder.append(HeroClass.getClassCard(card.getHeroClass()).getName()).append(") ");
		builder.append(card.getCardType().toString()).append(" ");
		if (!card.getDescription().equals("")) {
			builder.append("\"").append(card.getDescription().replace("#", "").replace("$", "")
					.replace("[", "").replace("]", "").trim()).append("\"");
		}
		return builder.toString();
	}
}
