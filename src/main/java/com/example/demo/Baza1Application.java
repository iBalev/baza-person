package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Baza1Application implements CommandLineRunner {
	
		@Autowired
		private PersonRepo repo;
		
	public static void main(String[] args) {
		SpringApplication.run(Baza1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aloo!!!");
		Person covek1=new Person("Tanas", "Gjorgoski", 45);
		Person covek2=new Person("Gordana", "Gjorgoska", 45);
		repo.save(covek1);
		repo.save(covek2);
		Person p1 = repo.getByName("Tanas");
		System.out.println(p1.getAge());
	
	}
	
	
}
