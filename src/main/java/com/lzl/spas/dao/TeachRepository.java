package com.lzl.spas.dao;

import com.lzl.spas.entity.Teach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeachRepository extends JpaRepository<Teach, String> {
    @Query(value = "select t from Teach t where teacherNo = :teacherNo ")
    List<Teach> getMyCourseList(String teacherNo);
}
