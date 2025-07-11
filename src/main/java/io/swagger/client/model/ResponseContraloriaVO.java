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
import io.swagger.client.model.ResponseContraloriaVOReportesList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Colombia -  59542257 - Consulta Certificado de Antecedentes Fiscales.
 */
@Schema(description = "Colombia -  59542257 - Consulta Certificado de Antecedentes Fiscales.")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseContraloriaVO {
  @SerializedName("personaVO")
  private PersonaVO personaVO = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("reportesList")
  private List<ResponseContraloriaVOReportesList> reportesList = new ArrayList<ResponseContraloriaVOReportesList>();

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

  public ResponseContraloriaVO personaVO(PersonaVO personaVO) {
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

  public ResponseContraloriaVO estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado general del reporte en la Contraloría.
   * @return estado
  **/
  @Schema(required = true, description = "Estado general del reporte en la Contraloría.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseContraloriaVO reportesList(List<ResponseContraloriaVOReportesList> reportesList) {
    this.reportesList = reportesList;
    return this;
  }

  public ResponseContraloriaVO addReportesListItem(ResponseContraloriaVOReportesList reportesListItem) {
    this.reportesList.add(reportesListItem);
    return this;
  }

   /**
   * Listado de reportes o procesos encontrados en la Contraloría.
   * @return reportesList
  **/
  @Schema(required = true, description = "Listado de reportes o procesos encontrados en la Contraloría.")
  public List<ResponseContraloriaVOReportesList> getReportesList() {
    return reportesList;
  }

  public void setReportesList(List<ResponseContraloriaVOReportesList> reportesList) {
    this.reportesList = reportesList;
  }

  public ResponseContraloriaVO fechaConsulta(String fechaConsulta) {
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

  public ResponseContraloriaVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
    this.fuenteFallo = fuenteFallo;
    return this;
  }

   /**
   * Indica si la fuente falló en la consulta.
   * @return fuenteFallo
  **/
  @Schema(required = true, description = "Indica si la fuente falló en la consulta.")
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
    ResponseContraloriaVO responseContraloriaVO = (ResponseContraloriaVO) o;
    return Objects.equals(this.personaVO, responseContraloriaVO.personaVO) &&
        Objects.equals(this.estado, responseContraloriaVO.estado) &&
        Objects.equals(this.reportesList, responseContraloriaVO.reportesList) &&
        Objects.equals(this.fechaConsulta, responseContraloriaVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseContraloriaVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaVO, estado, reportesList, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseContraloriaVO {\n");
    
    sb.append("    personaVO: ").append(toIndentedString(personaVO)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    reportesList: ").append(toIndentedString(reportesList)).append("\n");
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
