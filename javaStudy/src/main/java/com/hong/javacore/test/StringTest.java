package com.hong.javacore.test;

import com.hong.model.User;

import java.util.UUID;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("dd");
        String s = "abcdefg";
        System.out.println(s.indexOf(61));
        System.out.println((char)61);
        String randomStr = UUID.randomUUID().toString();
        System.out.println(randomStr);
        System.out.println(System.currentTimeMillis());

        System.out.println(s.substring(0,3)+"\n"+"ddd");
    }
}
