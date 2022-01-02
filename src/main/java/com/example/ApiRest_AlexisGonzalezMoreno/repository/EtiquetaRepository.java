package com.example.ApiRest_AlexisGonzalezMoreno.repository;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends JpaRepository<Etiqueta, String> {
}
