package com.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoWiringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoWiringDemoApplication.class, args);
		System.out.println("autowired annotation is here");
	}

}
