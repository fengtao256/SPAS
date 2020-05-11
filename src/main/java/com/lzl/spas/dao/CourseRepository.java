package com.lzl.spas.dao;

import com.lzl.spas.entity.EduCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<EduCourse, String> {

}
