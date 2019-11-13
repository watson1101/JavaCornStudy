package com.hong.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * https://www.jianshu.com/p/205a61af1205
 * 配媳妇去看病，轮到媳妇看大夫时,开始去排队准备交钱了
 */
public class CDLDemoMain {
    public static void main(String[] args) throws Exception {
        long now = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(new SeeDoctorTask(countDownLatch));
        executor.execute(new QueueTask(countDownLatch));
        countDownLatch.await();
        System.out.println("over，回家 cost:" + (System.currentTimeMillis() - now));
        ((ExecutorService) executor).shutdown();
    }
}
