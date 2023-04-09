package com.hong.test.service.domain;

/**
 * 一只狗
 */
public class Dog {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println(name + " is " + color + ", he is barking");
    }
}
