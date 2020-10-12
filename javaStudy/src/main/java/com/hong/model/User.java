package com.hong.model;


import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;

    public User() {
    }

    public User(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    // guava
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id &&
//                age == user.age &&
//                com.google.common.base.Objects.equal(name, user.name) &&
//                com.google.common.base.Objects.equal(sex, user.sex);
//    }
//
//    @Override
//    public int hashCode() {
//        return com.google.common.base.Objects.hashCode(id, name, age, sex);
//    }

    // jdk7+
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id &&
//                age == user.age &&
//                Objects.equals(name, user.name) &&
//                Objects.equals(sex, user.sex);
//    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age, sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
