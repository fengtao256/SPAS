package com.lzl.spas.service;

import com.lzl.spas.entity.EduUsers;
import org.springframework.stereotype.Component;

@Component
public interface UsersServiceInterface {
    /**
     * 查询登录用户信息
     * @param userNo
     * @return
     */
    EduUsers queryLoginInfo(String userNo) ;//方法默认修饰符是public
}
