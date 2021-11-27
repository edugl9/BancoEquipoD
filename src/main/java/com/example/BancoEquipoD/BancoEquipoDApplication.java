package com.example.BancoEquipoD;

import com.example.BancoEquipoD.consumingrest.ConsumingRestApplication;
import com.example.BancoEquipoD.dto.Usuario;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
public class BancoEquipoDApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoEquipoDApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();

	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setUsername("edu");
			Usuario user = restTemplate.getForObject("http://localhost:8080/api/auth/obtenerusuario/" + usuario.getUsername(), Usuario.class);

		};
	}

	//private void login(RestTemplate restTemplate, )
}
