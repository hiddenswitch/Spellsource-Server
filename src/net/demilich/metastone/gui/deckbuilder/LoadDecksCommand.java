package net.demilich.metastone.gui.deckbuilder;

import java.io.FileNotFoundException;

import de.pferdimanzug.nittygrittymvc.SimpleCommand;
import de.pferdimanzug.nittygrittymvc.interfaces.INotification;
import net.demilich.metastone.GameNotification;

public class LoadDecksCommand extends SimpleCommand<GameNotification> {

	@Override
	public void execute(INotification<GameNotification> notification) {
		DeckProxy deckProxy = (DeckProxy) getFacade().retrieveProxy(DeckProxy.NAME);

		try {
			deckProxy.loadDecks();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		getFacade().sendNotification(GameNotification.DECKS_LOADED, deckProxy.getDecks());
	}

}
