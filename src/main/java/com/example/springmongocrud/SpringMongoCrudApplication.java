package com.example.springmongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example"})
public class SpringMongoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoCrudApplication.class, args);
	}

}
