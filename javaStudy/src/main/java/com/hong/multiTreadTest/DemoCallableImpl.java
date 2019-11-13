package com.hong.multiTreadTest;

import com.hong.model.User;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * callable的方式启用多线程
 */
public class DemoCallableImpl {
    public static void main(String[] args) {
        FutureTask<User> ft = new FutureTask(new DemoCallable<>());
        Thread t = new Thread(ft);
        t.start();
    }

    static class DemoCallable<T> implements Callable<T> {

        public T call() throws Exception {
            System.out.println("callable running.");
            return (T) (new User());
        }
    }
}
