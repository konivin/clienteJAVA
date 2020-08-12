/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venko.clientekonivin.dto;

/**
 *
 * @author Leonardo Machado Jaimes
 */
public class SolicitudDTO {

    private String lcy;
    private String jor;
    private String vpv;
    private String icf;
    private String thy;
    private String klm;
    private String hho;
    private String hgu;

    public String getLcy() {
        return lcy;
    }

    /**
     * Nombre de usuario
     *
     * @param lcy
     */
    public void setLcy(String lcy) {
        this.lcy = lcy;
    }

    public String getJor() {
        return jor;
    }

    /**
     * Código de la fuente que se va a consultar
     *
     * @param jor
     */
    public void setJor(String jor) {
        this.jor = jor;
    }

    public String getVpv() {
        return vpv;
    }

    /**
     * Contraseña de usuario
     *
     * @param vpv
     */
    public void setVpv(String vpv) {
        this.vpv = vpv;
    }

    public String getIcf() {
        return icf;
    }

    /**
     * Código de tipo de documento de identidad
     *
     * @param icf
     */
    public void setIcf(String icf) {
        this.icf = icf;
    }

    public String getThy() {
        return thy;
    }

    /**
     * Código de país
     *
     * @param thy
     */
    public void setThy(String thy) {
        this.thy = thy;
    }

    public String getKlm() {
        return klm;
    }

    /**
     * Número de documento de identidad
     *
     * @param klm
     */
    public void setKlm(String klm) {
        this.klm = klm;
    }

    public String getHho() {
        return hho;
    }

    /**
     * Placa de vehćulo
     *
     * @param hho
     */
    public void setHho(String hho) {
        this.hho = hho;
    }

    public String getHgu() {
        return hgu;
    }

    /**
     * Fecha de expedición de documento
     *
     * @param hgu
     */
    public void setHgu(String hgu) {
        this.hgu = hgu;
    }

    @Override
    public String toString() {
        return "SolicitudDTO{" + "lcy=" + lcy + ", jor=" + jor + ", vpv=" + vpv + ", icf=" + icf + ", thy=" + thy + ", klm=" + klm + ", hho=" + hho + ", hgu=" + hgu + '}';
    }

}
