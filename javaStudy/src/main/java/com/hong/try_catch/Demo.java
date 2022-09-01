package com.hong.try_catch;

/**
 * @author hong
 * @date 2020/7/15
 */
public class Demo {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("====="+e.getMessage());
        }
    }

    private static void test() throws Exception{
        try {
            int i = 1/0;
        } finally {
            System.out.println("test finally");
        }
    }
}
