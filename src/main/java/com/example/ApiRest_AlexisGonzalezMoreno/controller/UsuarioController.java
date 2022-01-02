package com.example.ApiRest_AlexisGonzalezMoreno.controller;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Usuario;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);

    //attributes
    private UsuarioRepository usuarioRepository;

    //constructor
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("api/mostrarusuarios")
    public String mostrarUsuarios() {
        return "Mostrar todos los usuarios...";
    }

    @GetMapping("api/mosrarusuario/{correoElectronico}")
    public String findById(@PathVariable String correoElectronico) {
        return "Mostrar el usuario " + correoElectronico;
    }

    @PostMapping("api/registrarusuario")
    public String registrarUsuario (@RequestBody Usuario usuario, @RequestHeader HttpHeaders headers) {
        return "Registrar usuario...";
    }

    @PutMapping("api/modificarusuario")
    public String modificarUsuario(@RequestBody Usuario usuario) {
        return "Modificar usuario...";
    }

    @DeleteMapping("api/eliminarusuario/{correoElectronico}")
    public String eliminarUsuarioPorCorreoElectronico(@PathVariable String correoElectronico) {
        return "Eliminar usuario " + correoElectronico;
    }

    @DeleteMapping("api/usuarios/eliminartodos")
    public String eliminarTodosLosUsuarios() {
        return "Eliminar todos los usuarios...";
    }
}