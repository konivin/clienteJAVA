package com.konivin.client.service;


import com.konivin.client.model.ConsultaRequest;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import org.threeten.bp.LocalDate;
import reactor.core.publisher.Mono;

/**
 * Servicio para interactuar con la API de Konivin.
 * Construye y ejecuta las llamadas HTTP.
 */
@Service
public class KonivinApiService {

    private final WebClient webClient;

    public KonivinApiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    /**
     * Realiza una consulta a la API de Konivin.
     *
     * @param server      La URL del servicio a consumir
     * @param method      El método HTTP ("GET" o "POST").
     * @param requestData Los datos para la consulta.
     * @return Un Mono que emite la respuesta como un String JSON.
     */
    public Mono<String> consultar(String  server, String method, ConsultaRequest requestData) {
        String baseUrl = server;

        if ("POST".equalsIgnoreCase(method)) {
            return doPost(baseUrl, requestData);
        } else {
            return doGet(baseUrl, requestData);
        }
    }

    public String consultarApi (String server, String method, ConsultaRequest requestData){
        // --- Parte 1: Configuración del ApiClient ---
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(server);

        // --- Parte 2: Instanciar y Usar DefaultApi ---
        DefaultApi apiInstance = new DefaultApi(defaultClient);

        try {
            LocalDate fechaDesdeTexto = LocalDate.parse(requestData.getHgu());
            Response result = apiInstance.consultarGet(requestData.getLcy(),requestData.getJor(), requestData.getVpv(), requestData.getIcf(), requestData.getThy(), requestData.getKlm(), fechaDesdeTexto, requestData.getHho()); // El nombre puede variar, revisa la clase DefaultApi generada.
            System.out.println("El objeto resultante es: " + result.getClass().getName());
            // 4. Usar el resultado
            return result.toString();

        } catch (ApiException e) {
            // 5. Manejar errores de la API (ej. 404 Not Found, 500 Server Error)
            System.err.println("Excepción al llamar a Konivin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Ejecuta una petición GET.
     */
    private Mono<String> doGet(String baseUrl, ConsultaRequest request) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("lcy", request.getLcy())
                .queryParam("jor", request.getJor())
                .queryParam("vpv", request.getVpv())
                .queryParam("icf", request.getIcf())
                .queryParam("thy", request.getThy())
                .queryParam("klm", request.getKlm());

        if (request.getHgu() != null && !request.getHgu().isBlank()) {
            uriBuilder.queryParam("hgu", request.getHgu());
        }
        if (request.getHho() != null && !request.getHho().isBlank()) {
            uriBuilder.queryParam("hho", request.getHho());
        }

        return webClient.get()
                .uri(uriBuilder.toUriString())
                .retrieve()
                .bodyToMono(String.class)
                .onErrorResume(e -> Mono.just("Error al realizar la consulta GET: " + e.getMessage()));
    }

    /**
     * Ejecuta una petición POST.
     */
    private Mono<String> doPost(String baseUrl, ConsultaRequest request) {
        return webClient.post()
                .uri(baseUrl)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(String.class)
                .onErrorResume(e -> Mono.just("Error al realizar la consulta POST: " + e.getMessage()));
    }
}

