package com.lzl.spas.service;

import com.lzl.spas.dao.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class StudentServiceImpl implements StudentServiceInterface{
    @Autowired
    private StuRepository stuRepository;

    @Override //重新父类方法
    public List<Map<String, Object>> getMyCourseList(String studentNo) {
        return stuRepository.getCourseByStuNo(studentNo);
    }
}
