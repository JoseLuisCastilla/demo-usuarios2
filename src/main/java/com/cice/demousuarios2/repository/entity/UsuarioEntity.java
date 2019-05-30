package com.cice.demousuarios2.repository.entity;

import com.cice.demousuarios2.controller.dto.direccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue
    private Long idUsuario;
    private String nombre;
    private String apellidos;
    private String numeroTarjeta;
    private String caducidad;
    private int codSeguridad;
    private List<direccion> direcciones;
}
