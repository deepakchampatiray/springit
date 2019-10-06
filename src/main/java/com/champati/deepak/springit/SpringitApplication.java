package com.champati.deepak.springit;

import com.champati.deepak.springit.config.SpringItProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {

	@Autowired
	private SpringItProperties props;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
		System.out.println("Welcome to Spring Boot Application.");
	}

	@Bean
	//@Profile("dev")
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Welcome Message : " + props.getWelcomeMsg());
		};
	}

}
