package com.hong.multiTreadTest;

import java.util.concurrent.CountDownLatch;

/**
 * 通过 CountDownLatch ，两个线程等待3个线程执行完后再执行，等待线程直接启动，不通过线程池
 */
public class Demo2CountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch c = new CountDownLatch(3);
        // 2个等待线程
        WaitThread waitThread1 = new WaitThread("WaitThread-1", c);
        WaitThread waitThread2 = new WaitThread("WaitThread-2", c);

        // 3个工作线程
        WorkThread workThread1 = new WorkThread("worker-thread-1", c);
        WorkThread workThread2 = new WorkThread("worker-thread-2", c);
        WorkThread workThread3 = new WorkThread("worker-thread-3", c);

        // 启动线程
        waitThread1.start();
        waitThread2.start();
        Thread.sleep(1000);
        workThread1.start();
        workThread2.start();
        workThread3.start();
    }
}

/**
 * 等待线程
 */
class WaitThread extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public WaitThread(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + "--Waiting...");
            countDownLatch.await();
            System.out.println(this.name + "--Continue running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class WorkThread extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public WorkThread(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Work--" + this.name + " is running...");
        try {
            // do something
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work--" + this.name + " is end...");
        countDownLatch.countDown();
    }
}



