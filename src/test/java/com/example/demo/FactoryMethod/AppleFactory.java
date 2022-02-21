package com.example.demo.FactoryMethod;

/**
 * 苹果工厂负责生产苹果手机，实现了顶级抽象工厂
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}