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
import com.hiddenswitch.spellsource.client.models.Friend;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * UnfriendResponse
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class UnfriendResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("deletedFriend")
  private Friend deletedFriend = null;

  public UnfriendResponse deletedFriend(Friend deletedFriend) {
    this.deletedFriend = deletedFriend;
    return this;
  }

   /**
   * Get deletedFriend
   * @return deletedFriend
  **/
  @ApiModelProperty(value = "")
  public Friend getDeletedFriend() {
    return deletedFriend;
  }

  public void setDeletedFriend(Friend deletedFriend) {
    this.deletedFriend = deletedFriend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnfriendResponse unfriendResponse = (UnfriendResponse) o;
    return Objects.equals(this.deletedFriend, unfriendResponse.deletedFriend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFriend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnfriendResponse {\n");
    
    sb.append("    deletedFriend: ").append(toIndentedString(deletedFriend)).append("\n");
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

