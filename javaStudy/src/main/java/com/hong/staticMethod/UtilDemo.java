package com.hong.staticMethod;

public class UtilDemo {
    public static String a;

    public static void outPut(){
        System.out.println("a = "+a);
    }

    public static String initParam(String aaa){
        a = aaa;
        return a;
    }
}
