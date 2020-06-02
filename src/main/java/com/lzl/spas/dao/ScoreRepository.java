package com.lzl.spas.dao;

import com.lzl.spas.entity.EduScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ScoreRepository extends JpaRepository<EduScore, String> {
    /**
     * 根据学生学号查询我的所有成绩
     * @param studentNo
     * @returny
     */
    @Query(value = "SELECT\n" +
            "\tc.course_name AS courseName,\n" +
            "\ts.course_no AS courseNo,\n" +
            "\ts.tea_name AS teaName,\n" +
            "\ts.score AS score \n" +
            "FROM\n" +
            "\tedu_score AS s\n" +
            "\tJOIN edu_course AS c ON s.course_no = c.course_no \n" +
            "WHERE\n" +
            "\tstudent_no = :studentNo \n" +
            "GROUP BY\n" +
            "\tcourseName,\n" +
            "\tcourseNo,\n" +
            "\tteaName,\n" +
            "\tscore",nativeQuery = true)
    List<Map<String,Object>>getScoreListByStuNo(String studentNo);

}
