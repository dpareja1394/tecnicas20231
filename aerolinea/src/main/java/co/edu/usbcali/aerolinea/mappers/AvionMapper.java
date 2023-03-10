package co.edu.usbcali.aerolinea.mappers;

import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dtos.AvionDTO;

import java.util.List;
import java.util.stream.Collectors;

public class AvionMapper {

    public static AvionDTO domainToDTO(Avion avion) {
        return AvionDTO.builder()
                .id(avion.getId())
                .matricula(avion.getMatricula())
                .aerolinea(avion.getAerolinea())
                .build();
    }

    public static List<AvionDTO> domainToDTOList(List<Avion> aviones) {
        return aviones.stream().map(avion -> domainToDTO(avion)).collect(Collectors.toList());
    }

    public static Avion dTOToDomain(AvionDTO avionDTO) {
        return Avion.builder()
                .id(avionDTO.getId())
                .matricula(avionDTO.getMatricula())
                .aerolinea(avionDTO.getAerolinea())
                .build();
    }

    public static List<Avion> dTOToDomainList(List<AvionDTO> avionesDTO) {
        return avionesDTO.stream().map(avionDTO -> dTOToDomain(avionDTO)).collect(Collectors.toList());
    }


}
