package com.tt.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tt.client.ipml.Demo01ClientImpl;

@FeignClient(value = "demo01", fallback=Demo01ClientImpl.class)
public interface Demo01Client {

	@GetMapping("/demo01/demo01")
	String demo01SayHello();
}
