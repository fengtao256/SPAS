package com.lzl.spas.service;

import com.lzl.spas.dao.ClassRepository;
import com.lzl.spas.dao.TeachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TeachServiceImpl implements TeachServiceInterface {
    @Autowired
    TeachRepository teachRepository ;
    @Autowired
    ClassRepository classRepository;

    /**
     * 查询我的课程
     * @param teaNo
     * @return
     */
    @Override
    public List<Map<String,Object>> getMyCourseList(String teaNo) {
//        return teachRepository.getMyCourseList(teaNo) ;
        return teachRepository.getMyCourseListByTeaNo(teaNo) ;
    }

    /**
     * 查询我的教学班级
     * @param teaNo
     * @return
     */

    @Override
    public List<Map<String,Object>> getMyClassList(String teaNo) {
//
        return classRepository.getMyClassByTeaNo(teaNo) ;
    }
}
