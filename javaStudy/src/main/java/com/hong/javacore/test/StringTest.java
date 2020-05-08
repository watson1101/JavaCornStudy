package com.hong.javacore.test;

import com.hong.model.User;

import java.util.UUID;

public class StringTest {
    public static void main(String[] args) {
        //method1();
        method2();
    }

    private static void method2() {
        String s = "a//b//c//dd";
        System.out.println(s.replaceAll("//", "/"));
    }

    private static void method1() {
        System.out.println("dd");
        String s = "abcdefg";
        System.out.println(s.indexOf(61));
        System.out.println((char) 61);
        String randomStr = UUID.randomUUID().toString();
        System.out.println(randomStr);
        System.out.println(System.currentTimeMillis());

        System.out.println(s.substring(0, 3) + "\n" + "ddd");

        String st = "adsf.cc.dgf";
        String[] arr = st.split("\\.");
        System.out.println(arr[0]);
    }
}
