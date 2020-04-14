package com.lzl.spas.service;

import com.lzl.spas.dao.CourseRepositoryInterface;
import com.lzl.spas.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Optional;

@Component
public class CourseServiceImpl implements CourseServiceInterface{

    //引入dao层声明的方法
    @Autowired
    private CourseRepositoryInterface courseRepositoryInterface;

    @Override
    public void delete(String id) {
        Course course = new Course();
        course.setCourseNo(id);
        courseRepositoryInterface.delete(course);
    }

    @Override
    public void insert(Course course) {
        courseRepositoryInterface.save(course) ;
    }

    @Override
    public int update(Course course) {
        courseRepositoryInterface.save(course) ;
        return 0;
    }

    @Override
    public Course selectById(String id) {
        Optional<Course> optional = courseRepositoryInterface.findById(id) ;
        System.out.println("optional========"+optional);
        Course course = optional.get() ;
        return course;
    }

    @Override
    public Iterator<Course> selectAll(int pageNum, int pageSize) {

        return  null;
    }
}
