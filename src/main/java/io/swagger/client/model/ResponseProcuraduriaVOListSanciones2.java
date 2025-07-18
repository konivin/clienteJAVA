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
 * ResponseProcuraduriaVOListSanciones2
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseProcuraduriaVOListSanciones2 {
  @SerializedName("inhabilidad")
  private String inhabilidad = null;

  @SerializedName("fechaInicio")
  private String fechaInicio = null;

  @SerializedName("fechaFin")
  private String fechaFin = null;

  public ResponseProcuraduriaVOListSanciones2 inhabilidad(String inhabilidad) {
    this.inhabilidad = inhabilidad;
    return this;
  }

   /**
   * Descripción de la inhabilidad fiscal.
   * @return inhabilidad
  **/
  @Schema(example = "INHABILIDAD PARA CONTRATAR CON EL ESTADO LEY 734 ART 38 PAR. 1RO", required = true, description = "Descripción de la inhabilidad fiscal.")
  public String getInhabilidad() {
    return inhabilidad;
  }

  public void setInhabilidad(String inhabilidad) {
    this.inhabilidad = inhabilidad;
  }

  public ResponseProcuraduriaVOListSanciones2 fechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

   /**
   * Get fechaInicio
   * @return fechaInicio
  **/
  @Schema(required = true, description = "")
  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public ResponseProcuraduriaVOListSanciones2 fechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }

   /**
   * Get fechaFin
   * @return fechaFin
  **/
  @Schema(required = true, description = "")
  public String getFechaFin() {
    return fechaFin;
  }

  public void setFechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseProcuraduriaVOListSanciones2 responseProcuraduriaVOListSanciones2 = (ResponseProcuraduriaVOListSanciones2) o;
    return Objects.equals(this.inhabilidad, responseProcuraduriaVOListSanciones2.inhabilidad) &&
        Objects.equals(this.fechaInicio, responseProcuraduriaVOListSanciones2.fechaInicio) &&
        Objects.equals(this.fechaFin, responseProcuraduriaVOListSanciones2.fechaFin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inhabilidad, fechaInicio, fechaFin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProcuraduriaVOListSanciones2 {\n");
    
    sb.append("    inhabilidad: ").append(toIndentedString(inhabilidad)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
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
