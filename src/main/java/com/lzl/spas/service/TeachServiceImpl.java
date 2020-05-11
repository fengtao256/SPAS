package com.lzl.spas.service;

import com.lzl.spas.dao.TeachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TeachServiceImpl implements TeachServiceInterface {
    @Autowired
    TeachRepository teachRepository ;

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
}
