package com.hong.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 */
public class MyDemoMain {
    public static void main(String[] args) throws Exception {
        long now = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(3);
//        Executor executor = Executors.newFixedThreadPool(10);
//        executor.execute(new CountTask(countDownLatch,5,"线程A"));
//        executor.execute(new CountTask(countDownLatch,3,"线程B"));
//        executor.execute(new CountTask(countDownLatch,7,"线程C"));
        // or 不适用线程池
        CountTask taskA =  new CountTask(countDownLatch,5,"线程A");
        CountTask taskB =  new CountTask(countDownLatch,3,"线程B");
        CountTask taskC =  new CountTask(countDownLatch,7,"线程C");
        Thread thA = new Thread(taskA);
        Thread thB = new Thread(taskB);
        Thread thC = new Thread(taskC);
        thA.start();
        thB.start();
        thC.start();


        countDownLatch.await();
        //((ExecutorService) executor).shutdown();
        System.out.println("over， cost:" + (System.currentTimeMillis() - now));
    }
}
