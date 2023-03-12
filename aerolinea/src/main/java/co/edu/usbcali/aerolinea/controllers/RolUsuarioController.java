package co.edu.usbcali.aerolinea.controllers;

import co.edu.usbcali.aerolinea.dtos.RolUsuarioDTO;
import co.edu.usbcali.aerolinea.dtos.UsuarioDTO;
import co.edu.usbcali.aerolinea.mappers.RolUsuarioMapper;
import co.edu.usbcali.aerolinea.mappers.UsuarioMapper;
import co.edu.usbcali.aerolinea.repository.RolUsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rolUsuario")
@Slf4j
public class RolUsuarioController {

    private final RolUsuarioRepository rolUsuarioRepository;

    public RolUsuarioController(RolUsuarioRepository rolUsuarioRepository) {
        this.rolUsuarioRepository = rolUsuarioRepository;
    }


    @GetMapping("/rolesUsuario")
    public ResponseEntity<List<RolUsuarioDTO>> rolesUsuario(){
        log.info("RolUsuarioController: buscar todos los roles de los usuarios");
        return new ResponseEntity(
                RolUsuarioMapper.domainToDTOList(rolUsuarioRepository.findAll())
                , HttpStatus.OK);
    }


}
