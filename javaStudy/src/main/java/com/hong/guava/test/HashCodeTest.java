package com.hong.guava.test;

import java.util.Objects;

public class HashCodeTest {
    public static void main(String[] args) {
        String s = "upload/test1/cm_link_pe.csv.gz";
        String s2 = "upload/test1/cm_link_pe.csv.gz";
        System.out.println(myHashCode(s2));
        System.out.println(Objects.hashCode(s));
        System.out.println(com.google.common.base.Objects.hashCode(s));
    }

    private static long myHashCode(String str) {
        long h = 0;
        int off = 0;
        char[] val = str.toCharArray();
        long len = str.length();

        for (long i = 0; i < len; i++) {
            h = 31 * h + val[off++];
        }
        return h;
    }
}
