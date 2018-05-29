package com.school.app.schoolwebapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.school.app.*")
public class SchoolWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolWebAppApplication.class, args);
	}
}
