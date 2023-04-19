package com.pragma.plaza_comida_usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PlazaComidaUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlazaComidaUsuariosApplication.class, args);
	}

}
