package com.example.ApiRest_AlexisGonzalezMoreno;

import com.example.ApiRest_AlexisGonzalezMoreno.repository.AlumnoRepository;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.EtiquetaRepository;
import com.example.ApiRest_AlexisGonzalezMoreno.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiRest_AlexisGonzalezMoreno {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ApiRest_AlexisGonzalezMoreno.class, args);
		AlumnoRepository alumnoRepository = context.getBean(AlumnoRepository.class);
		UsuarioRepository usuarioRepository = context.getBean(UsuarioRepository.class);
		EtiquetaRepository etiquetaRepository = context.getBean(EtiquetaRepository.class);
	}
}
