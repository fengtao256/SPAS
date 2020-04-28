package com.lzl.spas.service;

import com.lzl.spas.dao.UsersRespository;
import com.lzl.spas.entity.EduUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersServiceImpl implements UsersServiceInterface{

    @Autowired
    private UsersRespository usersRespository ;

    @Override
    public EduUsers queryLoginInfo(String userNo) {
        Optional<EduUsers> optional =  usersRespository.findById(userNo) ;
        return optional.get();
}
}
