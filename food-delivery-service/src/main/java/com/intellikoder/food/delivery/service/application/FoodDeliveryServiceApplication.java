package com.intellikoder.food.delivery.service.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class FoodDeliveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryServiceApplication.class, args);

	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
