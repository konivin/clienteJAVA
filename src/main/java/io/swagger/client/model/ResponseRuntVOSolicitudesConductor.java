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
 * ResponseRuntVOSolicitudesConductor
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuntVOSolicitudesConductor {
  @SerializedName("numeroSolicitud")
  private String numeroSolicitud = null;

  @SerializedName("fechaSolicitud")
  private String fechaSolicitud = null;

  @SerializedName("identificador")
  private String identificador = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("tramitesRealizados")
  private String tramitesRealizados = null;

  @SerializedName("entidad")
  private String entidad = null;

  public ResponseRuntVOSolicitudesConductor numeroSolicitud(String numeroSolicitud) {
    this.numeroSolicitud = numeroSolicitud;
    return this;
  }

   /**
   * Número de la solicitud.
   * @return numeroSolicitud
  **/
  @Schema(example = "70307302", required = true, description = "Número de la solicitud.")
  public String getNumeroSolicitud() {
    return numeroSolicitud;
  }

  public void setNumeroSolicitud(String numeroSolicitud) {
    this.numeroSolicitud = numeroSolicitud;
  }

  public ResponseRuntVOSolicitudesConductor fechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
    return this;
  }

   /**
   * Get fechaSolicitud
   * @return fechaSolicitud
  **/
  @Schema(required = true, description = "")
  public String getFechaSolicitud() {
    return fechaSolicitud;
  }

  public void setFechaSolicitud(String fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
  }

  public ResponseRuntVOSolicitudesConductor identificador(String identificador) {
    this.identificador = identificador;
    return this;
  }

   /**
   * Identificador asociado a la solicitud
   * @return identificador
  **/
  @Schema(example = "C.C. ND1098XX", required = true, description = "Identificador asociado a la solicitud")
  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public ResponseRuntVOSolicitudesConductor estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado de la solicitud
   * @return estado
  **/
  @Schema(example = "AUTORIZADA, APROBADA", required = true, description = "Estado de la solicitud")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseRuntVOSolicitudesConductor tramitesRealizados(String tramitesRealizados) {
    this.tramitesRealizados = tramitesRealizados;
    return this;
  }

   /**
   * Descripción de los trámites realizados.
   * @return tramitesRealizados
  **/
  @Schema(example = "Tramite expedicion licencia conduccion", required = true, description = "Descripción de los trámites realizados.")
  public String getTramitesRealizados() {
    return tramitesRealizados;
  }

  public void setTramitesRealizados(String tramitesRealizados) {
    this.tramitesRealizados = tramitesRealizados;
  }

  public ResponseRuntVOSolicitudesConductor entidad(String entidad) {
    this.entidad = entidad;
    return this;
  }

   /**
   * Entidad que gestionó la solicitud.
   * @return entidad
  **/
  @Schema(example = "INST TTO ATLANTICO/SABANAGRANDE", required = true, description = "Entidad que gestionó la solicitud.")
  public String getEntidad() {
    return entidad;
  }

  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuntVOSolicitudesConductor responseRuntVOSolicitudesConductor = (ResponseRuntVOSolicitudesConductor) o;
    return Objects.equals(this.numeroSolicitud, responseRuntVOSolicitudesConductor.numeroSolicitud) &&
        Objects.equals(this.fechaSolicitud, responseRuntVOSolicitudesConductor.fechaSolicitud) &&
        Objects.equals(this.identificador, responseRuntVOSolicitudesConductor.identificador) &&
        Objects.equals(this.estado, responseRuntVOSolicitudesConductor.estado) &&
        Objects.equals(this.tramitesRealizados, responseRuntVOSolicitudesConductor.tramitesRealizados) &&
        Objects.equals(this.entidad, responseRuntVOSolicitudesConductor.entidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroSolicitud, fechaSolicitud, identificador, estado, tramitesRealizados, entidad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuntVOSolicitudesConductor {\n");
    
    sb.append("    numeroSolicitud: ").append(toIndentedString(numeroSolicitud)).append("\n");
    sb.append("    fechaSolicitud: ").append(toIndentedString(fechaSolicitud)).append("\n");
    sb.append("    identificador: ").append(toIndentedString(identificador)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    tramitesRealizados: ").append(toIndentedString(tramitesRealizados)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
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
