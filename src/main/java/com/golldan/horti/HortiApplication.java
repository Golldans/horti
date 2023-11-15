package com.golldan.horti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
		"com.golldan.horti.infra", "com.golldan.horti.presentation"})
@EnableJpaRepositories("com.golldan.horti.infra.repositories")
public class HortiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HortiApplication.class, args);
	}

}
