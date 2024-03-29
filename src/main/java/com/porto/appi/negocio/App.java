package com.porto.appi.negocio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	@Value("${url.appI}")
	private String variavelAcesso;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRUnner() {
		return args -> {
			System.out.println("aplicattion ativado: "+ this.variavelAcesso);
		};
	}

}
