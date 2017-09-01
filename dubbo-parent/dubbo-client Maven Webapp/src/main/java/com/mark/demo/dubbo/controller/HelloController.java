package com.mark.demo.dubbo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.demo.dubbo.service.HelloWorld;

/*
*hxp(huang.xp@topcheer.com)
*
*/
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Resource(name="helloWorld")
	private HelloWorld helloService;
	
	@RequestMapping("/say")
	public String sayHello(String name){
		return helloService.sayHello(name);
	}

}
