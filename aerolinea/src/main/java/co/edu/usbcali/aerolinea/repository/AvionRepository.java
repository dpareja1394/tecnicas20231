package co.edu.usbcali.aerolinea.repository;

import co.edu.usbcali.aerolinea.domain.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long> {
}
