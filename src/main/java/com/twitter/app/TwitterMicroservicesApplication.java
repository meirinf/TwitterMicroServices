package com.twitter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.twitter.entity"}) 
public class TwitterMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterMicroservicesApplication.class, args);
	}

}
