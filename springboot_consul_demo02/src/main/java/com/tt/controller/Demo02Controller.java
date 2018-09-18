package com.tt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tt.client.Demo01Client;

@RestController
@RequestMapping("/demo02")
public class Demo02Controller {

	@Autowired
	private Demo01Client demo01Client;

	/**
	 * demo02自带方法
	 * 
	 * @return
	 */
	@GetMapping("/demo02")
	public String demo02SayGoodbye() {
		System.out.println("demo02-SayGoodbye");
		return "demo02-SayGoodbye";
	}

	/**
	 * demo02 调用demo01中的方法
	 * @return
	 */
	@GetMapping("/demo01")
	public String demo01SayHello() {

		return demo01Client.demo01SayHello();
	}
}
