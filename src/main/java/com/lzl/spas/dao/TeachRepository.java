package com.lzl.spas.dao;

import com.lzl.spas.entity.EduCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TeachRepository extends JpaRepository<EduCourse, String> {

    @Query(value = "select c from EduCourse c where teaNo = :teaNo ")
    List<EduCourse> getMyCourseList(String teaNo);

    //多表联查
    @Query(value = "SELECT\n" +
            "\tc.course_no as courseNo,\n" +
            "\tc.course_name as courseName,\n" +
            "\tc.course_hour as courseHour,\n" +
            "\tc.credit_hour as creditHour,\n" +
            "\tt.tea_name as teaName,\n" +
            "\te.class_name as className\n" +
            "FROM\n" +
            "\tedu_course c\n" +
            "\tJOIN edu_teach t ON c.tea_no = t.tea_no\n" +
            "\tJOIN edu_class e ON c.class_no = e.class_no \n" +
            "WHERE\n" +
            "\tt.tea_no =:teaNo "  , nativeQuery = true)
    List<Map<String,Object>> getMyCourseListByTeaNo(String teaNo);
}
