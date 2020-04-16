package com.lzl.spas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login.action")
    public String hello(Model model){
        model.addAttribute("titleHead","欢迎登陆学生成绩分析系统");
        return "login" ;
    }
}
