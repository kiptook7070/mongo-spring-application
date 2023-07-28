package com.eclectics.io.mongoservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoServiceApplication implements CommandLineRunner {
private static final Logger LOGGER = LoggerFactory.getLogger(MongoServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MongoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Mongo Service Application Started Successfully");
	}
}
