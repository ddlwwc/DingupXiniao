package com.dingup.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DingupProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DingupProviderApplication.class, args);
	}
}
