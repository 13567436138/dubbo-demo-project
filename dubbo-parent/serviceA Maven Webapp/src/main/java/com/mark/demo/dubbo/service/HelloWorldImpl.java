package com.mark.demo.dubbo.service;

import org.springframework.stereotype.Component;

/*
*hxp(huang.xp@topcheer.com)
*
*/
@Component
public class HelloWorldImpl implements HelloWorld {

	public String sayHello(String hello) {
		return "hi "+hello;
	}

}
