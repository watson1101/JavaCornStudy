package com.hong.mldn.reflect;

public class Student {
    private Integer id;
    private Integer age;
    private String name;


    public Student() {
        System.out.println("Student无参构造方法执行！");
    }

    public Student(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        System.out.println("Student有参构造方法执行！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
