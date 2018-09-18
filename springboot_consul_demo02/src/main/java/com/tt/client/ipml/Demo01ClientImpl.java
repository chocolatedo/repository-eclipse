package com.tt.client.ipml;

import org.springframework.stereotype.Component;

import com.tt.client.Demo01Client;

@Component
public class Demo01ClientImpl implements Demo01Client {

	@Override
	public String demo01SayHello() {		
		return "demo02 调用demo01 失败！！";
	}

}
