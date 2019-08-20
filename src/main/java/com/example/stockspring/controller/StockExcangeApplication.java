package com.example.stockspring.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.example.stockspring.model",  "com.example.stockspring.service","com.example.stockspring.controller"})
@EnableJpaRepositories(basePackages = {"com.example.stockspring.dao"})
public class StockExcangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockExcangeApplication.class, args);
	}

}
