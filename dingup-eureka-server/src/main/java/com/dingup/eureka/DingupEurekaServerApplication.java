package com.dingup.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DingupEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DingupEurekaServerApplication.class, args);
	}
}
