package com.eg.csa.com.eg.csa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	CustomerRepository crepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		crepo.save(new Customer(1,"Aakanksha", "Saini", 22));
		crepo.save(new Customer(2,"Zoya", "Yasin", 22));
		crepo.save(new Customer(3,"Achira", "Pal", 22));
		
		crepo.save(new Customer(4,"fghds","kdfj",23));
	}
}
