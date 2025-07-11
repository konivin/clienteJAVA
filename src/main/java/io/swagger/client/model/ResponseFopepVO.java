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
 * Colombia -  84931234 - Consulta de inclusión en nómina en el Fondo de Pensiones Públicas. (No muestra nombre)
 */
@Schema(description = "Colombia -  84931234 - Consulta de inclusión en nómina en el Fondo de Pensiones Públicas. (No muestra nombre)")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseFopepVO {
  @SerializedName("fechaIngresoNomina")
  private String fechaIngresoNomina = null;

  @SerializedName("estado")
  private String estado = null;

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

  public ResponseFopepVO fechaIngresoNomina(String fechaIngresoNomina) {
    this.fechaIngresoNomina = fechaIngresoNomina;
    return this;
  }

   /**
   * Get fechaIngresoNomina
   * @return fechaIngresoNomina
  **/
  @Schema(required = true, description = "")
  public String getFechaIngresoNomina() {
    return fechaIngresoNomina;
  }

  public void setFechaIngresoNomina(String fechaIngresoNomina) {
    this.fechaIngresoNomina = fechaIngresoNomina;
  }

  public ResponseFopepVO estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado actual del pensionado en la nómina de FOPEP.
   * @return estado
  **/
  @Schema(example = "Pensionado Incluido en la Nómina de FOPEP", required = true, description = "Estado actual del pensionado en la nómina de FOPEP.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseFopepVO fechaConsulta(String fechaConsulta) {
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

  public ResponseFopepVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
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
    ResponseFopepVO responseFopepVO = (ResponseFopepVO) o;
    return Objects.equals(this.fechaIngresoNomina, responseFopepVO.fechaIngresoNomina) &&
        Objects.equals(this.estado, responseFopepVO.estado) &&
        Objects.equals(this.fechaConsulta, responseFopepVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseFopepVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaIngresoNomina, estado, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseFopepVO {\n");
    
    sb.append("    fechaIngresoNomina: ").append(toIndentedString(fechaIngresoNomina)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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
