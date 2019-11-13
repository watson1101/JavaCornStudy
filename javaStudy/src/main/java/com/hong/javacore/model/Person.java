package com.hong.javacore.model;

public class Person {
    private String name;

    public Person(){
        System.out.println("父类空参构造方法执行。");
    }

    public Person(String name) {
        System.out.println("父类有参构造方法执行。");
        this.name = name;
    }
}
