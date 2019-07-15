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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Gets or Sets MessageType
 */
public enum MessageType {
  
  REGISTER_PLAYER("REGISTER_PLAYER"),
  
  UPDATE_ACTION("UPDATE_ACTION"),
  
  ON_GAME_EVENT("ON_GAME_EVENT"),
  
  ON_GAME_END("ON_GAME_END"),
  
  SET_PLAYERS("SET_PLAYERS"),
  
  ON_ACTIVE_PLAYER("ON_ACTIVE_PLAYER"),
  
  ON_UPDATE("ON_UPDATE"),
  
  ON_TURN_END("ON_TURN_END"),
  
  ON_REQUEST_ACTION("ON_REQUEST_ACTION"),
  
  FIRST_MESSAGE("FIRST_MESSAGE"),
  
  ON_MULLIGAN("ON_MULLIGAN"),
  
  UPDATE_MULLIGAN("UPDATE_MULLIGAN"),
  
  EMOTE("EMOTE"),
  
  TOUCH("TOUCH"),
  
  CONCEDE("CONCEDE"),
  
  PINGPONG("PINGPONG");

  private String value;

  MessageType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MessageType fromValue(String text) {
    for (MessageType b : MessageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

