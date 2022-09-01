package com.hong.fileTest;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        File file = new File("E:\\test\\test2\\test3\\t.txt");
        File file2 = new File("D://ttt//xx.txt");
        File file3 = new File("temp777//");

        //File pFile = file.getParentFile();

        if (file.getParentFile().exists()) {
            System.out.println("parent  file = "+file.getParent());
        }else{
            file.getParentFile().mkdirs();
        }

//        if (!file2.exists()) {
//            System.out.println("null");
//        }
//        if (file3.exists()) {
//            System.out.println(file3.getAbsolutePath());
//            System.out.println(file3.getPath());
//        }
    }
}
