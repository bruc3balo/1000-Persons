package com.example.randomuser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class RandomUserApplication implements CommandLineRunner {

	private final PersonService personService;

	public RandomUserApplication(PersonService personService) {
		this.personService = personService;
	}

	public static void main(String[] args) {
		SpringApplication.run(RandomUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("Person "+ (i + 1));
			personService.get1000Persons();
		}
	}
}
