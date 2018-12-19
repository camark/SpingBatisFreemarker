package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Hello")
@RestController
public class HelloController{
    
    @RequestMapping(value="/index")
    public String Index(){
        return "Hi Spring Boot!";
    }
}