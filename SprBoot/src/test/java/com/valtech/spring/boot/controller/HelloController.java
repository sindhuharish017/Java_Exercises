package com.valtech.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.valtech.spring.boot.HelloWorld;

@Controller
public class HelloController {

	@Autowired
	private HelloWorld helloWorld;
	@RequestMapping(method=RequestMethod.GET,path="/hello")
	@ResponseBody
//	http:localhost:8080/hello?name=Valtech
	public String hello(@RequestParam("name")String name) {
		return helloWorld.hello(name);
	}
	@GetMapping("/hi/{name}")
	@ResponseBody
	public String hi(String name) {
		return "Hii " +name;
	}
}
