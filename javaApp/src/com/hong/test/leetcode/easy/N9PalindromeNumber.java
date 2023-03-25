package com.hong.test.leetcode.easy;

/**
 * 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。-2^31 <= x <= 2^31 - 1
 * 121 true
 * -121 false
 * 123 false
 */
public class N9PalindromeNumber {
    /**
     * 利用输入的参数逆向重新生成了一个整数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = 0;
        for (int i = x; i > 0; i = i / 10) {
            y = y * 10 + i % 10;
        }
        return x == y;
    }

    public static void main(String[] args) {
        N9PalindromeNumber n9PalindromeNumber = new N9PalindromeNumber();
        boolean palindrome = n9PalindromeNumber.isPalindrome(1234567);
        System.out.println(palindrome);
    }
}

