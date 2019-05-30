package com.cice.demousuarios2.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;
    private String apellidos;
    private String numeroTarjeta;
    private String caducidad;
    private int codSeguridad;
    private List<direccion> direcciones;
}
