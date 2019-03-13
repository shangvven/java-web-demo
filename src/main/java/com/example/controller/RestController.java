package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String sayHello() {
        return "这是一个测试应用!";
    }
}
