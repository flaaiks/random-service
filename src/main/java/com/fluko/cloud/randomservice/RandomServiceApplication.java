package com.fluko.cloud.randomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class RandomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomServiceApplication.class, args);
	}

}
