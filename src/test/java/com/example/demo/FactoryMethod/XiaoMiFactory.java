package com.example.demo.FactoryMethod;

/**
 * 小米工厂负责生产小米手机，实现了顶级抽象工厂
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}