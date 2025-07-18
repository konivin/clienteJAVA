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
 * ResponseContraloriaVOReportesList
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseContraloriaVOReportesList {
  @SerializedName("entidadAfectada")
  private String entidadAfectada = null;

  @SerializedName("numeroFallos")
  private String numeroFallos = null;

  @SerializedName("tipoResponsabilidad")
  private String tipoResponsabilidad = null;

  @SerializedName("reportadoPor")
  private String reportadoPor = null;

  @SerializedName("departamento")
  private String departamento = null;

  @SerializedName("municipio")
  private String municipio = null;

  public ResponseContraloriaVOReportesList entidadAfectada(String entidadAfectada) {
    this.entidadAfectada = entidadAfectada;
    return this;
  }

   /**
   * Entidad afectada por el proceso.
   * @return entidadAfectada
  **/
  @Schema(required = true, description = "Entidad afectada por el proceso.")
  public String getEntidadAfectada() {
    return entidadAfectada;
  }

  public void setEntidadAfectada(String entidadAfectada) {
    this.entidadAfectada = entidadAfectada;
  }

  public ResponseContraloriaVOReportesList numeroFallos(String numeroFallos) {
    this.numeroFallos = numeroFallos;
    return this;
  }

   /**
   * Número de fallos asociados.
   * @return numeroFallos
  **/
  @Schema(required = true, description = "Número de fallos asociados.")
  public String getNumeroFallos() {
    return numeroFallos;
  }

  public void setNumeroFallos(String numeroFallos) {
    this.numeroFallos = numeroFallos;
  }

  public ResponseContraloriaVOReportesList tipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
    return this;
  }

   /**
   * Tipo de responsabilidad.
   * @return tipoResponsabilidad
  **/
  @Schema(required = true, description = "Tipo de responsabilidad.")
  public String getTipoResponsabilidad() {
    return tipoResponsabilidad;
  }

  public void setTipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
  }

  public ResponseContraloriaVOReportesList reportadoPor(String reportadoPor) {
    this.reportadoPor = reportadoPor;
    return this;
  }

   /**
   * Quién reportó el proceso.
   * @return reportadoPor
  **/
  @Schema(required = true, description = "Quién reportó el proceso.")
  public String getReportadoPor() {
    return reportadoPor;
  }

  public void setReportadoPor(String reportadoPor) {
    this.reportadoPor = reportadoPor;
  }

  public ResponseContraloriaVOReportesList departamento(String departamento) {
    this.departamento = departamento;
    return this;
  }

   /**
   * Departamento donde se originó el proceso.
   * @return departamento
  **/
  @Schema(required = true, description = "Departamento donde se originó el proceso.")
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public ResponseContraloriaVOReportesList municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

   /**
   * Municipio donde se originó el proceso.
   * @return municipio
  **/
  @Schema(required = true, description = "Municipio donde se originó el proceso.")
  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseContraloriaVOReportesList responseContraloriaVOReportesList = (ResponseContraloriaVOReportesList) o;
    return Objects.equals(this.entidadAfectada, responseContraloriaVOReportesList.entidadAfectada) &&
        Objects.equals(this.numeroFallos, responseContraloriaVOReportesList.numeroFallos) &&
        Objects.equals(this.tipoResponsabilidad, responseContraloriaVOReportesList.tipoResponsabilidad) &&
        Objects.equals(this.reportadoPor, responseContraloriaVOReportesList.reportadoPor) &&
        Objects.equals(this.departamento, responseContraloriaVOReportesList.departamento) &&
        Objects.equals(this.municipio, responseContraloriaVOReportesList.municipio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entidadAfectada, numeroFallos, tipoResponsabilidad, reportadoPor, departamento, municipio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContraloriaVOReportesList {\n");
    
    sb.append("    entidadAfectada: ").append(toIndentedString(entidadAfectada)).append("\n");
    sb.append("    numeroFallos: ").append(toIndentedString(numeroFallos)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    reportadoPor: ").append(toIndentedString(reportadoPor)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
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
