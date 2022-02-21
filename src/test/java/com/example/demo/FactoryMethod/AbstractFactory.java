package com.example.demo.FactoryMethod;

/**
 * 顶级抽象工厂，由子类实现，如具体的小米工厂，具体的苹果工厂
 */
public interface AbstractFactory {
    Phone makePhone();
}