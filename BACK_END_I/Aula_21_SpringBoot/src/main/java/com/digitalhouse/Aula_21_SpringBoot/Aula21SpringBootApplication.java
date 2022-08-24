package com.digitalhouse.Aula_21_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula21SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aula21SpringBootApplication.class, args);
	}

	@GetMapping
	public  String OlaMundo(){
		return "Olá Mundo";
	}

}
