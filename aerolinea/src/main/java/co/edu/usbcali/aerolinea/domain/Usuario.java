package co.edu.usbcali.aerolinea.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usua_id", nullable = false)
    private Integer usuaId;

    @ManyToOne
    @JoinColumn(name = "rous_id", referencedColumnName = "rous_id")
    private RolUsuario rolUsuario;

    @Column(nullable = false, length = 12)
    private String cedula;

    @Column(nullable = false, length = 30)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String apellido;

    @Column(nullable = false, length = 50)
    private String correo;

    @Column(nullable = false, length = 1)
    private String estado;

}
