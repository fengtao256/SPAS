package com.lzl.spas.service;

import com.lzl.spas.dao.UsersRepository;
import com.lzl.spas.entity.EduUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsersServiceImpl implements UsersServiceInterface{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public EduUsers queryLoginInfo(String userNo) {
        Optional<EduUsers> optional =  usersRepository.findById(userNo) ;
        return optional.get();
}
}
