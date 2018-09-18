package com.tt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo01")
public class Demo01Controller {

	/**
	 * demo01自带方法
	 * 
	 * @return
	 */
	@GetMapping("/demo01")
	public String demo01SayHello() {
		System.out.println("demo01-SayGoodbye1");
		System.out.println("demo01-SayGoodbye2");
		System.out.println("demo01-SayGoodbye3");
		System.out.println("demo01-SayGoodbye4");
		System.out.println("demo01-SayGoodbye5");
		System.out.println("demo01-SayGoodbye6");
		System.out.println("demo01-SayGoodbye7");
		System.out.println("demo01-SayGoodbye8");
		System.out.println("demo01-SayGoodbye9");
		System.out.println("demo01-SayGoodbye10");
		return "demo01-SayGoodbye";
	}
}
