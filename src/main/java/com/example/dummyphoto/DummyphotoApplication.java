package com.example.dummyphoto;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DummyphotoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyphotoApplication.class, args);
	}
	
	
}
