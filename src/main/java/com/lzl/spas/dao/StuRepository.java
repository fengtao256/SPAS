package com.lzl.spas.dao;

import com.lzl.spas.entity.EduStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface StuRepository extends JpaRepository<EduStudent, String>{
    /**
     * 根据学生学号查询我的课程
     * @param studentNo
     * @return
     */

    @Query(value = "SELECT\n" +
            "\tc.course_no AS courseNo,\n" +
            "\tc.course_name AS courseName,\n" +
            "\tc.credit_hour AS creditHour,\n" +
            "\tc.course_hour AS courseHour,\n" +
            "\tt.tea_name AS teaName \n" +
            "FROM\n" +
            "\tedu_course AS c\n" +
            "\tJOIN edu_teach AS t ON c.tea_no = t.tea_no \n" +
            "WHERE\n" +
            "\t class_no IN (\n" +
            "\tSELECT\n" +
            "\t\tclass_no \n" +
            "\tFROM\n" +
            "\t\tedu_student \n" +
            "WHERE\n" +
            "\tstudent_no = :studentNo)",nativeQuery = true)
    List<Map<String,Object>> getCourseByStuNo(String studentNo) ;
}