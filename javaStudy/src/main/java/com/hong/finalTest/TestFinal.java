package com.hong.finalTest;

import com.hong.gaohongyan.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFinal {
    public final List<String> list = new ArrayList<>();
    public String ddd = "ddd";

    public static void main(String[] args) {
        new TestFinal().testF();
    }

    private void testF() {
        list.add("aaaa");
        System.out.println(list.get(0));
        ddd = "fff";
        System.out.println(ddd);
    }
}
