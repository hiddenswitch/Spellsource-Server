package net.pferdimanzug.hearthstone.analyzer.game.entities.heroes;

import net.pferdimanzug.hearthstone.analyzer.game.GameTag;
import net.pferdimanzug.hearthstone.analyzer.game.entities.Actor;
import net.pferdimanzug.hearthstone.analyzer.game.entities.EntityType;
import net.pferdimanzug.hearthstone.analyzer.game.entities.weapons.Weapon;
import net.pferdimanzug.hearthstone.analyzer.game.heroes.powers.HeroPower;

public abstract class Hero extends Actor {

	private final HeroClass heroClass;
	private HeroPower heroPower;
	private Weapon weapon;
	
	public Hero(String name, HeroClass heroClass, HeroPower heroPower) {
		super(null);
		setName(name);
		this.heroClass = heroClass;
		this.setHeroPower(heroPower);
	}

	public void activateWeapon(boolean active) {
		if (weapon != null) {
			weapon.setActive(active);
		}
	}

	@Override
	public Hero clone() {
		Hero clone = (Hero) super.clone();
		if (weapon != null) {
			clone.setWeapon(getWeapon().clone());
		}
		clone.setHeroPower(getHeroPower().clone());
		return clone;
	}
	
	public int getArmor() {
		return getTagValue(GameTag.ARMOR);
	}
	
	@Override
	public int getAttack() {
		int attack = super.getAttack();
		if (weapon != null && weapon.isActive()) {
			attack += weapon.getWeaponDamage();
		}
		return attack;
	}
	
	@Override
	public EntityType getEntityType() {
		return EntityType.HERO;
	}

	public HeroClass getHeroClass() {
		return heroClass;
	}

	public HeroPower getHeroPower() {
		return heroPower;
	}

	public Weapon getWeapon() {
		return weapon;
	}
	
	public void modifyArmor(int armor) {
		// armor cannot fall below zero
		int newArmor = Math.max(getArmor() + armor, 0);
		setTag(GameTag.ARMOR, newArmor);
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
		if (weapon != null) {
			weapon.setOwner(getOwner());
		}
	}

	public void setHeroPower(HeroPower heroPower) {
		this.heroPower = heroPower;
	}
	
}
