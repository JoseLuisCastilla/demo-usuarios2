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

public class direccion {
    private String poblacion;
    private String calle;
    private int numero;
    private String piso;
    private String codigoPostal;

}
