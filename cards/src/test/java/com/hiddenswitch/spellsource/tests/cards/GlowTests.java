package com.hiddenswitch.spellsource.tests.cards;

import com.hiddenswitch.spellsource.testutils.CardValidation;
import net.demilich.metastone.game.cards.Attribute;
import net.demilich.metastone.game.cards.CardCatalogue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public class GlowTests extends TestBase {

	@Test
	public void testOpenerCondition() {
		runGym((context, player, opponent) -> {
			var doesNotMeetCondition = receiveCard(context, player, "minion_test_opener_condition");
			assertFalse(context.getLogic().conditionMet(player.getId(), doesNotMeetCondition));
		});

		runGym((context, player, opponent) -> {
			var doesMeetCondition = receiveCard(context, player, "minion_test_opener_condition");
			var onBattlefield = playMinionCard(context, player, 1, 1);
			assertEquals(1L, doesMeetCondition.getDesc().getGlowConditions().count(), "should match at least one");
			assertTrue(context.getLogic().conditionMet(player.getId(), doesMeetCondition));
		});
	}

	@Test
	public void testConditionalSpell() {
		runGym((context, player, opponent) -> {
			var doesNotMeetCondition = receiveCard(context, player, "spell_bloodmoon_ritual");
			assertFalse(context.getLogic().conditionMet(player.getId(), doesNotMeetCondition));

			for (int i = 0; i < 3; i++) {
				playCard(context, player, CardCatalogue.getOneOneNeutralMinionCardId());
			}

			assertFalse(context.getLogic().conditionMet(player.getId(), doesNotMeetCondition));

		});
	}

	@Test
	public void testImbue() {
		runGym((context, player, opponent) -> {
			player.setAttribute(Attribute.IMBUE, 3);
			var doesMeetCondition = receiveCard(context, player, "minion_wise_sage");

			assertTrue(context.getLogic().conditionMet(player.getId(), doesMeetCondition));
		});

		runGym((context, player, opponent) -> {
			player.setAttribute(Attribute.IMBUE, 3);
			var doesMeetCondition = receiveCard(context, player, "spell_celestial_guidance");

			assertTrue(context.getLogic().conditionMet(player.getId(), doesMeetCondition));
		});
	}

	@Test
	public void testNoTargetSelectionOverrides() {
		runGym((context, player, opponent) -> {
			player.setMana(4);
			var doesNotMeetCondition = receiveCard(context, player, "spell_rune_of_banishing");

			assertFalse(context.getLogic().conditionMet(player.getId(), doesNotMeetCondition));

		});
	}
}
