package com.lzl.spas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWord {

    @ResponseBody
    @RequestMapping("/test")
    public String hello(){
        return "hello" ;
    }
}
