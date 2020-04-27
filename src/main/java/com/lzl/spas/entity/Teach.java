package com.lzl.spas.entity;

import javax.persistence.*;

@Entity
@Table(name = "teach")
public class Teach {
    //主键属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )//主键由程序控制
    private String courseNo ;
    @Column(nullable = false)
    private String courseName ;
    @Column(nullable = false)
    private String teacher ;
    @Column(nullable = false)
    private String grade ;
    @Column(nullable = false)
    private String teacherNo ;

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }
}
