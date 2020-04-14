package com.lzl.spas.dao;

import com.lzl.spas.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositoryInterface extends JpaRepository<Course , String> {

}
