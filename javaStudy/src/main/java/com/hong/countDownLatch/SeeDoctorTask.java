package com.hong.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * 看大夫任务
 */
public class SeeDoctorTask implements Runnable {
    private CountDownLatch countDownLatch;

    public SeeDoctorTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
            System.out.println("看大夫成功，大夫给开了些药单子");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
