/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 4.0.1
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
import com.hiddenswitch.spellsource.client.models.GameState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A pair of game states. Used to capture a game from each player&#39;s point of view (useful for example in replays). 
 */
@ApiModel(description = "A pair of game states. Used to capture a game from each player's point of view (useful for example in replays). ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class ReplayGameStates implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("first")
  private GameState first = null;

  @JsonProperty("second")
  private GameState second = null;

  public ReplayGameStates first(GameState first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public GameState getFirst() {
    return first;
  }

  public void setFirst(GameState first) {
    this.first = first;
  }

  public ReplayGameStates second(GameState second) {
    this.second = second;
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @ApiModelProperty(value = "")
  public GameState getSecond() {
    return second;
  }

  public void setSecond(GameState second) {
    this.second = second;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayGameStates replayGameStates = (ReplayGameStates) o;
    return Objects.equals(this.first, replayGameStates.first) &&
        Objects.equals(this.second, replayGameStates.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, second);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayGameStates {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
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

