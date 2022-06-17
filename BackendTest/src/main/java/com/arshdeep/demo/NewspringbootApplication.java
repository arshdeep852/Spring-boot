package com.arshdeep.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@EnableJpaRepositories(basePackages = "com.arshdeep.demo")
@SpringBootApplication
public class NewspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspringbootApplication.class, args);
	}


}
