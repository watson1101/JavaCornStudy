package com.hong.mldn.reflect;

public class StudentReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //Class<Student> cls = Class.forName("com.hong.mldn.reflect.Student");
        Class<?> cls = Class.forName("com.hong.mldn.reflect.Student");
        Object obj = cls.newInstance();
        //Object obj2 = new Student();
        System.out.println(obj.toString());
    }
}
