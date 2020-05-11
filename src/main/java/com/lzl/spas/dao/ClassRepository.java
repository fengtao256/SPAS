package com.lzl.spas.dao;

import com.lzl.spas.entity.EduClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<EduClass, String> {

}
