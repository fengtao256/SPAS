package com.lzl.spas.controller;

import com.lzl.spas.entity.EduCourse;
import com.lzl.spas.service.CourseServiceInterface;
import com.lzl.spas.service.TeachServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

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
        List<EduCourse> courseList = courseServiceInterface.selectAll() ;
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
        String teaNo = (String)session.getAttribute("userNo") ;
        System.out.println("教师编号是="+teaNo);
        List<Map<String,Object>> myCourseList = teachServiceInterface.getMyCourseList(teaNo) ;
        model.addAttribute("myCourseList" , myCourseList) ;
        return "/teacher/couMgr/myCourseList";
    }

    /**
     * 获取我的班级列表
     * @param model
     * @return
     */
    @RequestMapping("/teacher/couMgr/classList")
    public String myClassList(Model model , HttpSession session) {
        String teaNo = (String)session.getAttribute("userNo") ;
        System.out.println("教师编号是="+teaNo);
        List<Map<String,Object>> myCourseList = teachServiceInterface.getMyCourseList(teaNo) ;
        model.addAttribute("myCourseList" , myCourseList) ;
        return "/teacher/couMgr/classList";
    }
}
