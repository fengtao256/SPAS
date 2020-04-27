package com.lzl.spas.service;

import com.lzl.spas.dao.TeachRepository;
import com.lzl.spas.entity.Teach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeachServiceImpl implements TeachServiceInterface {
    @Autowired
    TeachRepository teachRepository ;

    /**
     * 查询我的课程
     * @param teacherNo
     * @return
     */
    @Override
    public List<Teach> getMyCourseList(String teacherNo) {
        return teachRepository.getMyCourseList(teacherNo) ;
    }
}
