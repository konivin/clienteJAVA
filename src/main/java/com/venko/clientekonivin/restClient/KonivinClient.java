/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.venko.clientekonivin.restClient;

import com.venko.clientekonivin.dto.SolicitudDTO;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 * Jersey REST client generated for REST resource:PersonaREST [persona]<br>
 * USAGE:
 * <pre>
        KonivinClient client = new KonivinClient();
        Object response = client.XXX(...);
        // do whatever with response
        client.close();
 </pre>
 *
 * @author Carlos Andres Ortiz Landazabal<carlos.ortiz@venko.co>
 */
public class KonivinClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://test.konivin.com:32564/konivin/servicio";

    public KonivinClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("persona");
    }

    public <T> T consultar(Class<T> responseType, SolicitudDTO solicitudDTO) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (solicitudDTO.getLcy() != null) {
            resource = resource.queryParam("lcy", solicitudDTO.getLcy());
        }
        if (solicitudDTO.getThy() != null) {
            resource = resource.queryParam("thy", solicitudDTO.getThy());
        }
        if (solicitudDTO.getJor() != null) {
            resource = resource.queryParam("jor", solicitudDTO.getJor());
        }
        if (solicitudDTO.getIcf() != null) {
            resource = resource.queryParam("icf", solicitudDTO.getIcf());
        }
        if (solicitudDTO.getKlm() != null) {
            resource = resource.queryParam("klm", solicitudDTO.getKlm());
        }
        if (solicitudDTO.getHho() != null) {
            resource = resource.queryParam("hho", solicitudDTO.getHho());
        }
        if (solicitudDTO.getHgu() != null) {
            resource = resource.queryParam("hgu", solicitudDTO.getHgu());
        }
        if (solicitudDTO.getHgu() != null) {
            resource = resource.queryParam("vpv", solicitudDTO.getVpv());
        }
        resource = resource.path("consultar");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
