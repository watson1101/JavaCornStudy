package com.hong.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ParamDemo {
    public static void main(String[] args) {
        int i = 0;
        function1(i);
        Integer ii = 0;
        function1(ii);
        System.out.println(i);
        System.out.println("ii = "+ii);

        String str = "hello";
        function2(str);
        System.out.println(str);

        List<String> list = new ArrayList<>();
        list.add("hhhh");
        function3(list);
        System.out.println(list.get(0));
    }

    private static void function3(List<String> list) {
        list = new ArrayList<>();
        list.add("jhnb");
    }

    private static void function2(String str) {
        //str = "world";
        str = new String("world");
    }

    private static void function1(int i) {
        i = 2;
    }
}
