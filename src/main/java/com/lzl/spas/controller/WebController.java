package com.lzl.spas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class WebController {
    //登录页的位置的位置
    @RequestMapping("/login.index")
    public String login(Model model) {
        model.addAttribute("titleHead", "欢迎登陆学生成绩分析系统");
        return "login";
    }
    //实现默认跳转访问页面，添加路由为"/"
    @RequestMapping("/")
    public String defaultHtml(Model model) {
        model.addAttribute("titleHead", "欢迎登陆学生成绩分析系统");
        return "login";
    }

    //实现默认跳转访问页面，添加路由为"/"
    @RequestMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("titleHead", "欢迎登陆学生成绩分析系统");
        return "login";
    }

    @RequestMapping("/stuHome.html")
    public String stuHomePage(Model model) {
        return "stuHomePage";
    }

    //实现默认跳转访问页面，添加路由为"/"
    @RequestMapping("/teaHome.html")
    public String teaHomePage(Model model) {
        return "teaHomePage";
    }
}
