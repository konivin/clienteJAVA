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
import io.swagger.client.model.ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection {
  @SerializedName("tblPensionadosGroup1")
  private List<ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1> tblPensionadosGroup1 = null;

  public ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection tblPensionadosGroup1(List<ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1> tblPensionadosGroup1) {
    this.tblPensionadosGroup1 = tblPensionadosGroup1;
    return this;
  }

  public ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection addTblPensionadosGroup1Item(ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1 tblPensionadosGroup1Item) {
    if (this.tblPensionadosGroup1 == null) {
      this.tblPensionadosGroup1 = new ArrayList<ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1>();
    }
    this.tblPensionadosGroup1.add(tblPensionadosGroup1Item);
    return this;
  }

   /**
   * Detalles de pensiones específicas.
   * @return tblPensionadosGroup1
  **/
  @Schema(description = "Detalles de pensiones específicas.")
  public List<ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1> getTblPensionadosGroup1() {
    return tblPensionadosGroup1;
  }

  public void setTblPensionadosGroup1(List<ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1CollectionTblPensionadosGroup1> tblPensionadosGroup1) {
    this.tblPensionadosGroup1 = tblPensionadosGroup1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection responseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection = (ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection) o;
    return Objects.equals(this.tblPensionadosGroup1, responseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection.tblPensionadosGroup1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tblPensionadosGroup1);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRuafVOReportVOLstPensionadosTblPensionadosTblPensionadosGroup1Collection {\n");
    
    sb.append("    tblPensionadosGroup1: ").append(toIndentedString(tblPensionadosGroup1)).append("\n");
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
