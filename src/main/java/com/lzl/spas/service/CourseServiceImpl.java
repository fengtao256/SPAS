package com.lzl.spas.service;

import com.lzl.spas.dao.CourseRepository;
import com.lzl.spas.entity.Course;
import com.lzl.spas.entity.EduCourse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CourseServiceImpl implements CourseServiceInterface{

    //引入dao层声明的方法
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public void delete(String id) {
        EduCourse course = new EduCourse();
        course.setCourseNo(id);
        courseRepository.delete(course);
    }

    @Override
    public void insert(EduCourse course) {
        courseRepository.save(course) ;
    }

    @Override
    public int update(EduCourse course) {
        courseRepository.save(course) ;
        return 0;
    }

    @Override
    public EduCourse selectById(String id) {
        Optional<EduCourse> optional = courseRepository.findById(id) ;
        System.out.println("optional========"+optional);
        EduCourse course = optional.get() ;
        return course;
    }

    @Override
    public List<EduCourse> selectAll() {
        List<EduCourse> courseList = courseRepository.findAll() ;
        return  courseList;
    }
}
