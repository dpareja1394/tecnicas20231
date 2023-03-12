package co.edu.usbcali.aerolinea.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class AeropuertoDTO {
    private Long aeroId;
    private String nombre;
    private String iata;
    private String ubicacion;
    private String estado;
}
