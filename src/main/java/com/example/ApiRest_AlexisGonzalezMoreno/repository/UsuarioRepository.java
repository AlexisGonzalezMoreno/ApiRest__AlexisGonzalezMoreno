package com.example.ApiRest_AlexisGonzalezMoreno.repository;

import com.example.ApiRest_AlexisGonzalezMoreno.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
