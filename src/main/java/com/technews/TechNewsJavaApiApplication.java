package com.technews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.technews"})
public class TechNewsJavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechNewsJavaApiApplication.class, args);
	}

}
