package com.example.feignpproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignpprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignpprojectApplication.class, args);
	}

}
