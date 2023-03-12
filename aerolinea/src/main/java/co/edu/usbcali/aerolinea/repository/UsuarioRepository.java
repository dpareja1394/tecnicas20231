package co.edu.usbcali.aerolinea.repository;

import co.edu.usbcali.aerolinea.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByEstado(String estado);

}
