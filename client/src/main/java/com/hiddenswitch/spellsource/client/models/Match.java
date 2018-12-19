/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A document that describes an awaiting match. 
 */
@ApiModel(description = "A document that describes an awaiting match. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class Match implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("createdAt")
  private Long createdAt = null;

  public Match id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the match. 
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the match. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Match createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A timestamp for when this game was created (approximate). 
   * @return createdAt
  **/
  @ApiModelProperty(value = "A timestamp for when this game was created (approximate). ")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Match match = (Match) o;
    return Objects.equals(this.id, match.id) &&
        Objects.equals(this.createdAt, match.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Match {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

