package com.hong.javacore.test;

import java.util.UUID;

public class StringHashTest {
    public static void main(String[] args) {
        String s = "a;.洪";
        System.out.println("hashcode1 = "+s.hashCode());
        System.out.println("hashcode2 = "+myHashCode(s));
    }
    private static long myHashCode(String str) {
        long h = 0;
        if (h == 0) {
            int off = 0;
            char val[] = str.toCharArray();
            long len = str.length();

            for (long i = 0; i < len; i++) {
                h = 31 * h + val[off++];
            }
        }
        return h;
    }
}
