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
import io.swagger.client.model.ResponseSenescytVOTitulosList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Ecuador - 94753184 - Consulta de titulos registrados
 */
@Schema(description = "Ecuador - 94753184 - Consulta de titulos registrados")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseSenescytVO {
  @SerializedName("personaVO")
  private PersonaVO personaVO = null;

  @SerializedName("genero")
  private String genero = null;

  @SerializedName("nacionalidad")
  private String nacionalidad = null;

  @SerializedName("titulosList")
  private List<ResponseSenescytVOTitulosList> titulosList = new ArrayList<ResponseSenescytVOTitulosList>();

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

  public ResponseSenescytVO personaVO(PersonaVO personaVO) {
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

  public ResponseSenescytVO genero(String genero) {
    this.genero = genero;
    return this;
  }

   /**
   * Género de la persona.
   * @return genero
  **/
  @Schema(example = "FEMENINO", required = true, description = "Género de la persona.")
  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public ResponseSenescytVO nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

   /**
   * Nacionalidad de la persona.
   * @return nacionalidad
  **/
  @Schema(example = "CUBA", required = true, description = "Nacionalidad de la persona.")
  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public ResponseSenescytVO titulosList(List<ResponseSenescytVOTitulosList> titulosList) {
    this.titulosList = titulosList;
    return this;
  }

  public ResponseSenescytVO addTitulosListItem(ResponseSenescytVOTitulosList titulosListItem) {
    this.titulosList.add(titulosListItem);
    return this;
  }

   /**
   * Listado de títulos académicos registrados.
   * @return titulosList
  **/
  @Schema(required = true, description = "Listado de títulos académicos registrados.")
  public List<ResponseSenescytVOTitulosList> getTitulosList() {
    return titulosList;
  }

  public void setTitulosList(List<ResponseSenescytVOTitulosList> titulosList) {
    this.titulosList = titulosList;
  }

  public ResponseSenescytVO estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado general de la consulta (puede estar vacío).
   * @return estado
  **/
  @Schema(required = true, description = "Estado general de la consulta (puede estar vacío).")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseSenescytVO fechaConsulta(String fechaConsulta) {
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

  public ResponseSenescytVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
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
    ResponseSenescytVO responseSenescytVO = (ResponseSenescytVO) o;
    return Objects.equals(this.personaVO, responseSenescytVO.personaVO) &&
        Objects.equals(this.genero, responseSenescytVO.genero) &&
        Objects.equals(this.nacionalidad, responseSenescytVO.nacionalidad) &&
        Objects.equals(this.titulosList, responseSenescytVO.titulosList) &&
        Objects.equals(this.estado, responseSenescytVO.estado) &&
        Objects.equals(this.fechaConsulta, responseSenescytVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseSenescytVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaVO, genero, nacionalidad, titulosList, estado, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSenescytVO {\n");
    
    sb.append("    personaVO: ").append(toIndentedString(personaVO)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    titulosList: ").append(toIndentedString(titulosList)).append("\n");
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
