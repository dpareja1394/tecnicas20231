package co.edu.usbcali.aerolinea.controllers;

import co.edu.usbcali.aerolinea.dtos.AeropuertoDTO;
import co.edu.usbcali.aerolinea.dtos.AvionDTO;
import co.edu.usbcali.aerolinea.mappers.AeropuertoMapper;
import co.edu.usbcali.aerolinea.repository.AeropuertoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeropuerto")
@Slf4j
public class AeropuertoController {

    private final AeropuertoRepository aeropuertoRepository;

    public AeropuertoController(AeropuertoRepository aeropuertoRepository) {
        this.aeropuertoRepository = aeropuertoRepository;
    }

    @GetMapping("/aeropuertos")
    public ResponseEntity<List<AeropuertoDTO>> obtenerAviones(){
        log.info("AeropuertoController: Ha ingresado a buscar todos los aeropuertos");
        return new ResponseEntity(
                AeropuertoMapper.domainToDTOList(aeropuertoRepository.findAll())
                , HttpStatus.OK);
    }


}
