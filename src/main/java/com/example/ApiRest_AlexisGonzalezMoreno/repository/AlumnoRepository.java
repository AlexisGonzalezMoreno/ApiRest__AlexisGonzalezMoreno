package com.example.ApiRest_AlexisGonzalezMoreno.repository;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {
}
