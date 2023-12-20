package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@ComponentScan(basePackages = {"com.example.demo.controller","com.example.demo.model"})
public class JobScraper2Application {

	public static void main(String[] args) {
		SpringApplication.run(JobScraper2Application.class, args);
	}

}
