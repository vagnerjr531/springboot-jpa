package com.br.springjr.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.springjr.curso.entities.User;
import com.br.springjr.curso.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAllAndFlush(Arrays.asList(u1,u2));
		
		
	}
}

//popular o banco de dados com alguns objetos;database seeding
//tem que ter uma depedência parra po UserRepsitory
//quando estamos usando um framework ele tem um mecânismo de injeção de dependência implicito automático ;
//para instânciar os objetos e salvar no banco de dados , como fazer para executar quano o programa for iniciado utliza o implements ComamandLineRunner;
// e depois implementa os metodos m que é o puclic void run - dentro dele instanciamos ;