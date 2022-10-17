package com.example.demo.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @GetMapping("/hello") //hello?name=Abc
    @ResponseBody
    public String hello(@RequestParam("name") String name){
        return "Hello "+name;
        
    }
    
    @GetMapping("hi/{name}") //hi//Abc(name) / hi/pqr
    @ResponseBody
   public String hi(@PathVariable("name") String name)    {
     return "Hi "+name;
}
}