/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hiddenswitch.spellsource.client.models.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * GameEventWeaponDestroyed
 */

public class GameEventWeaponDestroyed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("weapon")
  private Entity weapon = null;

  public GameEventWeaponDestroyed weapon(Entity weapon) {
    this.weapon = weapon;
    return this;
  }

   /**
   * Get weapon
   * @return weapon
  **/
  @ApiModelProperty(value = "")
  public Entity getWeapon() {
    return weapon;
  }

  public void setWeapon(Entity weapon) {
    this.weapon = weapon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameEventWeaponDestroyed gameEventWeaponDestroyed = (GameEventWeaponDestroyed) o;
    return Objects.equals(this.weapon, gameEventWeaponDestroyed.weapon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weapon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameEventWeaponDestroyed {\n");
    
    sb.append("    weapon: ").append(toIndentedString(weapon)).append("\n");
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

