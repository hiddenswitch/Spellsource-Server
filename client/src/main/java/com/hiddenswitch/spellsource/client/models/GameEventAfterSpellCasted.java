/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 4.0.0
 * Contact: ben@hiddenswitch.com
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
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * GameEventAfterSpellCasted
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class GameEventAfterSpellCasted implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sourceCard")
  private Entity sourceCard = null;

  @JsonProperty("spellTarget")
  private Entity spellTarget = null;

  public GameEventAfterSpellCasted sourceCard(Entity sourceCard) {
    this.sourceCard = sourceCard;
    return this;
  }

   /**
   * Get sourceCard
   * @return sourceCard
  **/
  @ApiModelProperty(value = "")
  public Entity getSourceCard() {
    return sourceCard;
  }

  public void setSourceCard(Entity sourceCard) {
    this.sourceCard = sourceCard;
  }

  public GameEventAfterSpellCasted spellTarget(Entity spellTarget) {
    this.spellTarget = spellTarget;
    return this;
  }

   /**
   * Get spellTarget
   * @return spellTarget
  **/
  @ApiModelProperty(value = "")
  public Entity getSpellTarget() {
    return spellTarget;
  }

  public void setSpellTarget(Entity spellTarget) {
    this.spellTarget = spellTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameEventAfterSpellCasted gameEventAfterSpellCasted = (GameEventAfterSpellCasted) o;
    return Objects.equals(this.sourceCard, gameEventAfterSpellCasted.sourceCard) &&
        Objects.equals(this.spellTarget, gameEventAfterSpellCasted.spellTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCard, spellTarget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameEventAfterSpellCasted {\n");
    
    sb.append("    sourceCard: ").append(toIndentedString(sourceCard)).append("\n");
    sb.append("    spellTarget: ").append(toIndentedString(spellTarget)).append("\n");
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

