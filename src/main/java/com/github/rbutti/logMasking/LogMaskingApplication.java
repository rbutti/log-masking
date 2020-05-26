package com.github.rbutti.logMasking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class LogMaskingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogMaskingApplication.class, args);
	}

}
