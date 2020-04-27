package com.lzl.spas.controller;

import com.lzl.spas.entity.Users;
import com.lzl.spas.service.UsersServiceInterface;
import com.lzl.spas.utils.ResultUtils;
import com.mysql.cj.util.StringUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UsersServiceInterface usersServiceInterface;

    /**
     * 登录请求处理
     *
     * @param usersNo
     * @param password
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String doLogin(@RequestParam("usersNo") String usersNo, @RequestParam("password") String password, HttpSession session,Model model) {
        Map<String, Object> retMap = new HashMap<String, Object>();
        //非空判断
        if (StringUtils.isEmptyOrWhitespaceOnly(usersNo) || StringUtils.isEmptyOrWhitespaceOnly(password)) {
            retMap.putAll(ResultUtils.setResult(1001, "ERROR", "用户名密码不能为空"));
            return "login";
        } else {  //查询用户信息
            Users user = usersServiceInterface.queryLoginInfo(usersNo);
            if (user != null && !StringUtils.isEmptyOrWhitespaceOnly(user.toString())) {
                        if ("student".equals(user.getRole())) { //查询是学生，则返回学生首页
                            if (password.equals(user.getPassword())) {
                        session.setAttribute("userNo", user.getUsersNo());
                        session.setAttribute("username",user.getUserName());
                        session.setAttribute("role", user.getRole());
                        session.setAttribute("sex", user.getSex());
                        session.setMaxInactiveInterval(30 * 60);
                        retMap.putAll(ResultUtils.success());
                        model.addAllAttributes(retMap) ;
                        retMap.put("user",user) ;
                        model.addAllAttributes(retMap) ;
                        return "stuHomePage";
                    } else {
                        retMap.putAll(ResultUtils.setResult(1001, "ERROR", "密码错误"));
                        model.addAllAttributes(retMap) ;
                        return "login";
                    }
                } else if ("teacher".equals(user.getRole())) { //查询是教师，则返回教师首页
                    if (password.equals(user.getPassword())) {
                        session.setAttribute("username",user.getUserName());
                        session.setAttribute("userNo", user.getUsersNo());
                        session.setAttribute("role", user.getRole());
                        session.setAttribute("sex", user.getSex());
                        session.setMaxInactiveInterval(30 * 60);
                        retMap.putAll(ResultUtils.success());
                        model.addAllAttributes(retMap) ;
                        return "teaHomePage";
                    } else {
                        retMap.putAll(ResultUtils.setResult(1001, "ERROR", "密码错误"));
                        model.addAllAttributes(retMap) ;
                        return "login";
                    }
                } else { //否则返回首页
                    retMap.putAll(ResultUtils.setResult(1001, "ERROR", "用户无权限"));
                    model.addAllAttributes(retMap) ;
                    return "login";
                }
            } else {
                retMap.putAll(ResultUtils.setResult(1001, "ERROR", "用户不存在"));
                model.addAllAttributes(retMap) ;
            }
        }
        return "login";
    }
    /**
     * 登录请求处理
     *
     * @param session
     * @return
     */
    @PostMapping("/logout")
    public String doLoginOut(HttpSession session,Model model) {
        session.invalidate();
        return "/login" ;
    }
}
