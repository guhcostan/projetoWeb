package com.web.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = "com.web.project")
@EnableJpaRepositories(basePackages = "com.web.project")
@EnableScheduling
public class ProjectApplication {

	private ProjectApplication() {

	}

	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
	}

}
