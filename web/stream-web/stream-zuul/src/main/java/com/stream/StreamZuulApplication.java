package com.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StreamZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamZuulApplication.class, args);
	}
}
