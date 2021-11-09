package it.nttdata.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellospringbootApplication {

	public static void main(String[] args) {
		System.out.println("Ciamo mondo 2");
		SpringApplication.run(HellospringbootApplication.class, args);
	}

}
