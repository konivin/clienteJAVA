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
import org.threeten.bp.LocalDate;
/**
 * ResponseCufeDianVOListEventosFactura
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseCufeDianVOListEventosFactura {
  @SerializedName("codigo")
  private String codigo = null;

  @SerializedName("descripcion")
  private String descripcion = null;

  @SerializedName("fecha")
  private LocalDate fecha = null;

  @SerializedName("nitEmisor")
  private String nitEmisor = null;

  @SerializedName("emisor")
  private String emisor = null;

  @SerializedName("nitReceptor")
  private String nitReceptor = null;

  @SerializedName("receptor")
  private String receptor = null;

  public ResponseCufeDianVOListEventosFactura codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

   /**
   * Código del evento de la factura.
   * @return codigo
  **/
  @Schema(example = "030", required = true, description = "Código del evento de la factura.")
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public ResponseCufeDianVOListEventosFactura descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

   /**
   * Descripción del evento de la factura.
   * @return descripcion
  **/
  @Schema(example = "Acuse de recibo de la Factura Electrónica de Venta", required = true, description = "Descripción del evento de la factura.")
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public ResponseCufeDianVOListEventosFactura fecha(LocalDate fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Fecha del evento.
   * @return fecha
  **/
  @Schema(example = "Mon Aug 08 00:00:00 GMT 2022", required = true, description = "Fecha del evento.")
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public ResponseCufeDianVOListEventosFactura nitEmisor(String nitEmisor) {
    this.nitEmisor = nitEmisor;
    return this;
  }

   /**
   * NIT del emisor de la factura.
   * @return nitEmisor
  **/
  @Schema(example = "830054539", required = true, description = "NIT del emisor de la factura.")
  public String getNitEmisor() {
    return nitEmisor;
  }

  public void setNitEmisor(String nitEmisor) {
    this.nitEmisor = nitEmisor;
  }

  public ResponseCufeDianVOListEventosFactura emisor(String emisor) {
    this.emisor = emisor;
    return this;
  }

   /**
   * Nombre del emisor de la factura.
   * @return emisor
  **/
  @Schema(example = "PATRIMONIOS AUTONOMOS FIDUCIARIA BANCOLOMBIA SA SOCIEDAD FIDUCIARIA", required = true, description = "Nombre del emisor de la factura.")
  public String getEmisor() {
    return emisor;
  }

  public void setEmisor(String emisor) {
    this.emisor = emisor;
  }

  public ResponseCufeDianVOListEventosFactura nitReceptor(String nitReceptor) {
    this.nitReceptor = nitReceptor;
    return this;
  }

   /**
   * NIT del receptor de la factura.
   * @return nitReceptor
  **/
  @Schema(example = "900294398", required = true, description = "NIT del receptor de la factura.")
  public String getNitReceptor() {
    return nitReceptor;
  }

  public void setNitReceptor(String nitReceptor) {
    this.nitReceptor = nitReceptor;
  }

  public ResponseCufeDianVOListEventosFactura receptor(String receptor) {
    this.receptor = receptor;
    return this;
  }

   /**
   * Nombre del receptor de la factura.
   * @return receptor
  **/
  @Schema(example = "AUTOMOTORES FARALLONES S.A.S.", required = true, description = "Nombre del receptor de la factura.")
  public String getReceptor() {
    return receptor;
  }

  public void setReceptor(String receptor) {
    this.receptor = receptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCufeDianVOListEventosFactura responseCufeDianVOListEventosFactura = (ResponseCufeDianVOListEventosFactura) o;
    return Objects.equals(this.codigo, responseCufeDianVOListEventosFactura.codigo) &&
        Objects.equals(this.descripcion, responseCufeDianVOListEventosFactura.descripcion) &&
        Objects.equals(this.fecha, responseCufeDianVOListEventosFactura.fecha) &&
        Objects.equals(this.nitEmisor, responseCufeDianVOListEventosFactura.nitEmisor) &&
        Objects.equals(this.emisor, responseCufeDianVOListEventosFactura.emisor) &&
        Objects.equals(this.nitReceptor, responseCufeDianVOListEventosFactura.nitReceptor) &&
        Objects.equals(this.receptor, responseCufeDianVOListEventosFactura.receptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descripcion, fecha, nitEmisor, emisor, nitReceptor, receptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCufeDianVOListEventosFactura {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    nitEmisor: ").append(toIndentedString(nitEmisor)).append("\n");
    sb.append("    emisor: ").append(toIndentedString(emisor)).append("\n");
    sb.append("    nitReceptor: ").append(toIndentedString(nitReceptor)).append("\n");
    sb.append("    receptor: ").append(toIndentedString(receptor)).append("\n");
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
