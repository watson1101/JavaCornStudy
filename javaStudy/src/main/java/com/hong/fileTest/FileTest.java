package com.hong.fileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        File file = new File("D://temp//xx.txt");
        File file2 = new File("D://ttt//xx.txt");
        File file3 = new File("temp777//");//xx.txt
        if (file.exists()) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
        }
        if (!file2.exists()) {
            System.out.println("null");
        }
        if (file3.exists()) {
            System.out.println(file3.getAbsolutePath());
            System.out.println(file3.getPath());
        }else{
            file3.mkdir();
            System.out.println("file3 make");
        }
    }
}
