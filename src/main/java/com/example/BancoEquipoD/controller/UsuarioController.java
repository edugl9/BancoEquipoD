package com.example.BancoEquipoD.controller;

import com.example.BancoEquipoD.dto.Usuario;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/usuario")
@Controller
public class UsuarioController {
    @Autowired
    RestTemplate autenticacion;

    @GetMapping("/nuevocliente/{username}")
    public ResponseEntity<?> nuevoCliente(@PathVariable("username") String username){
        String user = autenticacion.getForObject("http://localhost:8080/api/auth/obtenerusuario/" + username, String.class);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
