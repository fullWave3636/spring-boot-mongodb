package com.example.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackageClasses = com.example.springmongo.controller.controller.class)
@ComponentScan(basePackageClasses = com.example.springmongo.service.EmployeeService.class)
public class SpringMongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}
}
