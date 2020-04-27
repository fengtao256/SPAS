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
}
