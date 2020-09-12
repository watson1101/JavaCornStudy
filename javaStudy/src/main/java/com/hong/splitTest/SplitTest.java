package com.hong.splitTest;

public class SplitTest {

    public static void main(String[] args) {
        String a = "aa_bb__";
        String b = "aa_bb__cc";
        System.out.println("a:"+a.split("_").length);
        System.out.println("a-limit:"+a.split("_",-1).length);
        System.out.println("b:"+b.split("_").length);
    }
}
