/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venko.clientekonivin;

import com.venko.clientekonivin.dto.SolicitudDTO;
import com.venko.clientekonivin.restClient.KonivinClient;

/**
 *
 * @author Carlos Andres Ortiz Landazabal<carlos.ortiz@venko.co>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonivinClient cliente = new KonivinClient();
        SolicitudDTO datosSolicitud = new SolicitudDTO();
        datosSolicitud.setLcy("USER-NAME"); //Asignar aquí el nombre de usuario para autenticación
        datosSolicitud.setVpv("PASSWD"); //Asignar aquí contraseña de usuario para autenticación
        datosSolicitud.setJor("20036582"); //asignar aquí código de la fuente, para este ejemplo se usará el código de fuente nombreCompleto
        datosSolicitud.setIcf("01"); 
        datosSolicitud.setThy("co");
        datosSolicitud.setKlm("1098600000"); //Asigna aquí el número de documento de identidad de la persona que se va a consultar
        datosSolicitud.setHho("");
        datosSolicitud.setHgu("");
        String json = cliente.consultar(String.class, datosSolicitud);
        System.out.println(json);
    }
    
}
