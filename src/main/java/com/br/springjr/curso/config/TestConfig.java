package com.br.springjr.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.springjr.curso.entities.Category;
import com.br.springjr.curso.entities.Order;
import com.br.springjr.curso.entities.Product;
import com.br.springjr.curso.entities.User;
import com.br.springjr.curso.entities.enums.OrderStatus;
import com.br.springjr.curso.repository.*;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

   
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductRepository productRepository;

   

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
	
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITYNG_PAYMENT, u2); // associação
																									// entre
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));																									// objetos;
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		userRepository.saveAllAndFlush(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

	}
}

//popular o banco de dados com alguns objetos;database seeding
//tem que ter uma depedência parra po UserRepsitory
//quando estamos usando um framework ele tem um mecânismo de injeção de dependência implicito automático ;
//para instânciar os objetos e salvar no banco de dados , como fazer para executar quano o programa for iniciado utliza o implements ComamandLineRunner;
// e depois implementa os metodos m que é o puclic void run - dentro dele instanciamos ;