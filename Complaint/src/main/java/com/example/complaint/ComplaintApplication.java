package com.example.complaint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ComplaintApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ComplaintApplication.class, args);
	}

}
