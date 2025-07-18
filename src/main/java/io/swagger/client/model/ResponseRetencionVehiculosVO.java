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
 * Colombia -  24012023 - Retención Vehículos de Barranquilla - Secretaría de Tránsito y Seguridad Vial
 */
@Schema(description = "Colombia -  24012023 - Retención Vehículos de Barranquilla - Secretaría de Tránsito y Seguridad Vial")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRetencionVehiculosVO {
  @SerializedName("placa")
  private String placa = null;

  @SerializedName("patio")
  private String patio = null;

  @SerializedName("direccion")
  private String direccion = null;

  @SerializedName("retenidoDesde")
  private String retenidoDesde = null;

  @SerializedName("mensajeEstado")
  private String mensajeEstado = null;

  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;

  /**
   * Indica si la fuente falló en la consulta.
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

  public ResponseRetencionVehiculosVO placa(String placa) {
    this.placa = placa;
    return this;
  }

   /**
   * Número de placa del vehículo retenido.
   * @return placa
  **/
  @Schema(example = "ND1098XX", required = true, description = "Número de placa del vehículo retenido.")
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public ResponseRetencionVehiculosVO patio(String patio) {
    this.patio = patio;
    return this;
  }

   /**
   * Nombre o identificador del patio donde el vehículo está retenido.
   * @return patio
  **/
  @Schema(example = "PATIOS 2", required = true, description = "Nombre o identificador del patio donde el vehículo está retenido.")
  public String getPatio() {
    return patio;
  }

  public void setPatio(String patio) {
    this.patio = patio;
  }

  public ResponseRetencionVehiculosVO direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

   /**
   * Dirección del patio de retención.
   * @return direccion
  **/
  @Schema(example = "VIA 40 No. 79 - 88", required = true, description = "Dirección del patio de retención.")
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public ResponseRetencionVehiculosVO retenidoDesde(String retenidoDesde) {
    this.retenidoDesde = retenidoDesde;
    return this;
  }

   /**
   * Get retenidoDesde
   * @return retenidoDesde
  **/
  @Schema(required = true, description = "")
  public String getRetenidoDesde() {
    return retenidoDesde;
  }

  public void setRetenidoDesde(String retenidoDesde) {
    this.retenidoDesde = retenidoDesde;
  }

  public ResponseRetencionVehiculosVO mensajeEstado(String mensajeEstado) {
    this.mensajeEstado = mensajeEstado;
    return this;
  }

   /**
   * Mensaje descriptivo del estado de la consulta.
   * @return mensajeEstado
  **/
  @Schema(example = "Consulta exitosa!", required = true, description = "Mensaje descriptivo del estado de la consulta.")
  public String getMensajeEstado() {
    return mensajeEstado;
  }

  public void setMensajeEstado(String mensajeEstado) {
    this.mensajeEstado = mensajeEstado;
  }

  public ResponseRetencionVehiculosVO fechaConsulta(String fechaConsulta) {
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

  public ResponseRetencionVehiculosVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
    this.fuenteFallo = fuenteFallo;
    return this;
  }

   /**
   * Indica si la fuente falló en la consulta.
   * @return fuenteFallo
  **/
  @Schema(example = "NO", required = true, description = "Indica si la fuente falló en la consulta.")
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
    ResponseRetencionVehiculosVO responseRetencionVehiculosVO = (ResponseRetencionVehiculosVO) o;
    return Objects.equals(this.placa, responseRetencionVehiculosVO.placa) &&
        Objects.equals(this.patio, responseRetencionVehiculosVO.patio) &&
        Objects.equals(this.direccion, responseRetencionVehiculosVO.direccion) &&
        Objects.equals(this.retenidoDesde, responseRetencionVehiculosVO.retenidoDesde) &&
        Objects.equals(this.mensajeEstado, responseRetencionVehiculosVO.mensajeEstado) &&
        Objects.equals(this.fechaConsulta, responseRetencionVehiculosVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseRetencionVehiculosVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placa, patio, direccion, retenidoDesde, mensajeEstado, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRetencionVehiculosVO {\n");
    
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    patio: ").append(toIndentedString(patio)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    retenidoDesde: ").append(toIndentedString(retenidoDesde)).append("\n");
    sb.append("    mensajeEstado: ").append(toIndentedString(mensajeEstado)).append("\n");
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
