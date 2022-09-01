package com.hong.fileTest;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        File file = new File("E:\\test\\test2\\test3\\t.txt");
        File file2 = new File("E:/test/testss2/tests3/t.txt");

        //File pFile = file.getParentFile();

        if (file.getParentFile().exists()) {
            System.out.println("parent  file = "+file.getParent());
        }else{
            file.getParentFile().mkdirs();
        }
        System.out.println("--------------------"+file.getPath());

        if (file2.getParentFile().exists()) {
            System.out.println("parent  file2 =========== "+file2.getParent());
        }else{
            file2.getParentFile().mkdirs();
        }
        System.out.println("====================="+file2.getPath());

    }
}
