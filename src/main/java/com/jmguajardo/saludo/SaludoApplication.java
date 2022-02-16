package com.jmguajardo.saludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.jmguajardo.saludo.controllers", "com.jmguajardo.saludo.services", "com.jmguajardo.saludo.exceptions"})
@EntityScan("com.jmguajardo.saludo.models.entities")
@EnableJpaRepositories("com.jmguajardo.saludo.repositories")
public class SaludoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaludoApplication.class, args);
	}

}
