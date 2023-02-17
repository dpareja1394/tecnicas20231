package co.edu.usbcali.aerolinea.services;

import co.edu.usbcali.aerolinea.dtos.VueloDTO;

import java.util.List;

public interface VueloService {

    VueloDTO guardarVuelo(VueloDTO vueloDTO) throws Exception;
    VueloDTO obtenerVuelo();
    List<VueloDTO> obtenerVuelos();

}
