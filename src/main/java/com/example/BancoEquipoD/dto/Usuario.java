package com.example.BancoEquipoD.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private Long idusuario;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private Integer edad;
    private String email;
    private String telefono;
    private String username;
    private String password;

}
