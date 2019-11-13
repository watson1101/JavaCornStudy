package com.hong.gaohongyan.singleton;

public class DefaultSingleton {
    private static DefaultSingleton ourInstance = new DefaultSingleton();

    public static DefaultSingleton getInstance() {
        return ourInstance;
    }

    private DefaultSingleton() {
    }
}
