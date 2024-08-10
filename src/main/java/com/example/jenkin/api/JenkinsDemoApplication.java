package com.example.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	@PostConstruct
	public  in() {
		logger.info("Application Started....!");
	}

	public static void main(String[] args) {
		logger.info("Application Executed....!");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
