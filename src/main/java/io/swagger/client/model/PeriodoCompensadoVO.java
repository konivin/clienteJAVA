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
 * PeriodoCompensadoVO
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-07-01T20:01:52.954733595Z[GMT]")

public class PeriodoCompensadoVO {
  @SerializedName("eps_eoc")
  private String epsEoc = null;

  @SerializedName("periodosCompensados")
  private String periodosCompensados = null;

  @SerializedName("fechaAfiliacion")
  private String fechaAfiliacion = null;

  @SerializedName("diasCompensados")
  private String diasCompensados = null;

  @SerializedName("tipoAfiliado")
  private String tipoAfiliado = null;

  @SerializedName("norma")
  private String norma = null;

  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;

  @SerializedName("fuenteFallo")
  private String fuenteFallo = null;

  public PeriodoCompensadoVO epsEoc(String epsEoc) {
    this.epsEoc = epsEoc;
    return this;
  }

   /**
   * Get epsEoc
   * @return epsEoc
  **/
  @Schema(example = "NUEVA E.P.S S.A.", description = "")
  public String getEpsEoc() {
    return epsEoc;
  }

  public void setEpsEoc(String epsEoc) {
    this.epsEoc = epsEoc;
  }

  public PeriodoCompensadoVO periodosCompensados(String periodosCompensados) {
    this.periodosCompensados = periodosCompensados;
    return this;
  }

   /**
   * Get periodosCompensados
   * @return periodosCompensados
  **/
  @Schema(example = "08/2020", description = "")
  public String getPeriodosCompensados() {
    return periodosCompensados;
  }

  public void setPeriodosCompensados(String periodosCompensados) {
    this.periodosCompensados = periodosCompensados;
  }

  public PeriodoCompensadoVO fechaAfiliacion(String fechaAfiliacion) {
    this.fechaAfiliacion = fechaAfiliacion;
    return this;
  }

   /**
   * Get fechaAfiliacion
   * @return fechaAfiliacion
  **/
  @Schema(description = "")
  public String getFechaAfiliacion() {
    return fechaAfiliacion;
  }

  public void setFechaAfiliacion(String fechaAfiliacion) {
    this.fechaAfiliacion = fechaAfiliacion;
  }

  public PeriodoCompensadoVO diasCompensados(String diasCompensados) {
    this.diasCompensados = diasCompensados;
    return this;
  }

   /**
   * Get diasCompensados
   * @return diasCompensados
  **/
  @Schema(example = "30", description = "")
  public String getDiasCompensados() {
    return diasCompensados;
  }

  public void setDiasCompensados(String diasCompensados) {
    this.diasCompensados = diasCompensados;
  }

  public PeriodoCompensadoVO tipoAfiliado(String tipoAfiliado) {
    this.tipoAfiliado = tipoAfiliado;
    return this;
  }

   /**
   * Get tipoAfiliado
   * @return tipoAfiliado
  **/
  @Schema(example = "COTIZANTE", description = "")
  public String getTipoAfiliado() {
    return tipoAfiliado;
  }

  public void setTipoAfiliado(String tipoAfiliado) {
    this.tipoAfiliado = tipoAfiliado;
  }

  public PeriodoCompensadoVO norma(String norma) {
    this.norma = norma;
    return this;
  }

   /**
   * Get norma
   * @return norma
  **/
  @Schema(description = "")
  public String getNorma() {
    return norma;
  }

  public void setNorma(String norma) {
    this.norma = norma;
  }

  public PeriodoCompensadoVO fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }

   /**
   * Get fechaConsulta
   * @return fechaConsulta
  **/
  @Schema(description = "")
  public String getFechaConsulta() {
    return fechaConsulta;
  }

  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }

  public PeriodoCompensadoVO fuenteFallo(String fuenteFallo) {
    this.fuenteFallo = fuenteFallo;
    return this;
  }

   /**
   * Get fuenteFallo
   * @return fuenteFallo
  **/
  @Schema(example = "NO", description = "")
  public String getFuenteFallo() {
    return fuenteFallo;
  }

  public void setFuenteFallo(String fuenteFallo) {
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
    PeriodoCompensadoVO periodoCompensadoVO = (PeriodoCompensadoVO) o;
    return Objects.equals(this.epsEoc, periodoCompensadoVO.epsEoc) &&
        Objects.equals(this.periodosCompensados, periodoCompensadoVO.periodosCompensados) &&
        Objects.equals(this.fechaAfiliacion, periodoCompensadoVO.fechaAfiliacion) &&
        Objects.equals(this.diasCompensados, periodoCompensadoVO.diasCompensados) &&
        Objects.equals(this.tipoAfiliado, periodoCompensadoVO.tipoAfiliado) &&
        Objects.equals(this.norma, periodoCompensadoVO.norma) &&
        Objects.equals(this.fechaConsulta, periodoCompensadoVO.fechaConsulta) &&
        Objects.equals(this.fuenteFallo, periodoCompensadoVO.fuenteFallo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsEoc, periodosCompensados, fechaAfiliacion, diasCompensados, tipoAfiliado, norma, fechaConsulta, fuenteFallo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodoCompensadoVO {\n");
    
    sb.append("    epsEoc: ").append(toIndentedString(epsEoc)).append("\n");
    sb.append("    periodosCompensados: ").append(toIndentedString(periodosCompensados)).append("\n");
    sb.append("    fechaAfiliacion: ").append(toIndentedString(fechaAfiliacion)).append("\n");
    sb.append("    diasCompensados: ").append(toIndentedString(diasCompensados)).append("\n");
    sb.append("    tipoAfiliado: ").append(toIndentedString(tipoAfiliado)).append("\n");
    sb.append("    norma: ").append(toIndentedString(norma)).append("\n");
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
