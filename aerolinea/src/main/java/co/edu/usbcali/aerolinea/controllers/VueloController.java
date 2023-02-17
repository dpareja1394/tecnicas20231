package co.edu.usbcali.aerolinea.controllers;

import co.edu.usbcali.aerolinea.dtos.MensajeDTO;
import co.edu.usbcali.aerolinea.dtos.VueloDTO;
import co.edu.usbcali.aerolinea.services.VueloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/vuelo")
public class VueloController {

    private VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

    @GetMapping("/obtenerVuelo")
    public ResponseEntity<VueloDTO> obtenerVuelo(){
        return new ResponseEntity(vueloService.obtenerVuelo(), HttpStatus.OK);
    }

    @GetMapping("/obtenerVuelos")
    public ResponseEntity<List<VueloDTO>> obtenerVuelos(){
        return new ResponseEntity(vueloService.obtenerVuelos(), HttpStatus.OK);
    }

    @PostMapping(path = "/guardarVuelo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity guardarVuelo(@RequestBody VueloDTO vueloDTO) {
        try {
            return new ResponseEntity(vueloService.guardarVuelo(vueloDTO), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity(MensajeDTO.builder().mensaje(e.getMessage()).build(), HttpStatus.BAD_REQUEST);
        }

    }

}
