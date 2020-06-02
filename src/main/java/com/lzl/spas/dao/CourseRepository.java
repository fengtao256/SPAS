package com.lzl.spas.dao;

import com.lzl.spas.entity.EduCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CourseRepository extends JpaRepository<EduCourse, String> {

    //查询所有课程的列表

    @Query(value = "SELECT\n" +
            "\tcourse_no AS courseNo,\n" +
            "\tcourse_name AS courseName,\n" +
            "\tcredit_hour AS creditHour,\n" +
            "\tcourse_hour AS courseHour \n" +
            "FROM\n" +
            "\tedu_course \n" +
            "GROUP BY\n" +
            "\tcourseNo,courseName,creditHour,courseHour"  , nativeQuery = true)
    List<Map<String, Object>> getCourseList();


}
