package net.pferdimanzug.hearthstone.analyzer.gui.simulationmode;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import net.pferdimanzug.hearthstone.analyzer.GameNotification;
import net.pferdimanzug.hearthstone.analyzer.game.decks.Deck;
import net.pferdimanzug.hearthstone.analyzer.game.statistics.Statistic;
import net.pferdimanzug.hearthstone.analyzer.gui.gameconfig.GameConfig;
import net.pferdimanzug.hearthstone.analyzer.utils.Tuple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.pferdimanzug.nittygrittymvc.Mediator;
import de.pferdimanzug.nittygrittymvc.interfaces.INotification;

public class SimulationMediator extends Mediator<GameNotification> {

	public static final String NAME = "SimulationMediator";

	private static Logger logger = LoggerFactory.getLogger(SimulationMediator.class);

	private final SimulationModeConfigView view;
	private final WaitForSimulationView waitView;
	private final SimulationResultView resultView;

	public SimulationMediator() {
		super(NAME);
		view = new SimulationModeConfigView();
		waitView = new WaitForSimulationView();
		resultView = new SimulationResultView();
	}

	@Override
	public void onRegister() {
		getFacade().sendNotification(GameNotification.SHOW_VIEW, view);
		getFacade().sendNotification(GameNotification.REQUEST_DECKS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void handleNotification(final INotification<GameNotification> notification) {
		switch (notification.getId()) {
		case ANSWER_DECKS:
			List<Deck> decks = (List<Deck>) notification.getBody();
			view.injectDecks(decks);
			break;
		case COMMIT_SIMULATIONMODE_CONFIG:
			getFacade().sendNotification(GameNotification.SHOW_MODAL_DIALOG, waitView);
			GameConfig gameConfig = (GameConfig) notification.getBody();
			getFacade().sendNotification(GameNotification.SIMULATE_GAMES, gameConfig);
			break;
		case SIMULATION_PROGRESS_UPDATE:
			Tuple<Integer> progress = (Tuple<Integer>) notification.getBody();
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					waitView.update(progress.getFirst(), progress.getSecond());
				}
			});
			break;
		case SIMULATION_RESULT:
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					waitView.getScene().getWindow().hide();
					SimulationResult result = (SimulationResult) notification.getBody();
					resultView.showSimulationResult(result);
					getFacade().sendNotification(GameNotification.SHOW_VIEW, resultView);
				}
			});
			break;
		default:
			logger.warn("Unhandled notification {} in {}", notification, getClass().getSimpleName());
			break;

		}
	}

	@Override
	public List<GameNotification> listNotificationInterests() {
		List<GameNotification> notificationInterests = new ArrayList<GameNotification>();
		notificationInterests.add(GameNotification.ANSWER_DECKS);
		notificationInterests.add(GameNotification.COMMIT_SIMULATIONMODE_CONFIG);
		notificationInterests.add(GameNotification.SIMULATION_PROGRESS_UPDATE);
		notificationInterests.add(GameNotification.SIMULATION_RESULT);
		return notificationInterests;
	}

}
