package co.edu.usbcali.aerolinea.controllers;

import co.edu.usbcali.aerolinea.dtos.AeropuertoDTO;
import co.edu.usbcali.aerolinea.dtos.UsuarioDTO;
import co.edu.usbcali.aerolinea.mappers.AeropuertoMapper;
import co.edu.usbcali.aerolinea.mappers.UsuarioMapper;
import co.edu.usbcali.aerolinea.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@Slf4j
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/buscarUsuariosActivos")
    public ResponseEntity<List<UsuarioDTO>> buscarUsuariosActivos(){
        log.info("UsuarioController: buscar todos los usuarios activos");
        return new ResponseEntity(
                UsuarioMapper.domainToDTOList(usuarioRepository.findByEstado("A"))
                , HttpStatus.OK);
    }


}
