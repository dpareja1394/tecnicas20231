package co.edu.usbcali.aerolinea.services;

import co.edu.usbcali.aerolinea.dtos.VueloDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class VueloServiceImpl implements VueloService{

    @Override
    public VueloDTO guardarVuelo(VueloDTO vueloDTO) throws Exception {
        if(vueloDTO == null) {
            throw new Exception("El Vuelo viene con datos nulos");
        }
        if(vueloDTO.getId()== null || vueloDTO.getId().trim().equals("")) {
            throw new Exception("Id nulo");
        }
        if(vueloDTO.getOrigen()== null || vueloDTO.getOrigen().trim().equals("")) {
            throw new Exception("Origen nulo");
        }
        if(vueloDTO.getDestino()== null || vueloDTO.getDestino().trim().equals("")) {
            throw new Exception("Destino nulo");
        }
        if(vueloDTO.getIdAvion()== null || vueloDTO.getIdAvion().trim().equals("")) {
            throw new Exception("idAvion nulo");
        }

        //Aquí se llama al Repository

        return vueloDTO;
    }

    @Override
    public VueloDTO obtenerVuelo() {
        return VueloDTO.builder()
                .origen("Cali")
                .destino("Buenaventura")
                .fechaHoraSalida(new Date())
                .fechaHoraLlegada(new Date())
                .id("12345").idAvion("54321").build();
    }

    @Override
    public List<VueloDTO> obtenerVuelos() {
        return Arrays.asList(
                VueloDTO.builder()
                        .origen("Cali")
                        .destino("Buenaventura")
                        .fechaHoraSalida(new Date())
                        .fechaHoraLlegada(new Date())
                        .id("12345").idAvion("54321").build(),
                new VueloDTO("Buenaventura",
                        "Cali",
                        new Date(),
                        new Date(),
                        "101234",
                        "101234"
                ),
                new VueloDTO("Medellin",
                        "Cali",
                        new Date(),
                        new Date(),
                        "201234",
                        "201234"
                )
        );
    }
}
