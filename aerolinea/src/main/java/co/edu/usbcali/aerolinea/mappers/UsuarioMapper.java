package co.edu.usbcali.aerolinea.mappers;

import co.edu.usbcali.aerolinea.domain.Usuario;
import co.edu.usbcali.aerolinea.dtos.UsuarioDTO;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static UsuarioDTO domainToDTO(Usuario usuario) {
        return UsuarioDTO.builder()
                .usuaId(usuario.getUsuaId())
                .rousIdRolUsuario(usuario.getRolUsuario() != null ? usuario.getRolUsuario().getRousId() : null)
                .cedula(usuario.getCedula())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .correo(usuario.getCorreo())
                .estado(usuario.getEstado())
                .descripcionRolUsuario(usuario.getRolUsuario() != null ? usuario.getRolUsuario().getDescripcion() : null)
                .build();
    }

    public static List<UsuarioDTO> domainToDTOList(List<Usuario> usuarios) {
        return usuarios.stream().map(usuario -> domainToDTO(usuario)).collect(Collectors.toList());
    }

    public static Usuario dTOToDomain(UsuarioDTO usuarioDTO) {
        return Usuario.builder()
                .usuaId(usuarioDTO.getUsuaId())
                .cedula(usuarioDTO.getCedula())
                .nombre(usuarioDTO.getNombre())
                .apellido(usuarioDTO.getApellido())
                .correo(usuarioDTO.getCorreo())
                .estado(usuarioDTO.getEstado())
                .build();
    }

    public static List<Usuario> dTOToDomainList(List<UsuarioDTO> usuariosDTO) {
        return usuariosDTO.stream().map(usuarioDTO -> dTOToDomain(usuarioDTO)).collect(Collectors.toList());
    }


}
