package com.lzl.spas.entity;

import javax.persistence.*;

/**
 * 用户表实体
 * @Author 刘卓林
 */
@Entity
@Table(name="edu_users")
public class EduUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO代表程序控制主键
    String usersNo;
    @Column
    String password ;
    @Column
    String role ;
    @Column
    String userName ;
    @Column
    String sex ;
    @Column
    String telephone ;
    @Column
    String emailAddress ;

    public String getUsersNo() {
        return usersNo;
    }

    public void setUsersNo(String usersNo) {
        this.usersNo = usersNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
