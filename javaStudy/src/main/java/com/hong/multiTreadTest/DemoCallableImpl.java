package com.hong.multiTreadTest;

import com.hong.model.User;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * callable的方式启用多线程
 */
public class DemoCallableImpl {
    public static void main(String[] args) {
        String str = "";
        FutureTask<User> ft = new FutureTask(new DemoCallable<>(str));
        Thread t = new Thread(ft);
        t.start();
    }

    static class DemoCallable<T> implements Callable<T> {
        private String str;

        public DemoCallable(String str) {
            this.str = str;
        }

        public T call() throws Exception {
            System.out.println(Thread.currentThread().getName() + " callable running,str = " + str);
            Thread.sleep(1000);
            str = str + Thread.currentThread().getName();
            return (T) (new User());
        }
    }
}
