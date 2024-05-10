package com.cash.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.cash.demo.repository")

public class DemoApplication {

	public static void mailn(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
