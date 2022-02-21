package com.example.demo.FactoryMethod;

public class Demo {
    public static void main(String[] arg) {
        //创建具体的不同的子类工厂，创建不同的手机
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        appleFactory.makePhone();        // make iphone!
    }
}