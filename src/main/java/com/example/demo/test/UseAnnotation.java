package com.example.demo.test;

import com.example.demo.validator.LoginAnno;

public class UseAnnotation {
 
    @LoginAnno("testStringValue")
    public void testMethod(){
        //do something here
    }
}