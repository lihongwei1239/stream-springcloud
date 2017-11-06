package com.stream.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StreamEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamEurekaApplication.class, args);
	}
}
