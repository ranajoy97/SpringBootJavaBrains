package org.home.springbootjpa.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan(basePackages={"org.home.springbootjpa.springbootjpa","org.home.topic","org.home.course"})
@EntityScan(basePackages={"org.home.springbootjpa.springbootjpa","org.home.topic","org.home.course"})
@EnableJpaRepositories(basePackages={"org.home.topic","org.home.course"})
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}