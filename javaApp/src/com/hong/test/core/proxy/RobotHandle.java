package com.hong.test.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RobotHandle implements InvocationHandler {
    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        // 参数分别为 被代理类的类加载器，被代理类的接口，被代理类的处理器
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object methodObject = null;

        System.out.println("代理对象 RobotHandle charging...");
        methodObject = method.invoke(proxyTarget, args);
        System.out.println("all is done...");

        return methodObject;

    }
}
