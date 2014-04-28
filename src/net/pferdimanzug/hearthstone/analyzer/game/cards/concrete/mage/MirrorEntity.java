package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage;

import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.cards.SecretCard;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.spells.CopyMinionSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.Spell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.secrets.MinionSummonedTrigger;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.secrets.TargetMinionSecret;

public class MirrorEntity extends SecretCard {

	public MirrorEntity() {
		super("Mirror Entity", Rarity.COMMON, HeroClass.MAGE, 3);
		setDescription("Secret: When your opponent plays a minion, summon a copy of it.");
		
		Spell copySpell = new CopyMinionSpell();
		setSecret(new TargetMinionSecret(new MinionSummonedTrigger(), copySpell, this));
	}

}
