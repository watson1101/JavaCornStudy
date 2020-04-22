package com.hong.staticMethod;

public class UtilDemo {
    public static String a;

    public static void outPut(){
        System.out.println("a = "+a);
    }

    public static void initParam(String aaa){
        a = aaa;
    }
}
