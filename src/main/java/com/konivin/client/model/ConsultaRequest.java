package com.konivin.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto de Transferencia de Datos (DTO) que representa los parámetros
 * para la consulta a la API de Konivin.
 * Se utiliza tanto para los parámetros de la URL en GET como para el cuerpo en POST.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // No incluye campos nulos en el JSON
public class ConsultaRequest {

    private String lcy; // Usuario
    private String jor; // Códigos de consulta
    private String vpv; // Contraseña
    private String icf; // Tipo de documento
    private String thy; // País (ISO 3166-1 alpha-2)
    private String klm; // Número de documento
    private String hgu; // Fecha (opcional)
    private String hho; // Placa de vehículo (opcional)

}
