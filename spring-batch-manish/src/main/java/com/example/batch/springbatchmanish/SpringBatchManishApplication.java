package com.example.batch.springbatchmanish;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchManishApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchManishApplication.class, args);
	}
}
