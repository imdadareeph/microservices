package com.app.microserviceszuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicesZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesZuulApplication.class, args);
	}

}
