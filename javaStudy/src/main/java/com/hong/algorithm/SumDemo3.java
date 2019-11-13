package com.hong.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 无序可重复整数序列，找到和为0的三个数并输出
 */
public class SumDemo3 {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(-3);
        list.add(-1);
        list.add(-2);
        list.add(-5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        // 元素去重
        List<Integer> temp = new ArrayList<>();
        temp.addAll(new HashSet<Integer>(list));
        list = temp;
        // 排序
        Collections.sort(list);
        System.out.println(list);
        // 左中右三个元素
//        int i = 0;
//        int j = list.size() - 1;
        for (int i = 0; i < list.size() - 2; ++i) {
            int j = i + 1;
            int k = list.size() - 1;
            while (j < k) {
                if (list.get(i) + list.get(j) + list.get(k) == 0) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " + " + list.get(k) + " = 0");
                    ++j;
                    --k;
                    while (j < k && list.get(j - 1) == list.get(j)) {
                        ++j;
                    }
                    while (j < k && list.get(k) == list.get(k + 1)) {
                        --k;
                    }
                } else if (list.get(i) + list.get(j) + list.get(k) < 0) {
                        ++j;
                } else {
                    --k;
                }
            }
            while (i < list.size() - 1 && list.get(i) == list.get(i + 1)) {
                ++i;
            }
        }


    }
}
