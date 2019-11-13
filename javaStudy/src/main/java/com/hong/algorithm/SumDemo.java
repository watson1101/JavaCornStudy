package com.hong.algorithm;

import java.util.*;

/**
 * 无序可重复整数序列，找到和为0的三个数并输出
 */
public class SumDemo {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
//        int[] arr = new int[]{1,2,0,-3,-1,-2,-5,-4,-3,-2,-5,-7};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list.add(0);
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
        // 找到最靠近0的值得索引
        int mid = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= 0 && list.get(i + 1) >= 0) {
                mid = i;
                break;
            }
        }
        // 将原来的链表分为三个，第一个是min到mid，第二个是mid到max，另一个是min到max
        for (int i = 0; i < mid; i++) {
            for (int j = mid; j < list.size(); j++) {
                for (int index = i + 1; index < j; index++) {
                    if (list.get(i) + list.get(j) + list.get(index) == 0) {
                        System.out.println(list.get(i) + " + " + list.get(j) + " + " + list.get(index) + " = 0");
                    }
                }
            }
        }

    }
}
