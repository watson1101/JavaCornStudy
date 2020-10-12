package com.hong.Collection;

public class CompareTest {

    public static void main(String[] args) {
        String a = "傻子";
        String b = "二货";
        if(a.compareTo(b) > 0){
            System.out.println(a+">"+b);
        }else{
            System.out.println(a+"<"+b);
        }
    }

}
