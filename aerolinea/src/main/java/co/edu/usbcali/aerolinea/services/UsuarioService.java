package co.edu.usbcali.aerolinea.services;

import co.edu.usbcali.aerolinea.dtos.UsuarioDTO;

public interface UsuarioService {

    UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO) throws Exception;

}
