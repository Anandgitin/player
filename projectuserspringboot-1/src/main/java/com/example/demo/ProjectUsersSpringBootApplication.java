package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan({"com.controller", "com.dao", "com.model", "com.service"})
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
public class ProjectUsersSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectUsersSpringBootApplication.class, args);
    }
}
