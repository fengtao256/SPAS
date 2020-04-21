package com.lzl.spas.service;

import com.lzl.spas.dao.UsersRespository;
import com.lzl.spas.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersServiceImpl implements UsersServiceInterface{

    @Autowired
    private UsersRespository usersRespository ;

    @Override
    public Users queryLoginInfo(String userNo) {
        Optional<Users> optional =  usersRespository.findById(userNo) ;
        return optional.get();
    }
}
