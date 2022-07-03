package com.advaitvagupta.SkillTrackerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages = "com.advaitvagupta") //TODO Remove autoconfig and add data source
public class SkillTrackerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillTrackerServiceApplication.class, args);
	}

}
