package com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringbootConsulDemo04Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsulDemo04Application.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public static RestTemplate geTemplate() {
		return new RestTemplate();
	}
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@GetMapping("/aa")
	public void name() {
		geTemplate().getForObject("http://demo01/demo01/demo01", String.class);
	}
}
