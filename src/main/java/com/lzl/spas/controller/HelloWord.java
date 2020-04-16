package com.lzl.spas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("welcome","刘卓林");
        System.out.println("测试返回model===="+model.getAttribute("welcome"));
        return "hello" ;
    }
}
