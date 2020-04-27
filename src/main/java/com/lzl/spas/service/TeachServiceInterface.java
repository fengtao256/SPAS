package com.lzl.spas.service;

import com.lzl.spas.entity.Teach;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeachServiceInterface {
    List<Teach> getMyCourseList(String teacherNo) ;
}
