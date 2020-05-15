package com.hong.javacore.test;

import com.hong.model.User;

import java.util.UUID;

public class StringTest {
    public static void main(String[] args) {
        //method1();
//        method2();
//        method3();
        method4();
    }

    private static void method4() {
        String s = "{case}(AS){enum}(areacode)+{const}(2010102)+{col}(ini_id)";
        System.out.println(s);
        System.out.println(s.indexOf("("));
        System.out.println(s.indexOf(")"));
        System.out.println(s.substring(s.indexOf(")") + 1, s.length()));
        System.out.println(s.substring(s.indexOf("(") + 1, s.indexOf(")")));
    }

    private static void method3() {
        String s = "{enum}(areacode)";
        int start = s.indexOf("{");
        int end = s.indexOf("}");
        System.out.println(s.substring(start + 1, end));
    }

    private static void method2() {
        String s = "a//b//c//dd";
        System.out.println(s.replaceAll("//", "/"));

        String s2 = "{a}+{b}+{c}";
        String[] sArr = s2.split("\\+");
        for (String ss : sArr) {
            System.out.println(ss);
        }
        String[] sArr2 = s2.split("[(\\+)]");
        for (String ss : sArr2) {
            System.out.println(ss);
        }
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
