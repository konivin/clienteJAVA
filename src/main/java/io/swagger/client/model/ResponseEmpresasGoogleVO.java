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
 * Colombia -  26052122 - Busqueda empresas google
 */
@Schema(description = "Colombia -  26052122 - Busqueda empresas google")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseEmpresasGoogleVO {
  @SerializedName("personaVO")
  private PersonaVO personaVO = null;

  @SerializedName("nombreEmpresa")
  private String nombreEmpresa = null;

  @SerializedName("direccion")
  private String direccion = null;

  @SerializedName("telefono")
  private String telefono = null;

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

  public ResponseEmpresasGoogleVO personaVO(PersonaVO personaVO) {
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

  public ResponseEmpresasGoogleVO nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }

   /**
   * Nombre oficial de la empresa.
   * @return nombreEmpresa
  **/
  @Schema(example = "VENKO S.A.S", required = true, description = "Nombre oficial de la empresa.")
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public ResponseEmpresasGoogleVO direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

   /**
   * Dirección física completa de la empresa.
   * @return direccion
  **/
  @Schema(example = "Cra. 15 \\## 88 - 21 Of 702, Bogotá, Cundinamarca, Colombia", required = true, description = "Dirección física completa de la empresa.")
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public ResponseEmpresasGoogleVO telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

   /**
   * Número de teléfono de contacto de la empresa.
   * @return telefono
  **/
  @Schema(example = "+57 601 7434181", required = true, description = "Número de teléfono de contacto de la empresa.")
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public ResponseEmpresasGoogleVO fechaConsulta(String fechaConsulta) {
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

  public ResponseEmpresasGoogleVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
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
    ResponseEmpresasGoogleVO responseEmpresasGoogleVO = (ResponseEmpresasGoogleVO) o;
    return Objects.equals(this.personaVO, responseEmpresasGoogleVO.personaVO) &&
        Objects.equals(this.nombreEmpresa, responseEmpresasGoogleVO.nombreEmpresa) &&
        Objects.equals(this.direccion, responseEmpresasGoogleVO.direccion) &&
        Objects.equals(this.telefono, responseEmpresasGoogleVO.telefono) &&
        Objects.equals(this.fechaConsulta, responseEmpresasGoogleVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseEmpresasGoogleVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaVO, nombreEmpresa, direccion, telefono, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEmpresasGoogleVO {\n");
    
    sb.append("    personaVO: ").append(toIndentedString(personaVO)).append("\n");
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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
