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
 * ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona {
  @SerializedName("tipoIdentificacion")
  private String tipoIdentificacion = null;

  @SerializedName("primerNombre")
  private String primerNombre = null;

  @SerializedName("sexo")
  private String sexo = null;

  public ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona tipoIdentificacion(String tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
    return this;
  }

   /**
   * Tipo de identificación de la persona.
   * @return tipoIdentificacion
  **/
  @Schema(example = "CC", required = true, description = "Tipo de identificación de la persona.")
  public String getTipoIdentificacion() {
    return tipoIdentificacion;
  }

  public void setTipoIdentificacion(String tipoIdentificacion) {
    this.tipoIdentificacion = tipoIdentificacion;
  }

  public ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

   /**
   * Nombre completo de la persona.
   * @return primerNombre
  **/
  @Schema(example = "JUAN JOSE PEREZ PEREZ", required = true, description = "Nombre completo de la persona.")
  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

   /**
   * Sexo de la persona.
   * @return sexo
  **/
  @Schema(example = "M", required = true, description = "Sexo de la persona.")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona responseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona = (ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona) o;
    return Objects.equals(this.tipoIdentificacion, responseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona.tipoIdentificacion) &&
        Objects.equals(this.primerNombre, responseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona.primerNombre) &&
        Objects.equals(this.sexo, responseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona.sexo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoIdentificacion, primerNombre, sexo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuafVOReportVOLstPensionadosTblPersonaTblPersonaGrpPersonaCollectionTblPersonaGrpPersona {\n");
    
    sb.append("    tipoIdentificacion: ").append(toIndentedString(tipoIdentificacion)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
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
