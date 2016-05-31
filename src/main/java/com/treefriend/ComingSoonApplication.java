package com.treefriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.treefriend")
public class ComingSoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComingSoonApplication.class, args);
	}
}
