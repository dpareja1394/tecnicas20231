package co.edu.usbcali.aerolinea.mappers;

import co.edu.usbcali.aerolinea.domain.Aeropuerto;
import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dtos.AeropuertoDTO;
import co.edu.usbcali.aerolinea.dtos.AvionDTO;

import java.util.List;
import java.util.stream.Collectors;

public class AeropuertoMapper {

    public static AeropuertoDTO domainToDTO(Aeropuerto aeropuerto) {
        return AeropuertoDTO.builder()
                .aeroId(aeropuerto.getAeroId())
                .nombre(aeropuerto.getNombre())
                .iata(aeropuerto.getIata())
                .ubicacion(aeropuerto.getUbicacion())
                .estado(aeropuerto.getEstado())
                .build();
    }

    public static List<AeropuertoDTO> domainToDTOList(List<Aeropuerto> aeropuertos) {
        return aeropuertos.stream().map(aeropuerto -> domainToDTO(aeropuerto)).collect(Collectors.toList());
    }

    public static Aeropuerto dTOToDomain(AeropuertoDTO aeropuertoDTO) {
        return Aeropuerto.builder()
                .aeroId(aeropuertoDTO.getAeroId())
                .nombre(aeropuertoDTO.getNombre())
                .iata(aeropuertoDTO.getIata())
                .ubicacion(aeropuertoDTO.getUbicacion())
                .estado(aeropuertoDTO.getEstado())
                .build();
    }

    public static List<Aeropuerto> dTOToDomainList(List<AeropuertoDTO> aeropuertosDTO) {
        return aeropuertosDTO.stream().map(aeropuertoDTO -> dTOToDomain(aeropuertoDTO)).collect(Collectors.toList());
    }


}
