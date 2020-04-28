package com.lzl.spas.dao;

import com.lzl.spas.entity.EduUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRespository extends JpaRepository<EduUsers, String> {

}
