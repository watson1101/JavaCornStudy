package com.hong.multiTreadTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoRunable {
    private static String str1 = "";
    public synchronized void append(String xxx){
        str1 = str1+xxx;
    }
//    public void test() {
//        String str = "";
//        Executor executor = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++) {
//            ((ExecutorService) executor).submit(new SubThreadCallable(str));
//        }
//    }

    public void test() {

        Executor executor = Executors.newFixedThreadPool(10);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            //((ExecutorService) executor).submit(new SubThreadCallable(countDownLatch, str1));
            ((ExecutorService) executor).submit(new SubThreadCallable(countDownLatch, str1));
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("await 方法结束： str1 = "+str1);
    }

    public class SubThreadCallable implements Runnable {
        private CountDownLatch countDownLatch;
        private String s;

        public SubThreadCallable(CountDownLatch countDownLatch, String s) {
            this.countDownLatch = countDownLatch;
            this.s = s;
        }
        public SubThreadCallable(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                //str1 += "11111111111";
                append("1111111111");
                System.out.println("子线程中 ：string = " + str1);
                System.out.println(Thread.currentThread().getName() + "执行完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }
}
