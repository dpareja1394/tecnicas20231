package co.edu.usbcali.aerolinea.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@ToString
public class VueloDTO {
    private String origen;
    private String destino;
    private Date fechaHoraSalida;
    private Date fechaHoraLlegada;
    private String id;
    private String idAvion;

}
