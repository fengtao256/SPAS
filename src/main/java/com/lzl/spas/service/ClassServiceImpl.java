package com.lzl.spas.service;

import com.lzl.spas.dao.ClassRepository;
import com.lzl.spas.entity.EduClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassServiceImpl implements ClassServiceInterface {

    @Autowired
    private ClassRepository classRepository ;

    @Override
    public List<EduClass> getMyClassList(String teaNo) {
        return classRepository.findByTeaNo(teaNo);
    }
}
