package com.lzl.spas.service;

import com.lzl.spas.entity.EduClass;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClassServiceInterface {

    List<EduClass> getMyClassList(String teaNo);
}
