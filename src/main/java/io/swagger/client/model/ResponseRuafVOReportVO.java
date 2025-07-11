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
import io.swagger.client.model.ResponseRuafVOReportVOLstPensionados;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ResponseRuafVOReportVO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuafVOReportVO {
  @SerializedName("lstPensionados")
  private ResponseRuafVOReportVOLstPensionados lstPensionados = null;

  public ResponseRuafVOReportVO lstPensionados(ResponseRuafVOReportVOLstPensionados lstPensionados) {
    this.lstPensionados = lstPensionados;
    return this;
  }

   /**
   * Get lstPensionados
   * @return lstPensionados
  **/
  @Schema(description = "")
  public ResponseRuafVOReportVOLstPensionados getLstPensionados() {
    return lstPensionados;
  }

  public void setLstPensionados(ResponseRuafVOReportVOLstPensionados lstPensionados) {
    this.lstPensionados = lstPensionados;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuafVOReportVO responseRuafVOReportVO = (ResponseRuafVOReportVO) o;
    return Objects.equals(this.lstPensionados, responseRuafVOReportVO.lstPensionados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lstPensionados);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuafVOReportVO {\n");
    
    sb.append("    lstPensionados: ").append(toIndentedString(lstPensionados)).append("\n");
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
