package com.lzl.spas.service;
import com.lzl.spas.dao.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public class ClassServiceImpl implements ClassServiceInterface {

    @Autowired
    private ClassRepository classRepository ;

    @Override
    public List<Map<String,Object>> getMyClass(String studentNo) {
        return classRepository.getMyClassByStuNo(studentNo);
    }
}
