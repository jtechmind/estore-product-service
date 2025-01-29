package com.jtechmind.estore_product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EstoreProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoreProductServiceApplication.class, args);
	}

}
