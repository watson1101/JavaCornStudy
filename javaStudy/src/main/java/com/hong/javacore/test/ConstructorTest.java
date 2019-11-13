package com.hong.javacore.test;

import com.hong.javacore.model.Person;
import com.hong.javacore.model.Son;

public class ConstructorTest {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("==================");
        Son son2 = new Son("zhang");
        System.out.println("==================");
        Person son3 = new Son("zhang");
    }
}
