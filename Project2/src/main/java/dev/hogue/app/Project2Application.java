package dev.hogue.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("dev.hogue")
@EntityScan("dev.hogue.entities")
@EnableJpaRepositories("dev.hogue.repositories")
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

}
