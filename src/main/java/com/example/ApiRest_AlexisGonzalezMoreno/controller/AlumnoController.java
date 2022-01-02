package com.example.ApiRest_AlexisGonzalezMoreno.controller;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Alumno;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.AlumnoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    private final Logger log = LoggerFactory.getLogger(AlumnoController.class);

    //attributes
    private AlumnoRepository alumnoRepository;

    //constructor
    public AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @GetMapping("api/mostraralumnos")
    public String mostrarAlumnos() {
        return "Mostrar todos los alumnos...";
    }

    @GetMapping("api/mostraralumno/{correoElectronico}")
    public String buscarPorCorreoElectronico(@PathVariable String correoElectronico) {
        return "Filtrar alumnos por id: " + correoElectronico;
    }

    @PostMapping("api/anadiralumno")
    public String anadirAlumno (@RequestBody Alumno alumno, @RequestHeader HttpHeaders headers) {
        return "Añadir alumno...";
    }

    @PutMapping("api/modificaralumno")
    public String modificarAlumno(@RequestBody Alumno alumno) {
        return "Modificar alumno alumno...";
    }

    @DeleteMapping("api/eliminaralumno/{correoElectronico}")
    public String eliminarPorCorreoElectronico(@PathVariable String correoElectronico) {
        return "Eliminar alumno por correo electrónico...";
    }

    @DeleteMapping("api/eliminartodoslosalumnos")
    public String eliminarTodosLosAlumnos() {
        return "Eliminar todos los alumnos...";
    }
}
