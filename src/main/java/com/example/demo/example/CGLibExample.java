package com.example.demo.example;


import javafx.beans.binding.ObjectExpression;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author curry
 * @package com.example.demo.example
 * @date 2022/2/21 1:30
 * @Version V1.0
 */
public class CGLibExample {
    static class Car {
        public void running() {
            System.out.println("The car is running.");
        }
    }

    static class CGLibProxy implements MethodInterceptor {
        private Object target;

        public Object getInstance(Object target) {
            this.target = target;
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(this.target.getClass());
            enhancer.setCallback((Callback) this);
            return enhancer.create();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("动态代理之前的业务处理.");
            Object reuslt = methodProxy.invokeSuper(o, objects);
            return reuslt;
        }
    }

    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        Car car = (Car) proxy.getInstance(new Car());
        car.running();
    }
}
