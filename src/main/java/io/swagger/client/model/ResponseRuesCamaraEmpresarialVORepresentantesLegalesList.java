/*
 * API Konivin
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseRuesCamaraEmpresarialVORepresentantesLegalesList
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuesCamaraEmpresarialVORepresentantesLegalesList {
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;

  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;

  @SerializedName("nombre")
  private String nombre = null;

  @SerializedName("cargo")
  private String cargo = null;

  public ResponseRuesCamaraEmpresarialVORepresentantesLegalesList tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

   /**
   * Tipo de documento del representante legal.
   * @return tipoDocumento
  **/
  @Schema(example = "CC.", required = true, description = "Tipo de documento del representante legal.")
  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public ResponseRuesCamaraEmpresarialVORepresentantesLegalesList numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

   /**
   * Número de documento del representante legal.
   * @return numeroDocumento
  **/
  @Schema(example = "ND1098XX", required = true, description = "Número de documento del representante legal.")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  public ResponseRuesCamaraEmpresarialVORepresentantesLegalesList nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Nombre completo del representante legal.
   * @return nombre
  **/
  @Schema(example = "Perez Perez Maria", required = true, description = "Nombre completo del representante legal.")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ResponseRuesCamaraEmpresarialVORepresentantesLegalesList cargo(String cargo) {
    this.cargo = cargo;
    return this;
  }

   /**
   * Cargo del representante legal.
   * @return cargo
  **/
  @Schema(example = "Gerente", required = true, description = "Cargo del representante legal.")
  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuesCamaraEmpresarialVORepresentantesLegalesList responseRuesCamaraEmpresarialVORepresentantesLegalesList = (ResponseRuesCamaraEmpresarialVORepresentantesLegalesList) o;
    return Objects.equals(this.tipoDocumento, responseRuesCamaraEmpresarialVORepresentantesLegalesList.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, responseRuesCamaraEmpresarialVORepresentantesLegalesList.numeroDocumento) &&
        Objects.equals(this.nombre, responseRuesCamaraEmpresarialVORepresentantesLegalesList.nombre) &&
        Objects.equals(this.cargo, responseRuesCamaraEmpresarialVORepresentantesLegalesList.cargo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, numeroDocumento, nombre, cargo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuesCamaraEmpresarialVORepresentantesLegalesList {\n");
    
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cargo: ").append(toIndentedString(cargo)).append("\n");
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
