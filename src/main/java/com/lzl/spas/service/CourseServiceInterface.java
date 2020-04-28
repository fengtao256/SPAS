package com.lzl.spas.service;

import com.lzl.spas.entity.Course;
import com.lzl.spas.entity.EduCourse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseServiceInterface {
    /** 删除 */
    void delete(String id);
    /** 增加*/
    void insert(EduCourse course);
    /** 更新*/
    int update(EduCourse course);
    /** 查询单个*/
    EduCourse selectById(String id);
    /** 查询全部列表*/
    List<EduCourse> selectAll();
}
