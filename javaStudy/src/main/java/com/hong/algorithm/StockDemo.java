package com.hong.algorithm;

import java.util.ArrayList;
import java.util.List;

public class StockDemo {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        System.out.println(list);

        // 每次买卖的时机
        int B1 = 0, S1 = 0, B2 = 0, S2 = 0;
        // 总盈利
        int value = -1;
        // index是两次买卖的分界线
        for (int index = 2; index < list.size() - 2; index++) {
            int b1 = 0, s1 = 0, b2 = 0, s2 = 0;
            // 第一次交易的最大盈利情况
            int min1 = list.get(0);
            int max1 = list.get(0);
            for (int i = 0; i < index; i++) {
                if (list.get(i) > max1) {
                    max1 = list.get(i);
                    s1 = i;
                } else if (list.get(i) < min1) {
                    min1 = list.get(i);
                    b1 = i;
                }
            }
            int value1 = max1 - min1;
            // 第二次交易
            int min2 = list.get(index);
            int max2 = list.get(index);
            for (int i = index; i < list.size(); i++) {
                if (list.get(i) > max2) {
                    max2 = list.get(i);
                    s2 = i;
                } else if (list.get(i) < min2) {
                    min2 = list.get(i);
                    b2 = i;
                }
            }
            int value2 = max2 - min2;

            if (value2 + value1 > value) {
                B1 = b1;
                S1 = s1;
                B2 = b2;
                S2 = s2;
                value = value1 + value2;
            }

        }
        System.out.println("交易的时机：第一次买入价格：" + list.get(B1) + "  ,第一次卖出价格：" + list.get(S1)
                + "  第二次买入价格：" + list.get(B2) + "  ,第二次卖出价格：" + list.get(S2));
        System.out.println("交易的收益：" + value);

    }
}
