package com.hong.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 无序可重复整数序列，找到和为0的三个数并输出
 */
public class SumDemo2 {
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
        // 左中右三个元素
        int i = 0;
        int j = list.size() - 1;
        //int index = 1;
        boolean flag = false;
        while (i < j) {
            for (int index = i + 1; index < j; index++) {
                if (list.get(i) + list.get(j) + list.get(index) == 0) {
                    System.out.println(list.get(i) + " + " + list.get(j) + " + " + list.get(index) + " = 0");
                }
            }
            if (flag) {
                i++;
            } else {
                j--;
            }
            flag = !flag;
            //System.out.println(flag);
        }


    }
}
