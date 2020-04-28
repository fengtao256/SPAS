package com.lzl.spas.controller;

import com.lzl.spas.entity.EduCourse;
import com.lzl.spas.service.CourseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseServiceInterface courseServiceInterface;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
    public void delete(@PathVariable("id")String id){
        courseServiceInterface.delete(id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/insert")
    public void insert(EduCourse course){
        courseServiceInterface.insert(course);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/update/{id}")
    public void update(@RequestParam EduCourse course){
        courseServiceInterface.update(course);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,value = "/{id}/select")
    public EduCourse select(@PathVariable("id")String id){
        System.out.println("id========="+id);
        return courseServiceInterface.selectById(id);
    }
}
