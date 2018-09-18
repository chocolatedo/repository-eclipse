package com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringbootConsulDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsulDemo01Application.class, args);
	}
}
