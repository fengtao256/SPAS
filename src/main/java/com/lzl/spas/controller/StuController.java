package com.lzl.spas.controller;

import com.lzl.spas.entity.EduCourse;
import com.lzl.spas.service.*;
import org.hibernate.boot.registry.classloading.spi.ClassLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Controller
public class StuController {
    @Autowired
    private CourseServiceInterface courseServiceInterface;
    @Autowired
    private StudentServiceInterface studentServiceInterface ;
    @Autowired
    private ClassServiceInterface  classServiceInterface;
    @Autowired
    private ScoreServiceInterface scoreServiceInterface;

    /**
     * 获取全部课程
     * @param model
     * @return
     */

    @RequestMapping("/student/couMgr/courseList")
    public String stuCourseList(Model model){
        List<Map<String, Object>> courseList = courseServiceInterface.getCourseList();
        model.addAttribute("courseList" , courseList);
        System.out.println(courseList);
        return "/student/couMgr/courseList";
    }

    /**
     * 获取我的课程列表
     * @param model
     * @return
     */
    @RequestMapping("/student/couMgr/myCourseList")
    public String myCourseList(Model model, HttpSession session){
        String studentNo=(String)session.getAttribute("userNo");
        System.out.println("学生编号是=" +studentNo);
        List<Map<String,Object>> myCourseList= new ArrayList<Map<String,Object>>() ;
        //TODO:获取课程列表业务（service）
        myCourseList = studentServiceInterface.getMyCourseList(studentNo) ;
        //加到模板model
        System.out.println("myCourseList"+myCourseList);
        model.addAttribute("myCourseList",myCourseList) ;

        return "/student/couMgr/myCourseList" ;
    }
    /**
     * 获取我的班级
     * @param model
     * @return
     */
    @RequestMapping("/student/classMgr/myClass")
    public String myClass(Model model,HttpSession session){
        String studentNo=(String)session.getAttribute("userNo");
        System.out.println("学生编号是=" +studentNo);
        List<Map<String,Object>> myclass= new ArrayList<Map<String,Object>>() ;
        //TODO:获取课程列表业务（service）
        myclass=classServiceInterface.getMyClass(studentNo);
        model.addAttribute("myClass",myclass);
        return "/student/classMgr/myClass";
    }

    /**
     * 获取我的所有成绩
     * @param model
     * @return
     */
    @RequestMapping("/student/scoreMgr/scoreList")
    public String scoreList(Model model,HttpSession session){
        String studentNo=(String)session.getAttribute("userNo");
        System.out.println("学生编号是="+studentNo);
        //TODO:获取所有成绩列表业务（service）
        List<Map<String, Object>> scoreList = scoreServiceInterface.getScoreList(studentNo);
        model.addAttribute("scoreList",scoreList);
        return "/student/scoreMgr/scoreList";
    }

}

