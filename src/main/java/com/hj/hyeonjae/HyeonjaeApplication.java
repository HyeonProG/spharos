package com.hj.hyeonjae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HyeonjaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyeonjaeApplication.class, args);
	}

}
