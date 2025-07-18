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
 * ResponseRuesCamaraUnificadoVOSucursales
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuesCamaraUnificadoVOSucursales {
  @SerializedName("razonSocial")
  private String razonSocial = null;

  @SerializedName("camaraComercio")
  private String camaraComercio = null;

  @SerializedName("matricula")
  private String matricula = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("categoria")
  private String categoria = null;

  @SerializedName("fechaMatricula")
  private String fechaMatricula = null;

  @SerializedName("fechaRenovacion")
  private String fechaRenovacion = null;

  @SerializedName("ultimoRenovado")
  private String ultimoRenovado = null;

  public ResponseRuesCamaraUnificadoVOSucursales razonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
    return this;
  }

   /**
   * Razón social de la sucursal.
   * @return razonSocial
  **/
  @Schema(example = "FUNERARIA PREVICESAR", required = true, description = "Razón social de la sucursal.")
  public String getRazonSocial() {
    return razonSocial;
  }

  public void setRazonSocial(String razonSocial) {
    this.razonSocial = razonSocial;
  }

  public ResponseRuesCamaraUnificadoVOSucursales camaraComercio(String camaraComercio) {
    this.camaraComercio = camaraComercio;
    return this;
  }

   /**
   * Cámara de Comercio de la sucursal.
   * @return camaraComercio
  **/
  @Schema(example = "AGUACHICA", required = true, description = "Cámara de Comercio de la sucursal.")
  public String getCamaraComercio() {
    return camaraComercio;
  }

  public void setCamaraComercio(String camaraComercio) {
    this.camaraComercio = camaraComercio;
  }

  public ResponseRuesCamaraUnificadoVOSucursales matricula(String matricula) {
    this.matricula = matricula;
    return this;
  }

   /**
   * Número de matrícula de la sucursal.
   * @return matricula
  **/
  @Schema(example = "12991", required = true, description = "Número de matrícula de la sucursal.")
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public ResponseRuesCamaraUnificadoVOSucursales estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado de la sucursal.
   * @return estado
  **/
  @Schema(example = "ACTIVA", required = true, description = "Estado de la sucursal.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseRuesCamaraUnificadoVOSucursales categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

   /**
   * Categoría de la sucursal.
   * @return categoria
  **/
  @Schema(example = "Establecimiento", required = true, description = "Categoría de la sucursal.")
  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public ResponseRuesCamaraUnificadoVOSucursales fechaMatricula(String fechaMatricula) {
    this.fechaMatricula = fechaMatricula;
    return this;
  }

   /**
   * Get fechaMatricula
   * @return fechaMatricula
  **/
  @Schema(required = true, description = "")
  public String getFechaMatricula() {
    return fechaMatricula;
  }

  public void setFechaMatricula(String fechaMatricula) {
    this.fechaMatricula = fechaMatricula;
  }

  public ResponseRuesCamaraUnificadoVOSucursales fechaRenovacion(String fechaRenovacion) {
    this.fechaRenovacion = fechaRenovacion;
    return this;
  }

   /**
   * Get fechaRenovacion
   * @return fechaRenovacion
  **/
  @Schema(required = true, description = "")
  public String getFechaRenovacion() {
    return fechaRenovacion;
  }

  public void setFechaRenovacion(String fechaRenovacion) {
    this.fechaRenovacion = fechaRenovacion;
  }

  public ResponseRuesCamaraUnificadoVOSucursales ultimoRenovado(String ultimoRenovado) {
    this.ultimoRenovado = ultimoRenovado;
    return this;
  }

   /**
   * Año de la última renovación de la sucursal.
   * @return ultimoRenovado
  **/
  @Schema(example = "2022", required = true, description = "Año de la última renovación de la sucursal.")
  public String getUltimoRenovado() {
    return ultimoRenovado;
  }

  public void setUltimoRenovado(String ultimoRenovado) {
    this.ultimoRenovado = ultimoRenovado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuesCamaraUnificadoVOSucursales responseRuesCamaraUnificadoVOSucursales = (ResponseRuesCamaraUnificadoVOSucursales) o;
    return Objects.equals(this.razonSocial, responseRuesCamaraUnificadoVOSucursales.razonSocial) &&
        Objects.equals(this.camaraComercio, responseRuesCamaraUnificadoVOSucursales.camaraComercio) &&
        Objects.equals(this.matricula, responseRuesCamaraUnificadoVOSucursales.matricula) &&
        Objects.equals(this.estado, responseRuesCamaraUnificadoVOSucursales.estado) &&
        Objects.equals(this.categoria, responseRuesCamaraUnificadoVOSucursales.categoria) &&
        Objects.equals(this.fechaMatricula, responseRuesCamaraUnificadoVOSucursales.fechaMatricula) &&
        Objects.equals(this.fechaRenovacion, responseRuesCamaraUnificadoVOSucursales.fechaRenovacion) &&
        Objects.equals(this.ultimoRenovado, responseRuesCamaraUnificadoVOSucursales.ultimoRenovado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(razonSocial, camaraComercio, matricula, estado, categoria, fechaMatricula, fechaRenovacion, ultimoRenovado);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuesCamaraUnificadoVOSucursales {\n");
    
    sb.append("    razonSocial: ").append(toIndentedString(razonSocial)).append("\n");
    sb.append("    camaraComercio: ").append(toIndentedString(camaraComercio)).append("\n");
    sb.append("    matricula: ").append(toIndentedString(matricula)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    fechaMatricula: ").append(toIndentedString(fechaMatricula)).append("\n");
    sb.append("    fechaRenovacion: ").append(toIndentedString(fechaRenovacion)).append("\n");
    sb.append("    ultimoRenovado: ").append(toIndentedString(ultimoRenovado)).append("\n");
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
