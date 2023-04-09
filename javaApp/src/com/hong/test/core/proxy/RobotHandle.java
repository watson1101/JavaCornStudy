package com.hong.test.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RobotHandle implements InvocationHandler {
    private Object proxyTarget;

    public Object getProxyInstance(Object target) {
        this.proxyTarget = target;
        // 参数分别为
        // 1.被代理类的类加载器；
        // 2.被代理类的接口；
        // 3.代理类本身，即告诉代理类，代理类遇到某个委托类的方法时该调用哪个类下的invoke方法
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(), proxyTarget.getClass().getInterfaces(), this);
    }

    /**
     * 第一个参数为 Proxy 类类型实例，如匿名的 $proxy 实例
     * 第二个参数为委托类的方法对象
     * 第三个参数为委托类的方法参数
     * 返回类型为委托类某个方法的执行结果
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object methodObject = null;

        System.out.println("代理对象 RobotHandle charging...");
        methodObject = method.invoke(proxyTarget, args);
        System.out.println("all is done...");

        return methodObject;

    }
}
