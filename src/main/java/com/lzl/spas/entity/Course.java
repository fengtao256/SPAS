package com.lzl.spas.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    public Course(){

    }
    //主键属性
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private String courseNo ;
    @Column(nullable = false)
    private String courseName ;
    @Column(nullable = false)
    private Integer creditHour ;
    @Column(nullable = false)
    private Integer courseHour ;

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

    public Integer getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(Integer creditHour) {
        this.creditHour = creditHour;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }
}