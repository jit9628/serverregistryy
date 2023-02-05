package com.service.serverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerregistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerregistryApplication.class, args);
		System.out.println("Server is Started Mode .. ");
	}

}
