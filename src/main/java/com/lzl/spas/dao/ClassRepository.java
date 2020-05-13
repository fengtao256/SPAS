package com.lzl.spas.dao;

import com.lzl.spas.entity.EduClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<EduClass, String> {

    List<EduClass> findByTeaNo(String teaNo) ;
}
