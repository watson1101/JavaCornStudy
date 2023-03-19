package com.hong.test;

public class DeadLockDemo {
    static Object a = new Object();
    static Object b = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    System.out.println("a is get lock");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (b) {
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    System.out.println("b is get lock");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a) {
                    }
                }

            }
        }).start();
    }
}
