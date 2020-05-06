package com.hiddenswitch.spellsource.discordbot;

import com.hiddenswitch.spellsource.discordbot.applications.DiscordBot;
import net.demilich.metastone.game.cards.CardCatalogue;
import net.dv8tion.jda.api.entities.Message;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTests {

	@BeforeAll
	public static void init() {
		CardCatalogue.loadAllCards();
	}

	@Test
	public void testHelpCommand() {
		Message response = DiscordBot.handleMessage("!help", null);

		assertNotNull(response);
		assertNotEquals("", response.getContentRaw());
	}

	@Test
	public void testSingleCard() {
		Message response = DiscordBot.handleMessage("!card soar", null);

		assertNotNull(response);
		assertTrue(response.getContentRaw().contains(DiscordBot.stringify(CardCatalogue.getCardById("spell_soar"))));
	}

	@Test
	public void testMultipleCards() {
		Message response = DiscordBot.handleMessage("!card devour", null);

		assertNotNull(response);
		assertTrue(response.getContentRaw().contains(DiscordBot.stringify(CardCatalogue.getCardById("spell_devour"))));
		assertTrue(response.getContentRaw().contains(DiscordBot.stringify(CardCatalogue.getCardById("spell_dominus_discard"))));
		assertTrue(response.getContentRaw().contains(DiscordBot.stringify(CardCatalogue.getCardById("hero_power_devour"))));
	}

	@Test
	public void testNonExactCards() {
		Message response = DiscordBot.handleMessage("!card paven", null);

		assertNotNull(response);
		assertTrue(response.getContentRaw().contains(DiscordBot.stringify(CardCatalogue.getCardById("minion_paven_elemental_of_surprise"))));

	}

}
