package net.pferdimanzug.hearthstone.analyzer.gui.playmode;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;

public class MinionToken extends GameToken {
	@FXML
	private Label name;
	@FXML
	private Group attackAnchor;
	@FXML
	private Group hpAnchor;
	
	@FXML
	private Node defaultToken;
	@FXML
	private Node divineShield;
	@FXML
	private Node taunt;
	@FXML
	private Node windfury;
	@FXML
	private Node deathrattle;
	
	public MinionToken() {
		super("MinionToken.fxml");
	}

	public void setMinion(Minion minion) {
		name.setText(minion.getName());
		setScoreValue(attackAnchor, minion.getAttack(), minion.getTagValue(GameTag.BASE_ATTACK));
		Color color = Color.WHITE;
		if (minion.getHp() < minion.getMaxHp()) {
			color = Color.RED;
		} else if (minion.getHp() > minion.getTagValue(GameTag.BASE_HP)) {
			color = Color.GREEN;
		}
		usePreRenderedDigits(hpAnchor, minion.getHp(), color);
		visualizeStatus(minion);
	}
	
	private void visualizeStatus(Minion minion) {
		taunt.setVisible(minion.hasStatus(GameTag.TAUNT));
		defaultToken.setVisible(!minion.hasStatus(GameTag.TAUNT));
		divineShield.setVisible(minion.hasStatus(GameTag.DIVINE_SHIELD));
		windfury.setVisible(minion.hasStatus(GameTag.WINDFURY));
		deathrattle.setVisible(minion.hasTag(GameTag.DEATHRATTLES));
		visualizeStealth(minion);
	}
	
	private void visualizeStealth(Minion minion) {
		Node token = minion.hasStatus(GameTag.TAUNT) ? taunt : defaultToken;
		token.setOpacity(minion.hasStatus(GameTag.STEALTHED) ? 0.5 : 1);
	}

}


