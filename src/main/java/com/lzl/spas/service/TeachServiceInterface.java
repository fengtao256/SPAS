package com.lzl.spas.service;

import com.lzl.spas.entity.EduCourse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface TeachServiceInterface {
    List<Map<String,Object>> getMyCourseList(String teaNo) ;
}
