package com.hong.javacore.model;

public class Son extends Person {
    private String name;

    public Son(String name) {
        System.out.println("子类类有参构造方法执行。");
        this.name = name;
    }

    public Son() {
        System.out.println("子类空参构造方法执行。");
    }
}
