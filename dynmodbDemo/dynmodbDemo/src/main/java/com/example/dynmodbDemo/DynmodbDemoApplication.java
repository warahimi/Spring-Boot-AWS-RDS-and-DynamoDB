package com.example.dynmodbDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;

@SpringBootApplication(exclude = {SpringDataWebAutoConfiguration.class})

public class DynmodbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynmodbDemoApplication.class, args);
	}

}
