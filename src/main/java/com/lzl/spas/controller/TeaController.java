package com.lzl.spas.controller;

import com.lzl.spas.entity.Course;
import com.lzl.spas.entity.Teach;
import com.lzl.spas.service.CourseServiceInterface;
import com.lzl.spas.service.TeachServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TeaController {

    @Autowired
    private CourseServiceInterface courseServiceInterface;
    @Autowired
    private TeachServiceInterface teachServiceInterface;
    /**
     * 获取全部课程
     * @param model
     * @return
     */
    @RequestMapping("/teacher/couMgr/courseList")
    public String teaCourseHtml(Model model) {
        List<Course> courseList = courseServiceInterface.selectAll() ;
        model.addAttribute("courseList" , courseList) ;
        return "/teacher/couMgr/courseList";
    }

    /**
     * 获取我的课程列表
     * @param model
     * @return
     */
    @RequestMapping("/teacher/couMgr/myCourseList")
    public String myCourseList(Model model , HttpSession session) {
        String teacherNo = (String)session.getAttribute("userNo") ;
        List<Teach> myCourseList = teachServiceInterface.getMyCourseList(teacherNo) ;
        model.addAttribute("myCourseList" , myCourseList) ;
        return "/teacher/couMgr/myCourseList";
    }
}
