package com.example.springuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.springuserservice.repository")
@ComponentScan(basePackages = {"com.example.springuserservice"})
@EntityScan("com.example.springuserservice.entity")
public class SpringUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserServiceApplication.class, args);
	}
}
