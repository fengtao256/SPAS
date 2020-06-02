package com.lzl.spas.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface StudentServiceInterface {
    List<Map<String,Object>> getMyCourseList(String studentNo);
}
