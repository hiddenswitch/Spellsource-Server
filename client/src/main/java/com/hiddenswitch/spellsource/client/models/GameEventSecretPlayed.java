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
 * GameEventSecretPlayed
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class GameEventSecretPlayed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("secretCard")
  private Entity secretCard = null;

  public GameEventSecretPlayed secretCard(Entity secretCard) {
    this.secretCard = secretCard;
    return this;
  }

   /**
   * Get secretCard
   * @return secretCard
  **/
  @ApiModelProperty(value = "")
  public Entity getSecretCard() {
    return secretCard;
  }

  public void setSecretCard(Entity secretCard) {
    this.secretCard = secretCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameEventSecretPlayed gameEventSecretPlayed = (GameEventSecretPlayed) o;
    return Objects.equals(this.secretCard, gameEventSecretPlayed.secretCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameEventSecretPlayed {\n");
    
    sb.append("    secretCard: ").append(toIndentedString(secretCard)).append("\n");
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

