package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 描述:通过@Aspect注解使该类成为切面类 
 */
@Aspect
@Component
public class LoginAnnoImpl {

    @Pointcut("@annotation(com.example.demo.validator.LoginAnno)")
    private void cut() {
    }

    /**
     *  功能:前置通知 
     */
    @Before("cut()")
    public void before() {
        System.out.println("自定义注解生效了");
    }
}