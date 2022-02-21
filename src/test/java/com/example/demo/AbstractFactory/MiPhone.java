package com.example.demo.AbstractFactory;

/**
 * 小米手机，实现了手机接口
 */
public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}