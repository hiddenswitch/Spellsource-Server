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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * JavaSerializationObject
 */

public class JavaSerializationObject implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("javaSerialized")
  private String javaSerialized = null;

  public JavaSerializationObject javaSerialized(String javaSerialized) {
    this.javaSerialized = javaSerialized;
    return this;
  }

   /**
   * Get javaSerialized
   * @return javaSerialized
  **/
  @ApiModelProperty(required = true, value = "")
  public String getJavaSerialized() {
    return javaSerialized;
  }

  public void setJavaSerialized(String javaSerialized) {
    this.javaSerialized = javaSerialized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JavaSerializationObject javaSerializationObject = (JavaSerializationObject) o;
    return Objects.equals(this.javaSerialized, javaSerializationObject.javaSerialized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaSerialized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JavaSerializationObject {\n");
    
    sb.append("    javaSerialized: ").append(toIndentedString(javaSerialized)).append("\n");
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

