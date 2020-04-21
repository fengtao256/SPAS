package com.lzl.spas.service;

import com.lzl.spas.entity.Users;
import org.springframework.stereotype.Component;

@Component
public interface UsersServiceInterface {
    /**
     * 查询登录用户信息
     * @param userNo
     * @return
     */
    Users queryLoginInfo(String userNo) ;//方法默认修饰符是public
}
