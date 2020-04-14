package com.lzl.spas.service;

import com.lzl.spas.entity.Course;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public interface CourseServiceInterface {
    /** 删除 */
    public void delete(String id);
    /** 增加*/
    public void insert(Course user);
    /** 更新*/
    public int update(Course user);
    /** 查询单个*/
    public Course selectById(String id);
    /** 查询全部列表*/
    public Iterator<Course> selectAll(int pageNum, int pageSize);
}
