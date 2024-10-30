package com.trainibit.microservices.primer_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GovernmentEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GovernmentEmployeesApplication.class, args);
	}

}
