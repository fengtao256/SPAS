package com.lzl.spas.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO代表程序控制主键
    String usersNo;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String role;
    @Column()
    String userName ;
    @Column()
    String sex ;

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
}
