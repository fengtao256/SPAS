package com.lzl.spas.entity;

import javax.persistence.*;

@Entity
@Table(name = "edu_teach")
public class EduTeach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO代表程序控制主键
    String courseNo;
    @Column
    String courseName ;
    @Column
    String teaNo ;
    @Column
    String teaName ;
    @Column
    String grade ;

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

    public String getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(String teaNo) {
        this.teaNo = teaNo;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
