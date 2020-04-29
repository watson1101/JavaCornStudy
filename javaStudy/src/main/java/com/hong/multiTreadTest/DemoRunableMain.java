package com.hong.multiTreadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoRunableMain {

    public static void main(String[] args) {
        //String str1 = "";
        new DemoRunable().test();
        //new DemoRunable().test();
    }

}
