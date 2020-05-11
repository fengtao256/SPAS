package com.lzl.spas.dao;

import com.lzl.spas.entity.EduScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<EduScore, String> {
}
