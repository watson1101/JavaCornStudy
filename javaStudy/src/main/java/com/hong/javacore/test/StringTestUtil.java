package com.hong.javacore.test;

public class StringTestUtil {
    public static void main(String[] args) {
        String r1 = (new StringTestUtil().test2(1)).toString();
        System.out.println("r1 = " + r1);
        String r2 = (new StringTestUtil().test2(2)).toString();
        System.out.println("r2 = " + r2);
    }

    public StringBuffer test(int p) {
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("sb = " + sb.toString());
        parseSb(sb, p);
        return sb;
    }

    private void parseSb(StringBuffer sb, int p) {
        if (p == 1) {
            sb = sb.append("111");
        } else {
            sb = new StringBuffer("bbb");
        }
    }

    public StringBuffer test2(int p) {
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("sb = " + sb.toString());
        sb = parseSb2(sb, p);
        return sb;
    }

    private StringBuffer parseSb2(StringBuffer sb, int p) {
        if (p == 1) {
            sb = sb.append("111");
        } else {
            sb = new StringBuffer("bbb");
        }
        return sb;
    }
}
