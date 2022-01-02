package com.example.ApiRest_AlexisGonzalezMoreno.controller;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Etiqueta;
import com.example.ApiRest_AlexisGonzalezMoreno.entities.Usuario;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.EtiquetaRepository;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtiquetaController {
    private final Logger log = LoggerFactory.getLogger(EtiquetaController.class);

    //attributes
    private EtiquetaRepository etiquetaRepository;

    //constructor
    public EtiquetaController(EtiquetaRepository etiquetaRepository) {
        this.etiquetaRepository = etiquetaRepository;
    }

    @GetMapping("api/mostraretiquetas")
    public String findEtiquetas() {
        return "Mostrar etiquetas...";
    }

    @GetMapping("api/mostraretiqueta/{lenguaje}")
    public String findById(@PathVariable String lenguaje) {
        return "Mostrar etiqueta..." + lenguaje;
    }

    @PostMapping("api/anadiretiqueta")
    public String anadirEtiqueta (@RequestBody Etiqueta etiqueta, @RequestHeader HttpHeaders headers) {
        return "Añadir etiqueta...";
    }

    @PutMapping("api/modificaretiqueta")
    public String modificarEtiqueta(@RequestBody Etiqueta etiqueta) {
        return "Modificar etiqueta...";
    }

    @DeleteMapping("api/eliminaretiqueta/{lenguaje}")
    public String eliminarEtiquetaPorLenguaje(@PathVariable String lenguaje) {
        return "Eliminar etiqueta" + lenguaje;
    }

    @DeleteMapping("api/eliminartodaslasetiquetas")
    public String eliminarTodasLasEtiqutas() {
        return "Eliminar todas las etiquetas...";
    }
}
