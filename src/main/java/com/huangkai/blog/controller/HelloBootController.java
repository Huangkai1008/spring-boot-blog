package com.huangkai.blog.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {

    @RequestMapping("hello")
    public String helloBoot(){
        return "hello world";
    }
}
