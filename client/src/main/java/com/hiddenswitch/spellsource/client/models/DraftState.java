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
import com.hiddenswitch.spellsource.client.models.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Describes the current state of a draft, including the deck in progress, the new choices, and the hero choices. 
 */
@ApiModel(description = "Describes the current state of a draft, including the deck in progress, the new choices, and the hero choices. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class DraftState implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("heroClassChoices")
  private List<Entity> heroClassChoices = null;

  @JsonProperty("currentCardChoices")
  private List<Entity> currentCardChoices = null;

  @JsonProperty("heroClass")
  private Entity heroClass = null;

  /**
   * Gets the status of the draft. 
   */
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SELECT_HERO("SELECT_HERO"),
    
    COMPLETE("COMPLETE"),
    
    RETIRED("RETIRED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("selectedCards")
  private List<Entity> selectedCards = null;

  @JsonProperty("cardsRemaining")
  private Integer cardsRemaining = null;

  @JsonProperty("draftIndex")
  private Integer draftIndex = null;

  @JsonProperty("wins")
  private Integer wins = null;

  @JsonProperty("losses")
  private Integer losses = null;

  @JsonProperty("deckId")
  private String deckId = null;

  public DraftState heroClassChoices(List<Entity> heroClassChoices) {
    this.heroClassChoices = heroClassChoices;
    return this;
  }

  public DraftState addHeroClassChoicesItem(Entity heroClassChoicesItem) {
    if (this.heroClassChoices == null) {
      this.heroClassChoices = new ArrayList<>();
    }
    this.heroClassChoices.add(heroClassChoicesItem);
    return this;
  }

   /**
   * When not null, contains three choices you should reply with to choose the hero of your draft. 
   * @return heroClassChoices
  **/
  @ApiModelProperty(value = "When not null, contains three choices you should reply with to choose the hero of your draft. ")
  public List<Entity> getHeroClassChoices() {
    return heroClassChoices;
  }

  public void setHeroClassChoices(List<Entity> heroClassChoices) {
    this.heroClassChoices = heroClassChoices;
  }

  public DraftState currentCardChoices(List<Entity> currentCardChoices) {
    this.currentCardChoices = currentCardChoices;
    return this;
  }

  public DraftState addCurrentCardChoicesItem(Entity currentCardChoicesItem) {
    if (this.currentCardChoices == null) {
      this.currentCardChoices = new ArrayList<>();
    }
    this.currentCardChoices.add(currentCardChoicesItem);
    return this;
  }

   /**
   * When not null, contains the cards that correspond to your choices for the next draft selection. 
   * @return currentCardChoices
  **/
  @ApiModelProperty(value = "When not null, contains the cards that correspond to your choices for the next draft selection. ")
  public List<Entity> getCurrentCardChoices() {
    return currentCardChoices;
  }

  public void setCurrentCardChoices(List<Entity> currentCardChoices) {
    this.currentCardChoices = currentCardChoices;
  }

  public DraftState heroClass(Entity heroClass) {
    this.heroClass = heroClass;
    return this;
  }

   /**
   * Get heroClass
   * @return heroClass
  **/
  @ApiModelProperty(value = "")
  public Entity getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(Entity heroClass) {
    this.heroClass = heroClass;
  }

  public DraftState status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Gets the status of the draft. 
   * @return status
  **/
  @ApiModelProperty(value = "Gets the status of the draft. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DraftState selectedCards(List<Entity> selectedCards) {
    this.selectedCards = selectedCards;
    return this;
  }

  public DraftState addSelectedCardsItem(Entity selectedCardsItem) {
    if (this.selectedCards == null) {
      this.selectedCards = new ArrayList<>();
    }
    this.selectedCards.add(selectedCardsItem);
    return this;
  }

   /**
   * Get selectedCards
   * @return selectedCards
  **/
  @ApiModelProperty(value = "")
  public List<Entity> getSelectedCards() {
    return selectedCards;
  }

  public void setSelectedCards(List<Entity> selectedCards) {
    this.selectedCards = selectedCards;
  }

  public DraftState cardsRemaining(Integer cardsRemaining) {
    this.cardsRemaining = cardsRemaining;
    return this;
  }

   /**
   * Gets the number of card choices remaining to make. 
   * @return cardsRemaining
  **/
  @ApiModelProperty(value = "Gets the number of card choices remaining to make. ")
  public Integer getCardsRemaining() {
    return cardsRemaining;
  }

  public void setCardsRemaining(Integer cardsRemaining) {
    this.cardsRemaining = cardsRemaining;
  }

  public DraftState draftIndex(Integer draftIndex) {
    this.draftIndex = draftIndex;
    return this;
  }

   /**
   * Gets the current draft index. 
   * @return draftIndex
  **/
  @ApiModelProperty(value = "Gets the current draft index. ")
  public Integer getDraftIndex() {
    return draftIndex;
  }

  public void setDraftIndex(Integer draftIndex) {
    this.draftIndex = draftIndex;
  }

  public DraftState wins(Integer wins) {
    this.wins = wins;
    return this;
  }

   /**
   * The number of wins you have achieved with your current draft deck. 
   * @return wins
  **/
  @ApiModelProperty(value = "The number of wins you have achieved with your current draft deck. ")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  public DraftState losses(Integer losses) {
    this.losses = losses;
    return this;
  }

   /**
   * The number of losses you have suffered with your current draft deck. 
   * @return losses
  **/
  @ApiModelProperty(value = "The number of losses you have suffered with your current draft deck. ")
  public Integer getLosses() {
    return losses;
  }

  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  public DraftState deckId(String deckId) {
    this.deckId = deckId;
    return this;
  }

   /**
   * The deck that corresponds to your finished draft deck. 
   * @return deckId
  **/
  @ApiModelProperty(value = "The deck that corresponds to your finished draft deck. ")
  public String getDeckId() {
    return deckId;
  }

  public void setDeckId(String deckId) {
    this.deckId = deckId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftState draftState = (DraftState) o;
    return Objects.equals(this.heroClassChoices, draftState.heroClassChoices) &&
        Objects.equals(this.currentCardChoices, draftState.currentCardChoices) &&
        Objects.equals(this.heroClass, draftState.heroClass) &&
        Objects.equals(this.status, draftState.status) &&
        Objects.equals(this.selectedCards, draftState.selectedCards) &&
        Objects.equals(this.cardsRemaining, draftState.cardsRemaining) &&
        Objects.equals(this.draftIndex, draftState.draftIndex) &&
        Objects.equals(this.wins, draftState.wins) &&
        Objects.equals(this.losses, draftState.losses) &&
        Objects.equals(this.deckId, draftState.deckId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heroClassChoices, currentCardChoices, heroClass, status, selectedCards, cardsRemaining, draftIndex, wins, losses, deckId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftState {\n");
    
    sb.append("    heroClassChoices: ").append(toIndentedString(heroClassChoices)).append("\n");
    sb.append("    currentCardChoices: ").append(toIndentedString(currentCardChoices)).append("\n");
    sb.append("    heroClass: ").append(toIndentedString(heroClass)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selectedCards: ").append(toIndentedString(selectedCards)).append("\n");
    sb.append("    cardsRemaining: ").append(toIndentedString(cardsRemaining)).append("\n");
    sb.append("    draftIndex: ").append(toIndentedString(draftIndex)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    deckId: ").append(toIndentedString(deckId)).append("\n");
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

