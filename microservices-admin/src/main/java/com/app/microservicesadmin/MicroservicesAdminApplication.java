package com.app.microservicesadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MicroservicesAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesAdminApplication.class, args);
	}

}
