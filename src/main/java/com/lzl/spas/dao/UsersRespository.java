package com.lzl.spas.dao;

import com.lzl.spas.entity.EduUsers;
import com.lzl.spas.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRespository extends JpaRepository<EduUsers, String> {

}
