package com.lzl.spas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeaController {
    //
    @RequestMapping("/teacher/couMgr/courseList")
    public String teaCourseHtml(Model model) {
        return "/teacher/couMgr/courseList";
    }
}
