package br.com.documentos.api;

import org.springframework.boot.SpringApplication; // Inicia o springboot
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Procura as classes e configura a aplicação
public class Application {

	// Faz subir o servidor Tomcat e todas as arrancadas do projeto
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
