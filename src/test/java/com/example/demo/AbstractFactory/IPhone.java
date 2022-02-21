package com.example.demo.AbstractFactory;

/**
 * 苹果手机，实现了手机接口
 */
public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make iphone!");
    }
}