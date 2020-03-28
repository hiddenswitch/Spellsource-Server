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
import com.hiddenswitch.spellsource.client.models.AttributeValueTuple;
import com.hiddenswitch.spellsource.client.models.CardRecord;
import com.hiddenswitch.spellsource.client.models.ValidationReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A collection of cards. 
 */
@ApiModel(description = "A collection of cards. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class InventoryCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("heroClass")
  private String heroClass = null;

  @JsonProperty("format")
  private String format = null;

  /**
   * The type of collection this object is. A user&#39;s personal collection is of type USER. A deck is of type DECK. 
   */
  public enum TypeEnum {
    USER("USER"),
    
    ALLIANCE("ALLIANCE"),
    
    DECK("DECK");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Indicates whether this is a deck meant for draft or constructed play. 
   */
  public enum DeckTypeEnum {
    DRAFT("DRAFT"),
    
    CONSTRUCTED("CONSTRUCTED");

    private String value;

    DeckTypeEnum(String value) {
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
    public static DeckTypeEnum fromValue(String text) {
      for (DeckTypeEnum b : DeckTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deckType")
  private DeckTypeEnum deckType = null;

  @JsonProperty("isStandardDeck")
  private Boolean isStandardDeck = null;

  @JsonProperty("inventory")
  private List<CardRecord> inventory = null;

  @JsonProperty("validationReport")
  private ValidationReport validationReport = null;

  @JsonProperty("playerEntityAttributes")
  private List<AttributeValueTuple> playerEntityAttributes = null;

  public InventoryCollection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of this collection. Corresponds to a deckId when this is a deck collection. 
   * @return id
  **/
  @ApiModelProperty(value = "The identifier of this collection. Corresponds to a deckId when this is a deck collection. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InventoryCollection userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The owner of this collection. 
   * @return userId
  **/
  @ApiModelProperty(value = "The owner of this collection. ")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InventoryCollection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this collection. Corresponds to the deck name when this is a deck collection. 
   * @return name
  **/
  @ApiModelProperty(value = "The name of this collection. Corresponds to the deck name when this is a deck collection. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InventoryCollection heroClass(String heroClass) {
    this.heroClass = heroClass;
    return this;
  }

   /**
   * The hero class when this is a deck collection. 
   * @return heroClass
  **/
  @ApiModelProperty(value = "The hero class when this is a deck collection. ")
  public String getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(String heroClass) {
    this.heroClass = heroClass;
  }

  public InventoryCollection format(String format) {
    this.format = format;
    return this;
  }

   /**
   * The format when this is a deck collection. 
   * @return format
  **/
  @ApiModelProperty(value = "The format when this is a deck collection. ")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public InventoryCollection type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of collection this object is. A user&#39;s personal collection is of type USER. A deck is of type DECK. 
   * @return type
  **/
  @ApiModelProperty(value = "The type of collection this object is. A user's personal collection is of type USER. A deck is of type DECK. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InventoryCollection deckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
    return this;
  }

   /**
   * Indicates whether this is a deck meant for draft or constructed play. 
   * @return deckType
  **/
  @ApiModelProperty(value = "Indicates whether this is a deck meant for draft or constructed play. ")
  public DeckTypeEnum getDeckType() {
    return deckType;
  }

  public void setDeckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
  }

  public InventoryCollection isStandardDeck(Boolean isStandardDeck) {
    this.isStandardDeck = isStandardDeck;
    return this;
  }

   /**
   * When true, indicates this is a standard deck provided by the server. 
   * @return isStandardDeck
  **/
  @ApiModelProperty(value = "When true, indicates this is a standard deck provided by the server. ")
  public Boolean isIsStandardDeck() {
    return isStandardDeck;
  }

  public void setIsStandardDeck(Boolean isStandardDeck) {
    this.isStandardDeck = isStandardDeck;
  }

  public InventoryCollection inventory(List<CardRecord> inventory) {
    this.inventory = inventory;
    return this;
  }

  public InventoryCollection addInventoryItem(CardRecord inventoryItem) {
    if (this.inventory == null) {
      this.inventory = new ArrayList<>();
    }
    this.inventory.add(inventoryItem);
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public List<CardRecord> getInventory() {
    return inventory;
  }

  public void setInventory(List<CardRecord> inventory) {
    this.inventory = inventory;
  }

  public InventoryCollection validationReport(ValidationReport validationReport) {
    this.validationReport = validationReport;
    return this;
  }

   /**
   * Get validationReport
   * @return validationReport
  **/
  @ApiModelProperty(value = "")
  public ValidationReport getValidationReport() {
    return validationReport;
  }

  public void setValidationReport(ValidationReport validationReport) {
    this.validationReport = validationReport;
  }

  public InventoryCollection playerEntityAttributes(List<AttributeValueTuple> playerEntityAttributes) {
    this.playerEntityAttributes = playerEntityAttributes;
    return this;
  }

  public InventoryCollection addPlayerEntityAttributesItem(AttributeValueTuple playerEntityAttributesItem) {
    if (this.playerEntityAttributes == null) {
      this.playerEntityAttributes = new ArrayList<>();
    }
    this.playerEntityAttributes.add(playerEntityAttributesItem);
    return this;
  }

   /**
   * A list of player entity attributes associated with this deck.  A player entity attribute is an attribute that comes into play before the game starts. It is used to implement the Signature spell of the Ringmaster class. 
   * @return playerEntityAttributes
  **/
  @ApiModelProperty(value = "A list of player entity attributes associated with this deck.  A player entity attribute is an attribute that comes into play before the game starts. It is used to implement the Signature spell of the Ringmaster class. ")
  public List<AttributeValueTuple> getPlayerEntityAttributes() {
    return playerEntityAttributes;
  }

  public void setPlayerEntityAttributes(List<AttributeValueTuple> playerEntityAttributes) {
    this.playerEntityAttributes = playerEntityAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCollection inventoryCollection = (InventoryCollection) o;
    return Objects.equals(this.id, inventoryCollection.id) &&
        Objects.equals(this.userId, inventoryCollection.userId) &&
        Objects.equals(this.name, inventoryCollection.name) &&
        Objects.equals(this.heroClass, inventoryCollection.heroClass) &&
        Objects.equals(this.format, inventoryCollection.format) &&
        Objects.equals(this.type, inventoryCollection.type) &&
        Objects.equals(this.deckType, inventoryCollection.deckType) &&
        Objects.equals(this.isStandardDeck, inventoryCollection.isStandardDeck) &&
        Objects.equals(this.inventory, inventoryCollection.inventory) &&
        Objects.equals(this.validationReport, inventoryCollection.validationReport) &&
        Objects.equals(this.playerEntityAttributes, inventoryCollection.playerEntityAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, name, heroClass, format, type, deckType, isStandardDeck, inventory, validationReport, playerEntityAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    heroClass: ").append(toIndentedString(heroClass)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deckType: ").append(toIndentedString(deckType)).append("\n");
    sb.append("    isStandardDeck: ").append(toIndentedString(isStandardDeck)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    validationReport: ").append(toIndentedString(validationReport)).append("\n");
    sb.append("    playerEntityAttributes: ").append(toIndentedString(playerEntityAttributes)).append("\n");
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
