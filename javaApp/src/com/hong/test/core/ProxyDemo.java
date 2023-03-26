package com.hong.test.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyDemo {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];
        for (int i = 0; i < elements.length; i++){
            Integer value = i + 1;
            TraceHandler handler = new TraceHandler(value);
            // 三个参数：类加载器，Class对象数组，调用处理器
            // 代理的对象是Comparable的class对象，其方法只有一个compareTo
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[] { Comparable.class }, handler);
            elements[i] = proxy;
        }

        // construct a random integer
        Integer key = (int) (Math.random() * elements.length) + 1;

        // search for the key
        int result = Arrays.binarySearch(elements, key);

        // print match if found
        if (result >= 0) System.out.println(elements[result]);

    }
}


/**
 * An invocation handler that prints out the method name and parameters, then
 * invokes the original method
 *
 * 定义TraceHandler包装器类存储一个包装的对象，invoke方法打印所调用方法的名称和参数，随后调用这个方法，并提供所包装的对象作为 <B>隐式参数</B>
 */
class TraceHandler implements InvocationHandler {
    private Object target;

    /**
     * Constructs a TraceHandler
     *
     * @param t the implicit parameter of the method call
     */
    public TraceHandler(Object t) {
        target = t;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        // print implicit argument
        System.out.print(target);
        // print method name
        System.out.print("." + m.getName() + "(");
        // print explicit arguments
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");

        // invoke actual method
        return m.invoke(target, args);
    }

}