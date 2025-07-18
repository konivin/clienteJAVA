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
 * Colombia -  52563514 - Consulta de certificado del Registro Civil.
 */
@Schema(description = "Colombia -  52563514 - Consulta de certificado del Registro Civil.")
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseCertificadoRegistroCivilVO {
  @SerializedName("personaVO")
  private PersonaVO personaVO = null;

  @SerializedName("sexo")
  private String sexo = null;

  @SerializedName("serial")
  private String serial = null;

  @SerializedName("fechaInscripcion")
  private String fechaInscripcion = null;

  @SerializedName("oficinaRegistro")
  private String oficinaRegistro = null;

  @SerializedName("tipoRegistroCivil")
  private String tipoRegistroCivil = null;

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

  public ResponseCertificadoRegistroCivilVO personaVO(PersonaVO personaVO) {
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

  public ResponseCertificadoRegistroCivilVO sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

   /**
   * Sexo de la persona registrado en el certificado civil.
   * @return sexo
  **/
  @Schema(required = true, description = "Sexo de la persona registrado en el certificado civil.")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public ResponseCertificadoRegistroCivilVO serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Número de serial del certificado de registro civil.
   * @return serial
  **/
  @Schema(required = true, description = "Número de serial del certificado de registro civil.")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public ResponseCertificadoRegistroCivilVO fechaInscripcion(String fechaInscripcion) {
    this.fechaInscripcion = fechaInscripcion;
    return this;
  }

   /**
   * Fecha de inscripción en el registro civil.
   * @return fechaInscripcion
  **/
  @Schema(required = true, description = "Fecha de inscripción en el registro civil.")
  public String getFechaInscripcion() {
    return fechaInscripcion;
  }

  public void setFechaInscripcion(String fechaInscripcion) {
    this.fechaInscripcion = fechaInscripcion;
  }

  public ResponseCertificadoRegistroCivilVO oficinaRegistro(String oficinaRegistro) {
    this.oficinaRegistro = oficinaRegistro;
    return this;
  }

   /**
   * Oficina donde se realizó el registro civil.
   * @return oficinaRegistro
  **/
  @Schema(required = true, description = "Oficina donde se realizó el registro civil.")
  public String getOficinaRegistro() {
    return oficinaRegistro;
  }

  public void setOficinaRegistro(String oficinaRegistro) {
    this.oficinaRegistro = oficinaRegistro;
  }

  public ResponseCertificadoRegistroCivilVO tipoRegistroCivil(String tipoRegistroCivil) {
    this.tipoRegistroCivil = tipoRegistroCivil;
    return this;
  }

   /**
   * Tipo de registro civil (ej REGISTRO CIVIL DE NACIMIENTO).
   * @return tipoRegistroCivil
  **/
  @Schema(required = true, description = "Tipo de registro civil (ej REGISTRO CIVIL DE NACIMIENTO).")
  public String getTipoRegistroCivil() {
    return tipoRegistroCivil;
  }

  public void setTipoRegistroCivil(String tipoRegistroCivil) {
    this.tipoRegistroCivil = tipoRegistroCivil;
  }

  public ResponseCertificadoRegistroCivilVO estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Estado del certificado (puede estar vacío).
   * @return estado
  **/
  @Schema(required = true, description = "Estado del certificado (puede estar vacío).")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ResponseCertificadoRegistroCivilVO fechaConsulta(String fechaConsulta) {
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

  public ResponseCertificadoRegistroCivilVO fuenteFallo(FuenteFalloEnum fuenteFallo) {
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
    ResponseCertificadoRegistroCivilVO responseCertificadoRegistroCivilVO = (ResponseCertificadoRegistroCivilVO) o;
    return Objects.equals(this.personaVO, responseCertificadoRegistroCivilVO.personaVO) &&
        Objects.equals(this.sexo, responseCertificadoRegistroCivilVO.sexo) &&
        Objects.equals(this.serial, responseCertificadoRegistroCivilVO.serial) &&
        Objects.equals(this.fechaInscripcion, responseCertificadoRegistroCivilVO.fechaInscripcion) &&
        Objects.equals(this.oficinaRegistro, responseCertificadoRegistroCivilVO.oficinaRegistro) &&
        Objects.equals(this.tipoRegistroCivil, responseCertificadoRegistroCivilVO.tipoRegistroCivil) &&
        Objects.equals(this.estado, responseCertificadoRegistroCivilVO.estado) &&
        Objects.equals(this.fechaConsulta, responseCertificadoRegistroCivilVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, responseCertificadoRegistroCivilVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaVO, sexo, serial, fechaInscripcion, oficinaRegistro, tipoRegistroCivil, estado, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCertificadoRegistroCivilVO {\n");
    
    sb.append("    personaVO: ").append(toIndentedString(personaVO)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    fechaInscripcion: ").append(toIndentedString(fechaInscripcion)).append("\n");
    sb.append("    oficinaRegistro: ").append(toIndentedString(oficinaRegistro)).append("\n");
    sb.append("    tipoRegistroCivil: ").append(toIndentedString(tipoRegistroCivil)).append("\n");
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
