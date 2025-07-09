package com.konivin.client.commands;

import com.konivin.client.model.ConsultaRequest;
import com.konivin.client.service.KonivinApiService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
/**
 * Defines the available shell commands to interact with the Konivin API.
 */
@ShellComponent("Konivin Commands")
public class KonivinCommands {

    private final KonivinApiService apiService;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public KonivinCommands(KonivinApiService apiService) {
        this.apiService = apiService;
    }

    @ShellMethod(key = "consultar", value = "Performs a query to the Konivin persons API.")
    public String consultar(
            @ShellOption(value = "--lcy", help = "Username performing the query.", defaultValue = "")
            String lcy,

            @ShellOption(value = "--jor", help = "Query codes, separated by commas.", defaultValue = "")
            String jor,

            @ShellOption(value = "--vpv", help = "User's password.", defaultValue = "")
            String vpv,

            @ShellOption(value = "--icf", help = "Document type (e.g., '01' for ID Card in Colombia).", defaultValue = "")
            String icf,

            @ShellOption(value = "--thy", help = "Country of the query (ISO 3166-1 alpha-2, e.g., 'co').", defaultValue = "")
            String thy,

            @ShellOption(value = "--klm", help = "Document number to query.", defaultValue = "")
            String klm,

            @ShellOption(value = "--hgu", help = "Date for queries that require it (format:YYYY-MM-DD).", defaultValue = "1900-01-01")
            String hgu,

            @ShellOption(value = "--hho", help = "6-character vehicle plate (no spaces or hyphens).", defaultValue = "")
            String hho,

            @ShellOption(value = "--method", help = "HTTP method to use (GET or POST).", defaultValue = "GET")
            String metodo,

            @ShellOption(value = "--server", help = "FUll endpoint URL to query (provided by the Konivin team)", defaultValue = "")
            String servidor
    ) {
        System.out.println("Performing query to Konivin API...");

        // Build the request object
        ConsultaRequest requestData = ConsultaRequest.builder()
                .lcy(lcy).jor(jor).vpv(vpv).icf(icf)
                .thy(thy).klm(klm).hgu(hgu).hho(hho)
                .build();

        // Call the service and await the response
        try {
            return apiService.consultarApi(servidor, metodo, requestData);
        } catch (Exception e) {
            return "\nError: An issue occurred while processing the API response. Details: " + e.getMessage();
        }
    }
}