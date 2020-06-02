package com.lzl.spas.entity;

import javax.persistence.*;

@Entity
@Table(name = "edu_student")
public class EduStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String studentNo;
    @Column
    String  studentName;
    @Column
    String sex;
    @Column
    String birthday;
    @Column
    String nation;
    @Column
    String classNo;
    @Column
    String grade;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
