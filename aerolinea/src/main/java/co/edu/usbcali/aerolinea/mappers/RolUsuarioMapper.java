package co.edu.usbcali.aerolinea.mappers;

import co.edu.usbcali.aerolinea.domain.RolUsuario;
import co.edu.usbcali.aerolinea.dtos.RolUsuarioDTO;

import java.util.List;
import java.util.stream.Collectors;

public class RolUsuarioMapper {

    public static RolUsuarioDTO domainToDTO(RolUsuario rolUsuario) {
        return RolUsuarioDTO.builder()
                .rousId(rolUsuario.getRousId())
                .descripcion(rolUsuario.getDescripcion())
                .estado(rolUsuario.getEstado())
                .build();
    }

    public static List<RolUsuarioDTO> domainToDTOList(List<RolUsuario> rolesUsuario) {
        return rolesUsuario.stream().map(ru -> domainToDTO(ru)).collect(Collectors.toList());
    }

}
