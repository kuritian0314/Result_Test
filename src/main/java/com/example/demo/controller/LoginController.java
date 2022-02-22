package com.example.demo.controller;

import com.example.demo.validator.LoginAnno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("sso")
public class LoginController {

    @RequestMapping("reg")
    public String reg(String userName) {
        return "用户[" + userName +"]注册成功~!";
    }


    @RequestMapping("login")
    @LoginAnno("testStringValue")
    public String login(String userName) {
        return "欢迎您:" + userName;
    }
}