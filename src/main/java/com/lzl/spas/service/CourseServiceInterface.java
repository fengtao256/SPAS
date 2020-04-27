package com.lzl.spas.service;

import com.lzl.spas.entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseServiceInterface {
    /** 删除 */
    void delete(String id);
    /** 增加*/
    void insert(Course user);
    /** 更新*/
    int update(Course user);
    /** 查询单个*/
    Course selectById(String id);
    /** 查询全部列表*/
    List<Course> selectAll();
}
