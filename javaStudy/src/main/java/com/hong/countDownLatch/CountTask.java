package com.hong.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * 计数任务:多个线程实现计数功能
 */
public class CountTask implements Runnable {
    private CountDownLatch countDownLatch;
    private Integer count;
    private String name;
//    public CountTask(CountDownLatch countDownLatch) {
//        this.countDownLatch = countDownLatch;
//    }


    public CountTask(CountDownLatch countDownLatch, Integer count, String name) {
        this.countDownLatch = countDownLatch;
        this.count = count;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            int result = 0;
            while (result < count) {

                Thread.sleep(1000);
                result++;
                System.out.println(name + " result = " + result);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

}
