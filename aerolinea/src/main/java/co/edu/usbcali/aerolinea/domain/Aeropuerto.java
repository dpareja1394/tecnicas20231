package co.edu.usbcali.aerolinea.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "aeropuerto")
public class Aeropuerto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aero_id", nullable = false)
    private Integer aeroId;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(nullable = false, length = 5)
    private String iata;

    @Column(nullable = false, length = 80)
    private String ubicacion;

    @Column(nullable = false)
    private String estado;

}
