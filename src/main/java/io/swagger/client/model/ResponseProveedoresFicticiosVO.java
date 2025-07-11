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
import io.swagger.client.model.PersonaVO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Colombia -  45673215 -  Consulta de proveedores ficticios.
 */
@Schema(description = "Colombia -  45673215 -  Consulta de proveedores ficticios.")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseProveedoresFicticiosVO {
  @SerializedName("personaVO")
  private PersonaVO personaVO = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("numeroResolucion")
  private String numeroResolucion = null;

  @SerializedName("fecha")
  private String fecha = null;

  @SerializedName("publicacionArticulo")
  private String publicacionArticulo = null;

  @SerializedName("fechaPublicacion")
  private String fechaPublicacion = null;

  @SerializedName("ciudad")
  private String ciudad = null;

  @SerializedName("observaciones")
  private String observaciones = null;

  @SerializedName("fechaActualizacion")
  private String fechaActualizacion = null;

  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;

  /**
   * Define si la consulta falló o no cuando se fue a la fuente.
   */
  @JsonAdapter(FuenteFalloEnum.Adapter.class)
  public enum FuenteFalloEnum {
    @SerializedName("SI")
    SI("SI"),
    @SerializedName("NO")
    NO("NO");

    private String value;

    FuenteFalloEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FuenteFalloEnum fromValue(String input) {
      for (FuenteFalloEnum b : FuenteFalloEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FuenteFalloEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FuenteFalloEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public FuenteFalloEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FuenteFalloEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("fuenteFallo")
  private FuenteFalloEnum fuenteFallo = null;

  public ResponseProveedoresFicticiosVO personaVO(PersonaVO personaVO) {
    this.personaVO = personaVO;
    return this;
  }

   /**
   * Get personaVO
   * @return personaVO
  **/
  @Schema(required = true, description = "")
  public PersonaVO getPersonaVO() {
    return personaVO;
  }

  public void setPersonaVO(PersonaVO personaVO) {
    this.personaVO = personaVO;
  }

  public ResponseProveedoresFicticiosVO estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Muestra el registro o no del proveedor en la fuente.
   * @return estado
  **/
  @Schema(example = "Registrado", required = true, description = "Muestra el registro o no del proveedor en la fuente.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseProveedoresFicticiosVO numeroResolucion(String numeroResolucion) {
    this.numeroResolucion = numeroResolucion;
    return this;
  }

   /**
   * Número de resolución asociada al proveedor.
   * @return numeroResolucion
  **/
  @Schema(example = "RES-2023-0123", required = true, description = "Número de resolución asociada al proveedor.")
  public String getNumeroResolucion() {
    return numeroResolucion;
  }

  public void setNumeroResolucion(String numeroResolucion) {
    this.numeroResolucion = numeroResolucion;
  }

  public ResponseProveedoresFicticiosVO fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
  @Schema(required = true, description = "")
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public ResponseProveedoresFicticiosVO publicacionArticulo(String publicacionArticulo) {
    this.publicacionArticulo = publicacionArticulo;
    return this;
  }

   /**
   * Medio de publicación del artículo relacionado.
   * @return publicacionArticulo
  **/
  @Schema(example = "Gaceta Oficial", required = true, description = "Medio de publicación del artículo relacionado.")
  public String getPublicacionArticulo() {
    return publicacionArticulo;
  }

  public void setPublicacionArticulo(String publicacionArticulo) {
    this.publicacionArticulo = publicacionArticulo;
  }

  public ResponseProveedoresFicticiosVO fechaPublicacion(String fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
    return this;
  }

   /**
   * Get fechaPublicacion
   * @return fechaPublicacion
  **/
  @Schema(required = true, description = "")
  public String getFechaPublicacion() {
    return fechaPublicacion;
  }

  public void setFechaPublicacion(String fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  public ResponseProveedoresFicticiosVO ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

   /**
   * Ciudad de ubicación del proveedor.
   * @return ciudad
  **/
  @Schema(example = "Bogotá D.C.", required = true, description = "Ciudad de ubicación del proveedor.")
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public ResponseProveedoresFicticiosVO observaciones(String observaciones) {
    this.observaciones = observaciones;
    return this;
  }

   /**
   * Datos adicionales u observaciones.
   * @return observaciones
  **/
  @Schema(example = "Se encuentra en proceso de verificación.", required = true, description = "Datos adicionales u observaciones.")
  public String getObservaciones() {
    return observaciones;
  }

  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  public ResponseProveedoresFicticiosVO fechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }

   /**
   * Get fechaActualizacion
   * @return fechaActualizacion
  **/
  @Schema(required = true, description = "")
  public String getFechaActualizacion() {
    return fechaActualizacion;
  }

  public void setFechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }

  public ResponseProveedoresFicticiosVO fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }

   /**
   * Get fechaConsulta
   * @return fechaConsulta
  **/
  @Schema(required = true, description = "")
  public String getFechaConsulta() {
    return fechaConsulta;
  }

  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }

  public ResponseProveedoresFicticiosVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
    this.fuenteFallo = fuenteFallo;
    return this;
  }

   /**
   * Define si la consulta falló o no cuando se fue a la fuente.
   * @return fuenteFallo
  **/
  @Schema(example = "NO", required = true, description = "Define si la consulta falló o no cuando se fue a la fuente.")
  public FuenteFalloEnum getFuenteFallo() {
    return fuenteFallo;
  }

  public void setFuenteFallo(FuenteFalloEnum fuenteFallo) {
    this.fuenteFallo = fuenteFallo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseProveedoresFicticiosVO responseProveedoresFicticiosVO = (ResponseProveedoresFicticiosVO) o;
    return Objects.equals(this.personaVO, responseProveedoresFicticiosVO.personaVO) &&
        Objects.equals(this.estado, responseProveedoresFicticiosVO.estado) &&
        Objects.equals(this.numeroResolucion, responseProveedoresFicticiosVO.numeroResolucion) &&
        Objects.equals(this.fecha, responseProveedoresFicticiosVO.fecha) &&
        Objects.equals(this.publicacionArticulo, responseProveedoresFicticiosVO.publicacionArticulo) &&
        Objects.equals(this.fechaPublicacion, responseProveedoresFicticiosVO.fechaPublicacion) &&
        Objects.equals(this.ciudad, responseProveedoresFicticiosVO.ciudad) &&
        Objects.equals(this.observaciones, responseProveedoresFicticiosVO.observaciones) &&
        Objects.equals(this.fechaActualizacion, responseProveedoresFicticiosVO.fechaActualizacion) &&
        Objects.equals(this.fechaConsulta, responseProveedoresFicticiosVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseProveedoresFicticiosVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaVO, estado, numeroResolucion, fecha, publicacionArticulo, fechaPublicacion, ciudad, observaciones, fechaActualizacion, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProveedoresFicticiosVO {\n");
    
    sb.append("    personaVO: ").append(toIndentedString(personaVO)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    numeroResolucion: ").append(toIndentedString(numeroResolucion)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    publicacionArticulo: ").append(toIndentedString(publicacionArticulo)).append("\n");
    sb.append("    fechaPublicacion: ").append(toIndentedString(fechaPublicacion)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    observaciones: ").append(toIndentedString(observaciones)).append("\n");
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    fuenteFallo: ").append(toIndentedString(fuenteFallo)).append("\n");
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
