package com.lzl.spas.dao;

import com.lzl.spas.entity.EduClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ClassRepository extends JpaRepository<EduClass, String> {
    /**
     * 根据学生学号查询我的班级
     * @param studentNo
     * @return
     */
    @Query(value = "SELECT\n" +
            "\ts.student_name AS studentName,\n" +
            "\tc.class_name AS className,\n" +
            "\tc.grade AS grade,\n" +
            "\tc.institude AS institude \n" +
            "FROM\n" +
            "\tedu_class AS c\n" +
            "\tJOIN edu_student AS s ON c.class_no = s.class_no \n" +
            "WHERE\n" +
            "\ts.class_no IN (\n" +
            "\tSELECT\n" +
            "\t\tclass_no \n" +
            "\tFROM\n" +
            "\t\tedu_student \n" +
            "\tWHERE\n" +
            "\tstudent_no = :studentNo \n" +
            "\t)",nativeQuery = true)
   List<Map<String,Object>>getMyClassByStuNo(String studentNo);

    /**
     * 根据教师编号查询我的教学班级
     * @param teaNo
     * @return
     */
    @Query(value = "SELECT\n" +
            "\ta.class_no AS classNo,\n" +
            "\ta.class_name AS className,\n" +
            "\ta.class_num AS classNum,\n" +
            "\ta.grade AS grade,\n" +
            "\ta.institude AS institude\n" +
            "FROM\n" +
            "\tedu_class AS a\n" +
            "\tJOIN edu_course AS b ON a.class_no = b.class_no \n" +
            "WHERE\n" +
            "\tb.class_no IN (\n" +
            "\tSELECT\n" +
            "\t\tclass_no \n" +
            "\tFROM\n" +
            "\t\tedu_course \n" +
            "WHERE\n" +
            "\ttea_no = :teaNo) GROUP BY classNo",nativeQuery = true)
    List<Map<String,Object>>getMyClassByTeaNo(String teaNo);
}
