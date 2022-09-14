package com.example.spring_data_jdbc_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
public class SpringDataJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcDemoApplication.class, args);
	}

}
