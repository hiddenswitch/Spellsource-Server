/**
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.hiddenswitch.spellsource.client.models.EntityLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The entity state contains all the mutable values of an entity. In the future, the server will provide a list of exact changes to this state. 
 */
@ApiModel(description = "The entity state contains all the mutable values of an entity. In the future, the server will provide a list of exact changes to this state. ")

public class EntityState  implements Serializable {
  @SerializedName("location")
  private EntityLocation location = null;

  @SerializedName("background")
  private String background = null;

  @SerializedName("portrait")
  private String portrait = null;

  @SerializedName("gold")
  private Boolean gold = null;

  @SerializedName("boardPosition")
  private Integer boardPosition = null;

  @SerializedName("owner")
  private Integer owner = null;

  @SerializedName("heroClass")
  private String heroClass = null;

  @SerializedName("baseHp")
  private Integer baseHp = null;

  @SerializedName("hp")
  private Integer hp = null;

  @SerializedName("durability")
  private Integer durability = null;

  @SerializedName("maxHp")
  private Integer maxHp = null;

  @SerializedName("baseAttack")
  private Integer baseAttack = null;

  @SerializedName("attack")
  private Integer attack = null;

  @SerializedName("baseManaCost")
  private Integer baseManaCost = null;

  @SerializedName("manaCost")
  private Integer manaCost = null;

  @SerializedName("armor")
  private Integer armor = null;

  @SerializedName("destroyed")
  private Boolean destroyed = null;

  @SerializedName("summoningSickness")
  private Boolean summoningSickness = null;

  @SerializedName("frozen")
  private Boolean frozen = null;

  @SerializedName("silenced")
  private Boolean silenced = null;

  @SerializedName("windfury")
  private Boolean windfury = null;

  @SerializedName("permanent")
  private Boolean permanent = null;

  @SerializedName("taunt")
  private Boolean taunt = null;

  @SerializedName("spellDamage")
  private Integer spellDamage = null;

  @SerializedName("charge")
  private Boolean charge = null;

  @SerializedName("enraged")
  private Boolean enraged = null;

  @SerializedName("battlecry")
  private Boolean battlecry = null;

  @SerializedName("deathrattles")
  private Boolean deathrattles = null;

  @SerializedName("immune")
  private Boolean immune = null;

  @SerializedName("divineShield")
  private Boolean divineShield = null;

  @SerializedName("stealth")
  private Boolean stealth = null;

  @SerializedName("combo")
  private Boolean combo = null;

  @SerializedName("overload")
  private Integer overload = null;

  @SerializedName("chooseOne")
  private Boolean chooseOne = null;

  @SerializedName("untargetableBySpells")
  private Boolean untargetableBySpells = null;

  @SerializedName("cannotAttack")
  private Boolean cannotAttack = null;

  @SerializedName("underAura")
  private Boolean underAura = null;

  @SerializedName("customRenderer")
  private String customRenderer = null;

  @SerializedName("customData")
  private String customData = null;

  @SerializedName("playable")
  private Boolean playable = null;

  @SerializedName("mana")
  private Integer mana = null;

  @SerializedName("maxMana")
  private Integer maxMana = null;

  @SerializedName("lockedMana")
  private Integer lockedMana = null;

  @SerializedName("hostsTrigger")
  private Boolean hostsTrigger = null;

  @SerializedName("note")
  private String note = null;

  /**
   * When not null, indicates this card entity has a specified type.
   */
  public enum CardTypeEnum {
    @SerializedName("HERO")
    HERO("HERO"),
    
    @SerializedName("MINION")
    MINION("MINION"),
    
    @SerializedName("SPELL")
    SPELL("SPELL"),
    
    @SerializedName("WEAPON")
    WEAPON("WEAPON"),
    
    @SerializedName("HERO_POWER")
    HERO_POWER("HERO_POWER"),
    
    @SerializedName("CHOOSE_ONE")
    CHOOSE_ONE("CHOOSE_ONE");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cardType")
  private CardTypeEnum cardType = null;

  @SerializedName("tribe")
  private String tribe = null;

  public EntityState location(EntityLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityLocation getLocation() {
    return location;
  }

  public void setLocation(EntityLocation location) {
    this.location = location;
  }

  public EntityState background(String background) {
    this.background = background;
    return this;
  }

   /**
   * When not null, override the default background for this entity's card ID with this key corresponding to backgrounds from the server. 
   * @return background
  **/
  @ApiModelProperty(example = "null", value = "When not null, override the default background for this entity's card ID with this key corresponding to backgrounds from the server. ")
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  public EntityState portrait(String portrait) {
    this.portrait = portrait;
    return this;
  }

   /**
   * When not null, override the default portrait for this entity's card ID with this key corresponding to portraits from the server. 
   * @return portrait
  **/
  @ApiModelProperty(example = "null", value = "When not null, override the default portrait for this entity's card ID with this key corresponding to portraits from the server. ")
  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }

  public EntityState gold(Boolean gold) {
    this.gold = gold;
    return this;
  }

   /**
   * Render this entity with a \"gold\" effect.
   * @return gold
  **/
  @ApiModelProperty(example = "null", value = "Render this entity with a \"gold\" effect.")
  public Boolean getGold() {
    return gold;
  }

  public void setGold(Boolean gold) {
    this.gold = gold;
  }

  public EntityState boardPosition(Integer boardPosition) {
    this.boardPosition = boardPosition;
    return this;
  }

   /**
   * The index of the entity in its zone.
   * @return boardPosition
  **/
  @ApiModelProperty(example = "null", value = "The index of the entity in its zone.")
  public Integer getBoardPosition() {
    return boardPosition;
  }

  public void setBoardPosition(Integer boardPosition) {
    this.boardPosition = boardPosition;
  }

  public EntityState owner(Integer owner) {
    this.owner = owner;
    return this;
  }

   /**
   * An integer corresponding to the entity's owner.
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "An integer corresponding to the entity's owner.")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public EntityState heroClass(String heroClass) {
    this.heroClass = heroClass;
    return this;
  }

   /**
   * The string enum value that corresponds to this entity's hero class.
   * @return heroClass
  **/
  @ApiModelProperty(example = "null", value = "The string enum value that corresponds to this entity's hero class.")
  public String getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(String heroClass) {
    this.heroClass = heroClass;
  }

  public EntityState baseHp(Integer baseHp) {
    this.baseHp = baseHp;
    return this;
  }

   /**
   * The base hitpoints of the entity.
   * @return baseHp
  **/
  @ApiModelProperty(example = "null", value = "The base hitpoints of the entity.")
  public Integer getBaseHp() {
    return baseHp;
  }

  public void setBaseHp(Integer baseHp) {
    this.baseHp = baseHp;
  }

  public EntityState hp(Integer hp) {
    this.hp = hp;
    return this;
  }

   /**
   * The current hitpoints of the entity. Conventionally, this value should be rendered on the hitpoints token. 
   * @return hp
  **/
  @ApiModelProperty(example = "null", value = "The current hitpoints of the entity. Conventionally, this value should be rendered on the hitpoints token. ")
  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public EntityState durability(Integer durability) {
    this.durability = durability;
    return this;
  }

   /**
   * The durability (number of uses) that the weapon still has.
   * @return durability
  **/
  @ApiModelProperty(example = "null", value = "The durability (number of uses) that the weapon still has.")
  public Integer getDurability() {
    return durability;
  }

  public void setDurability(Integer durability) {
    this.durability = durability;
  }

  public EntityState maxHp(Integer maxHp) {
    this.maxHp = maxHp;
    return this;
  }

   /**
   * The maximum number of hitpoints this entity can have.
   * @return maxHp
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of hitpoints this entity can have.")
  public Integer getMaxHp() {
    return maxHp;
  }

  public void setMaxHp(Integer maxHp) {
    this.maxHp = maxHp;
  }

  public EntityState baseAttack(Integer baseAttack) {
    this.baseAttack = baseAttack;
    return this;
  }

   /**
   * The entity's base attack value.
   * @return baseAttack
  **/
  @ApiModelProperty(example = "null", value = "The entity's base attack value.")
  public Integer getBaseAttack() {
    return baseAttack;
  }

  public void setBaseAttack(Integer baseAttack) {
    this.baseAttack = baseAttack;
  }

  public EntityState attack(Integer attack) {
    this.attack = attack;
    return this;
  }

   /**
   * The entity's current attack value. Conventionally, this value should be rendered on the attack token. 
   * @return attack
  **/
  @ApiModelProperty(example = "null", value = "The entity's current attack value. Conventionally, this value should be rendered on the attack token. ")
  public Integer getAttack() {
    return attack;
  }

  public void setAttack(Integer attack) {
    this.attack = attack;
  }

  public EntityState baseManaCost(Integer baseManaCost) {
    this.baseManaCost = baseManaCost;
    return this;
  }

   /**
   * The entity's base mana cost. 
   * @return baseManaCost
  **/
  @ApiModelProperty(example = "null", value = "The entity's base mana cost. ")
  public Integer getBaseManaCost() {
    return baseManaCost;
  }

  public void setBaseManaCost(Integer baseManaCost) {
    this.baseManaCost = baseManaCost;
  }

  public EntityState manaCost(Integer manaCost) {
    this.manaCost = manaCost;
    return this;
  }

   /**
   * The entity's current mana cost. Conventionally, this value should be rendered on the mana token. 
   * @return manaCost
  **/
  @ApiModelProperty(example = "null", value = "The entity's current mana cost. Conventionally, this value should be rendered on the mana token. ")
  public Integer getManaCost() {
    return manaCost;
  }

  public void setManaCost(Integer manaCost) {
    this.manaCost = manaCost;
  }

  public EntityState armor(Integer armor) {
    this.armor = armor;
    return this;
  }

   /**
   * The entity's armor. Conventionally, this value should be rendered on a hero entity's armor token. 
   * @return armor
  **/
  @ApiModelProperty(example = "null", value = "The entity's armor. Conventionally, this value should be rendered on a hero entity's armor token. ")
  public Integer getArmor() {
    return armor;
  }

  public void setArmor(Integer armor) {
    this.armor = armor;
  }

  public EntityState destroyed(Boolean destroyed) {
    this.destroyed = destroyed;
    return this;
  }

   /**
   * When true, indicates that this entity is destroyed. During event evaluation, an entity can be destroyed but still in a zone other than the graveyard; render a death icon over the entity when it is so marked. 
   * @return destroyed
  **/
  @ApiModelProperty(example = "null", value = "When true, indicates that this entity is destroyed. During event evaluation, an entity can be destroyed but still in a zone other than the graveyard; render a death icon over the entity when it is so marked. ")
  public Boolean getDestroyed() {
    return destroyed;
  }

  public void setDestroyed(Boolean destroyed) {
    this.destroyed = destroyed;
  }

  public EntityState summoningSickness(Boolean summoningSickness) {
    this.summoningSickness = summoningSickness;
    return this;
  }

   /**
   * When true, the entity cannot attack this turn because it has \"summoning sickness,\" or a disability related to the first turn the entity came into play. Typically rendered with snooze icons. 
   * @return summoningSickness
  **/
  @ApiModelProperty(example = "null", value = "When true, the entity cannot attack this turn because it has \"summoning sickness,\" or a disability related to the first turn the entity came into play. Typically rendered with snooze icons. ")
  public Boolean getSummoningSickness() {
    return summoningSickness;
  }

  public void setSummoningSickness(Boolean summoningSickness) {
    this.summoningSickness = summoningSickness;
  }

  public EntityState frozen(Boolean frozen) {
    this.frozen = frozen;
    return this;
  }

   /**
   * When true, the entity cannot attack because a spell casted on it prevents it so, until the next turn when it would normally be able to attack. 
   * @return frozen
  **/
  @ApiModelProperty(example = "null", value = "When true, the entity cannot attack because a spell casted on it prevents it so, until the next turn when it would normally be able to attack. ")
  public Boolean getFrozen() {
    return frozen;
  }

  public void setFrozen(Boolean frozen) {
    this.frozen = frozen;
  }

  public EntityState silenced(Boolean silenced) {
    this.silenced = silenced;
    return this;
  }

   /**
   * Indicates that the entity was silenced. 
   * @return silenced
  **/
  @ApiModelProperty(example = "null", value = "Indicates that the entity was silenced. ")
  public Boolean getSilenced() {
    return silenced;
  }

  public void setSilenced(Boolean silenced) {
    this.silenced = silenced;
  }

  public EntityState windfury(Boolean windfury) {
    this.windfury = windfury;
    return this;
  }

   /**
   * Indicates the entity can attack twice a turn. 
   * @return windfury
  **/
  @ApiModelProperty(example = "null", value = "Indicates the entity can attack twice a turn. ")
  public Boolean getWindfury() {
    return windfury;
  }

  public void setWindfury(Boolean windfury) {
    this.windfury = windfury;
  }

  public EntityState permanent(Boolean permanent) {
    this.permanent = permanent;
    return this;
  }

   /**
   * Indicates the entity is an on-battlefield permanent. 
   * @return permanent
  **/
  @ApiModelProperty(example = "null", value = "Indicates the entity is an on-battlefield permanent. ")
  public Boolean getPermanent() {
    return permanent;
  }

  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }

  public EntityState taunt(Boolean taunt) {
    this.taunt = taunt;
    return this;
  }

   /**
   * Indicates the entity and other taunt entities must be targeted by enemy actors first during an opponent's physical attack action targeting. 
   * @return taunt
  **/
  @ApiModelProperty(example = "null", value = "Indicates the entity and other taunt entities must be targeted by enemy actors first during an opponent's physical attack action targeting. ")
  public Boolean getTaunt() {
    return taunt;
  }

  public void setTaunt(Boolean taunt) {
    this.taunt = taunt;
  }

  public EntityState spellDamage(Integer spellDamage) {
    this.spellDamage = spellDamage;
    return this;
  }

   /**
   * Indicates the amount of additional spell damage this entity gives its owning player. 
   * @return spellDamage
  **/
  @ApiModelProperty(example = "null", value = "Indicates the amount of additional spell damage this entity gives its owning player. ")
  public Integer getSpellDamage() {
    return spellDamage;
  }

  public void setSpellDamage(Integer spellDamage) {
    this.spellDamage = spellDamage;
  }

  public EntityState charge(Boolean charge) {
    this.charge = charge;
    return this;
  }

   /**
   * When true, the entity can attack the same turn it is summoned. 
   * @return charge
  **/
  @ApiModelProperty(example = "null", value = "When true, the entity can attack the same turn it is summoned. ")
  public Boolean getCharge() {
    return charge;
  }

  public void setCharge(Boolean charge) {
    this.charge = charge;
  }

  public EntityState enraged(Boolean enraged) {
    this.enraged = enraged;
    return this;
  }

   /**
   * When true, this entity is under the influence of \"enrage,\" or a bonus when it takes damage the first time. 
   * @return enraged
  **/
  @ApiModelProperty(example = "null", value = "When true, this entity is under the influence of \"enrage,\" or a bonus when it takes damage the first time. ")
  public Boolean getEnraged() {
    return enraged;
  }

  public void setEnraged(Boolean enraged) {
    this.enraged = enraged;
  }

  public EntityState battlecry(Boolean battlecry) {
    this.battlecry = battlecry;
    return this;
  }

   /**
   * When true, this entity has an effect that gets triggered when it is played from the hand. 
   * @return battlecry
  **/
  @ApiModelProperty(example = "null", value = "When true, this entity has an effect that gets triggered when it is played from the hand. ")
  public Boolean getBattlecry() {
    return battlecry;
  }

  public void setBattlecry(Boolean battlecry) {
    this.battlecry = battlecry;
  }

  public EntityState deathrattles(Boolean deathrattles) {
    this.deathrattles = deathrattles;
    return this;
  }

   /**
   * When true, this entity has an effect that gets triggered when it is destroyed. 
   * @return deathrattles
  **/
  @ApiModelProperty(example = "null", value = "When true, this entity has an effect that gets triggered when it is destroyed. ")
  public Boolean getDeathrattles() {
    return deathrattles;
  }

  public void setDeathrattles(Boolean deathrattles) {
    this.deathrattles = deathrattles;
  }

  public EntityState immune(Boolean immune) {
    this.immune = immune;
    return this;
  }

   /**
   * Indicates the entity does not take damage. 
   * @return immune
  **/
  @ApiModelProperty(example = "null", value = "Indicates the entity does not take damage. ")
  public Boolean getImmune() {
    return immune;
  }

  public void setImmune(Boolean immune) {
    this.immune = immune;
  }

  public EntityState divineShield(Boolean divineShield) {
    this.divineShield = divineShield;
    return this;
  }

   /**
   * When true, the entity will take no loss in hitpoints the first time it would ordinarily take damage. 
   * @return divineShield
  **/
  @ApiModelProperty(example = "null", value = "When true, the entity will take no loss in hitpoints the first time it would ordinarily take damage. ")
  public Boolean getDivineShield() {
    return divineShield;
  }

  public void setDivineShield(Boolean divineShield) {
    this.divineShield = divineShield;
  }

  public EntityState stealth(Boolean stealth) {
    this.stealth = stealth;
    return this;
  }

   /**
   * When true, the minion cannot be targeted by the opponent until the entity attacks for the first time. 
   * @return stealth
  **/
  @ApiModelProperty(example = "null", value = "When true, the minion cannot be targeted by the opponent until the entity attacks for the first time. ")
  public Boolean getStealth() {
    return stealth;
  }

  public void setStealth(Boolean stealth) {
    this.stealth = stealth;
  }

  public EntityState combo(Boolean combo) {
    this.combo = combo;
    return this;
  }

   /**
   * Indicates this minion has a combo effect. 
   * @return combo
  **/
  @ApiModelProperty(example = "null", value = "Indicates this minion has a combo effect. ")
  public Boolean getCombo() {
    return combo;
  }

  public void setCombo(Boolean combo) {
    this.combo = combo;
  }

  public EntityState overload(Integer overload) {
    this.overload = overload;
    return this;
  }

   /**
   * Indicates the amount of mana that would be locked if this card were played. 
   * @return overload
  **/
  @ApiModelProperty(example = "null", value = "Indicates the amount of mana that would be locked if this card were played. ")
  public Integer getOverload() {
    return overload;
  }

  public void setOverload(Integer overload) {
    this.overload = overload;
  }

  public EntityState chooseOne(Boolean chooseOne) {
    this.chooseOne = chooseOne;
    return this;
  }

   /**
   * Indicates this card has a choose-one effect. 
   * @return chooseOne
  **/
  @ApiModelProperty(example = "null", value = "Indicates this card has a choose-one effect. ")
  public Boolean getChooseOne() {
    return chooseOne;
  }

  public void setChooseOne(Boolean chooseOne) {
    this.chooseOne = chooseOne;
  }

  public EntityState untargetableBySpells(Boolean untargetableBySpells) {
    this.untargetableBySpells = untargetableBySpells;
    return this;
  }

   /**
   * Indicates this entity cannot be targeted by spells. 
   * @return untargetableBySpells
  **/
  @ApiModelProperty(example = "null", value = "Indicates this entity cannot be targeted by spells. ")
  public Boolean getUntargetableBySpells() {
    return untargetableBySpells;
  }

  public void setUntargetableBySpells(Boolean untargetableBySpells) {
    this.untargetableBySpells = untargetableBySpells;
  }

  public EntityState cannotAttack(Boolean cannotAttack) {
    this.cannotAttack = cannotAttack;
    return this;
  }

   /**
   * When true, indicates this minion cannot attack, even though it normally can.
   * @return cannotAttack
  **/
  @ApiModelProperty(example = "null", value = "When true, indicates this minion cannot attack, even though it normally can.")
  public Boolean getCannotAttack() {
    return cannotAttack;
  }

  public void setCannotAttack(Boolean cannotAttack) {
    this.cannotAttack = cannotAttack;
  }

  public EntityState underAura(Boolean underAura) {
    this.underAura = underAura;
    return this;
  }

   /**
   * When true, indicates this minion is benefiting from the aura of another effect.
   * @return underAura
  **/
  @ApiModelProperty(example = "null", value = "When true, indicates this minion is benefiting from the aura of another effect.")
  public Boolean getUnderAura() {
    return underAura;
  }

  public void setUnderAura(Boolean underAura) {
    this.underAura = underAura;
  }

  public EntityState customRenderer(String customRenderer) {
    this.customRenderer = customRenderer;
    return this;
  }

   /**
   * Get customRenderer
   * @return customRenderer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomRenderer() {
    return customRenderer;
  }

  public void setCustomRenderer(String customRenderer) {
    this.customRenderer = customRenderer;
  }

  public EntityState customData(String customData) {
    this.customData = customData;
    return this;
  }

   /**
   * Get customData
   * @return customData
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomData() {
    return customData;
  }

  public void setCustomData(String customData) {
    this.customData = customData;
  }

  public EntityState playable(Boolean playable) {
    this.playable = playable;
    return this;
  }

   /**
   * When true, indicates the card can be played, or the hero / minion can initiate a physical attack.
   * @return playable
  **/
  @ApiModelProperty(example = "null", value = "When true, indicates the card can be played, or the hero / minion can initiate a physical attack.")
  public Boolean getPlayable() {
    return playable;
  }

  public void setPlayable(Boolean playable) {
    this.playable = playable;
  }

  public EntityState mana(Integer mana) {
    this.mana = mana;
    return this;
  }

   /**
   * The player's current mana.
   * @return mana
  **/
  @ApiModelProperty(example = "null", value = "The player's current mana.")
  public Integer getMana() {
    return mana;
  }

  public void setMana(Integer mana) {
    this.mana = mana;
  }

  public EntityState maxMana(Integer maxMana) {
    this.maxMana = maxMana;
    return this;
  }

   /**
   * The player's maximum amount of mana.
   * @return maxMana
  **/
  @ApiModelProperty(example = "null", value = "The player's maximum amount of mana.")
  public Integer getMaxMana() {
    return maxMana;
  }

  public void setMaxMana(Integer maxMana) {
    this.maxMana = maxMana;
  }

  public EntityState lockedMana(Integer lockedMana) {
    this.lockedMana = lockedMana;
    return this;
  }

   /**
   * The amount of mana that was locked due to overload.
   * @return lockedMana
  **/
  @ApiModelProperty(example = "null", value = "The amount of mana that was locked due to overload.")
  public Integer getLockedMana() {
    return lockedMana;
  }

  public void setLockedMana(Integer lockedMana) {
    this.lockedMana = lockedMana;
  }

  public EntityState hostsTrigger(Boolean hostsTrigger) {
    this.hostsTrigger = hostsTrigger;
    return this;
  }

   /**
   * When true, indicates this entity has an effect that triggers on game events.
   * @return hostsTrigger
  **/
  @ApiModelProperty(example = "null", value = "When true, indicates this entity has an effect that triggers on game events.")
  public Boolean getHostsTrigger() {
    return hostsTrigger;
  }

  public void setHostsTrigger(Boolean hostsTrigger) {
    this.hostsTrigger = hostsTrigger;
  }

  public EntityState note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A renderable note attached to this entity.
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "A renderable note attached to this entity.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public EntityState cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * When not null, indicates this card entity has a specified type.
   * @return cardType
  **/
  @ApiModelProperty(example = "null", value = "When not null, indicates this card entity has a specified type.")
  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public EntityState tribe(String tribe) {
    this.tribe = tribe;
    return this;
  }

   /**
   * When not null, indicates the card's tribe/race. Typically only minions have this field set.
   * @return tribe
  **/
  @ApiModelProperty(example = "null", value = "When not null, indicates the card's tribe/race. Typically only minions have this field set.")
  public String getTribe() {
    return tribe;
  }

  public void setTribe(String tribe) {
    this.tribe = tribe;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityState entityState = (EntityState) o;
    return Objects.equals(this.location, entityState.location) &&
        Objects.equals(this.background, entityState.background) &&
        Objects.equals(this.portrait, entityState.portrait) &&
        Objects.equals(this.gold, entityState.gold) &&
        Objects.equals(this.boardPosition, entityState.boardPosition) &&
        Objects.equals(this.owner, entityState.owner) &&
        Objects.equals(this.heroClass, entityState.heroClass) &&
        Objects.equals(this.baseHp, entityState.baseHp) &&
        Objects.equals(this.hp, entityState.hp) &&
        Objects.equals(this.durability, entityState.durability) &&
        Objects.equals(this.maxHp, entityState.maxHp) &&
        Objects.equals(this.baseAttack, entityState.baseAttack) &&
        Objects.equals(this.attack, entityState.attack) &&
        Objects.equals(this.baseManaCost, entityState.baseManaCost) &&
        Objects.equals(this.manaCost, entityState.manaCost) &&
        Objects.equals(this.armor, entityState.armor) &&
        Objects.equals(this.destroyed, entityState.destroyed) &&
        Objects.equals(this.summoningSickness, entityState.summoningSickness) &&
        Objects.equals(this.frozen, entityState.frozen) &&
        Objects.equals(this.silenced, entityState.silenced) &&
        Objects.equals(this.windfury, entityState.windfury) &&
        Objects.equals(this.permanent, entityState.permanent) &&
        Objects.equals(this.taunt, entityState.taunt) &&
        Objects.equals(this.spellDamage, entityState.spellDamage) &&
        Objects.equals(this.charge, entityState.charge) &&
        Objects.equals(this.enraged, entityState.enraged) &&
        Objects.equals(this.battlecry, entityState.battlecry) &&
        Objects.equals(this.deathrattles, entityState.deathrattles) &&
        Objects.equals(this.immune, entityState.immune) &&
        Objects.equals(this.divineShield, entityState.divineShield) &&
        Objects.equals(this.stealth, entityState.stealth) &&
        Objects.equals(this.combo, entityState.combo) &&
        Objects.equals(this.overload, entityState.overload) &&
        Objects.equals(this.chooseOne, entityState.chooseOne) &&
        Objects.equals(this.untargetableBySpells, entityState.untargetableBySpells) &&
        Objects.equals(this.cannotAttack, entityState.cannotAttack) &&
        Objects.equals(this.underAura, entityState.underAura) &&
        Objects.equals(this.customRenderer, entityState.customRenderer) &&
        Objects.equals(this.customData, entityState.customData) &&
        Objects.equals(this.playable, entityState.playable) &&
        Objects.equals(this.mana, entityState.mana) &&
        Objects.equals(this.maxMana, entityState.maxMana) &&
        Objects.equals(this.lockedMana, entityState.lockedMana) &&
        Objects.equals(this.hostsTrigger, entityState.hostsTrigger) &&
        Objects.equals(this.note, entityState.note) &&
        Objects.equals(this.cardType, entityState.cardType) &&
        Objects.equals(this.tribe, entityState.tribe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, background, portrait, gold, boardPosition, owner, heroClass, baseHp, hp, durability, maxHp, baseAttack, attack, baseManaCost, manaCost, armor, destroyed, summoningSickness, frozen, silenced, windfury, permanent, taunt, spellDamage, charge, enraged, battlecry, deathrattles, immune, divineShield, stealth, combo, overload, chooseOne, untargetableBySpells, cannotAttack, underAura, customRenderer, customData, playable, mana, maxMana, lockedMana, hostsTrigger, note, cardType, tribe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityState {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
    sb.append("    gold: ").append(toIndentedString(gold)).append("\n");
    sb.append("    boardPosition: ").append(toIndentedString(boardPosition)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    heroClass: ").append(toIndentedString(heroClass)).append("\n");
    sb.append("    baseHp: ").append(toIndentedString(baseHp)).append("\n");
    sb.append("    hp: ").append(toIndentedString(hp)).append("\n");
    sb.append("    durability: ").append(toIndentedString(durability)).append("\n");
    sb.append("    maxHp: ").append(toIndentedString(maxHp)).append("\n");
    sb.append("    baseAttack: ").append(toIndentedString(baseAttack)).append("\n");
    sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
    sb.append("    baseManaCost: ").append(toIndentedString(baseManaCost)).append("\n");
    sb.append("    manaCost: ").append(toIndentedString(manaCost)).append("\n");
    sb.append("    armor: ").append(toIndentedString(armor)).append("\n");
    sb.append("    destroyed: ").append(toIndentedString(destroyed)).append("\n");
    sb.append("    summoningSickness: ").append(toIndentedString(summoningSickness)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    silenced: ").append(toIndentedString(silenced)).append("\n");
    sb.append("    windfury: ").append(toIndentedString(windfury)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
    sb.append("    taunt: ").append(toIndentedString(taunt)).append("\n");
    sb.append("    spellDamage: ").append(toIndentedString(spellDamage)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    enraged: ").append(toIndentedString(enraged)).append("\n");
    sb.append("    battlecry: ").append(toIndentedString(battlecry)).append("\n");
    sb.append("    deathrattles: ").append(toIndentedString(deathrattles)).append("\n");
    sb.append("    immune: ").append(toIndentedString(immune)).append("\n");
    sb.append("    divineShield: ").append(toIndentedString(divineShield)).append("\n");
    sb.append("    stealth: ").append(toIndentedString(stealth)).append("\n");
    sb.append("    combo: ").append(toIndentedString(combo)).append("\n");
    sb.append("    overload: ").append(toIndentedString(overload)).append("\n");
    sb.append("    chooseOne: ").append(toIndentedString(chooseOne)).append("\n");
    sb.append("    untargetableBySpells: ").append(toIndentedString(untargetableBySpells)).append("\n");
    sb.append("    cannotAttack: ").append(toIndentedString(cannotAttack)).append("\n");
    sb.append("    underAura: ").append(toIndentedString(underAura)).append("\n");
    sb.append("    customRenderer: ").append(toIndentedString(customRenderer)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    playable: ").append(toIndentedString(playable)).append("\n");
    sb.append("    mana: ").append(toIndentedString(mana)).append("\n");
    sb.append("    maxMana: ").append(toIndentedString(maxMana)).append("\n");
    sb.append("    lockedMana: ").append(toIndentedString(lockedMana)).append("\n");
    sb.append("    hostsTrigger: ").append(toIndentedString(hostsTrigger)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    tribe: ").append(toIndentedString(tribe)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

