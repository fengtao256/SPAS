package com.lzl.spas.entity;


import javax.persistence.*;

@Entity
@Table(name = "edu_class")
public class EduClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO代表程序控制主键
    String classNo;
    @Column
    String className ;
    @Column
    String classNum ;
    @Column
    String grade ;
    @Column
    String institude ;

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getInstitude() {
        return institude;
    }

    public void setInstitude(String institude) {
        this.institude = institude;
    }
}
