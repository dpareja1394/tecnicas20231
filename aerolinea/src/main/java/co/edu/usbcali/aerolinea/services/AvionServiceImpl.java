package co.edu.usbcali.aerolinea.services;

import co.edu.usbcali.aerolinea.domain.Avion;
import co.edu.usbcali.aerolinea.dtos.AvionDTO;
import co.edu.usbcali.aerolinea.mappers.AvionMapper;
import co.edu.usbcali.aerolinea.repository.AvionRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.el.util.Validation;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;
import java.util.List;

@Service
@Slf4j
public class AvionServiceImpl implements AvionService{

    private final AvionRepository avionRepository;

    public AvionServiceImpl(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }


    @Override
    public List<AvionDTO> obtenerAviones() {
        log.info("Servicio obtener aviones");
        return AvionMapper.domainToDTOList(avionRepository.findAll());
    }

    @Override
    public AvionDTO guardarNuevoAvion(AvionDTO avionDTO) throws Exception {

        Avion avion = AvionMapper.dTOToDomain(avionDTO);
        if(avion.getModelo() == null || avion.getModelo().trim().isEmpty()) {
            throw new Exception("Debe ingresar el Modelo");
        }

        return AvionMapper.domainToDTO(avionRepository.save(avion));
    }
}
