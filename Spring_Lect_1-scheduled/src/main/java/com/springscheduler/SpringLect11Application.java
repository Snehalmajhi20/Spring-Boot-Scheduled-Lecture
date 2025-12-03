package com.springscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringLect11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLect11Application.class, args);
	}

}
