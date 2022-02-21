package com.example.demo.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author curry
 * @package com.example.demo.example
 * @date 2022/2/21 1:15
 * @Version V1.0
 */
public class ProxyExample {
    static interface Car {
        void running();
    }

    static class Bus implements Car {
        @Override
        public void running() {
            System.out.println("The bus is running.");
        }
    }

    static class Taxi implements Car {
        @Override
        public void running() {
            System.out.println("The taxi is running");
        }
    }

    static class JDKProxy implements InvocationHandler {
        private Object target;

        public Object getInstance(Object target) {
            this.target = target;
            return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
            System.out.println("动态代理之前的业务逻辑.");
            Object result = method.invoke(target, args);
            return result;
        }
    }

    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        Car carInstance = (Car) jdkProxy.getInstance(new Taxi());
        carInstance.running();
    }



}
