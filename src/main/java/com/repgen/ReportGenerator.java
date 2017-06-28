package com.repgen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class ReportGenerator {

	public static void main(String[] args) {
		SpringApplication.run(ReportGenerator.class, args);
	}
}
