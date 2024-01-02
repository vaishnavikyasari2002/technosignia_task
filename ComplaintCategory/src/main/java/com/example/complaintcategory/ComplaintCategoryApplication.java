package com.example.complaintcategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComplaintCategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintCategoryApplication.class, args);
	}

}
