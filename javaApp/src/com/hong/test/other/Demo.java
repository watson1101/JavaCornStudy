package com.hong.test.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 一
 * 1, 2, 3, 4, ..., 6666 中，数字 6 出现的次数为____。
 * 提示：1, 2, 3, 4, ... 20 中，数字 6 出现的次数为 2，分别出现在 6 和 16 中。
 * <p>
 * 二
 * 若一个数中不存在任何重复的数字，则称该数为“纯.粹.数”。1001, 1002, ..., 2333
 * 中，“纯.粹.数”的个数为____。
 * 提示：123、298 都是纯粹数，223、355 都不是“纯.粹.数” （分别数字 2 重复、数字 5 重复）
 * <p>
 * 第三题
 * 给出如下数列：1, 1, 1, 3, 5, 9, ... 其规律在于，第 n+3 个数 = 第 n 个数 + 第
 * n+1 个数 + 第 n+2 个数，其中，n 为正整数。该数列第 2023 个数的后四位（即除以10000 的余数）为__3281__。
 * 提示：3 = 1 + 1 + 1，5 = 1 + 1 + 3，9 = 1 + 3 + 5
 * <p>
 * 第四题
 * 有一款“神-币”，其价格随市场波动每天不同，但一天之内保持不变，其近 20 天
 * 的价格为:
 * [1000, 970, 990, 1020, 1110, 800, 800, 790, 810, 770, 600, 1200, 1110, 1320,
 * 1350, 1000, 980, 800, 790, 900]。
 * 少年是一名“神币”业余玩家，通过低买高卖追求收益，但投资保守，最多只持有 1 个“神
 * 币”。理论上，少年近 20 天的最高可能收益为____。
 * 提示：若“神币”近 4 天的价格为[1000, 1200, 1000, 1100]，理论上，少年近 4 天的最高
 * 可能收益为 300，具体操作方式为，第 1 天 1000 买入，第 2 天 1200 卖出，第 3 天 1000
 * 买入，第 4 天 1100 卖出。
 * <p>
 * 第五题
 * 不死之身的英雄与怪兽决斗，每回合中，怪兽先受到英雄攻击扣血，若存活，则进
 * 行一定程度的自愈回血。
 * 已知每回合中，英雄攻击 = 英雄基础攻击 × 英雄暴击系数；怪兽回血 = 怪兽基础回血
 * × 怪兽回血系数。
 * 假设怪兽初始血量为 123456789，
 * 从第 1 回合起，
 * 英雄基础攻击 = 1000, 2000, 3000, 1000, 2000, 3000, ..., 循环；
 * 每逢整 11 回合（例如，第 11 回合，第 22 回合等），英雄暴击系数为 2，其他情形为 1；
 * 怪兽基础回血 = 500, 900, 500, 900, ..., 循环；
 * 每逢整 19 回合（例如，第 19 回合，第 38 回合等），怪兽回血系数为 5，其他情形为 1。
 * 英雄在第____回合打败怪兽。
 */

public class Demo {
    public static void main(String[] args) {
//        number6();
//        test();
//        pureNumber();
//        findNumber(2023);
//        max();
        battle();
    }

    private static void test() {
        String str = "abbacbcda";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("a".equals(str.charAt(i)+"")) {
                count++;
            }
        }
        System.out.println(count);
    }


    /**
     * Find numbers that contains 6 in 0~6666 .
     */
    private static void number6() {
        int n = 66;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if ((i + "").contains("6")) {

                //System.out.println("" + i + ", tmp = " + tmp);

            }
        }
        System.out.println("包含6的数字有 " + count + " 个");
    }

    /**
     * 找出从1000到2333中没有重复数字的个数，纯粹数
     */
    private static void pureNumber() {

        int n1 = 1001;
        int n2 = 2333;
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            int temp = getSize(i);
            if (temp == 4) {
                //System.out.println(i + " 是纯粹数");
                count++;
            }
        }
        System.out.println("纯粹数个数为 " + count);
    }

    private static int getSize(int n) {
        Set s = new HashSet();
        while (n > 0) {
            s.add(n % 10);
//            System.out.print(n % 10 + "  ");
//            System.out.println();
            n = n / 10;
        }
        //System.out.println("不重复的元素个数：" + s.size());
        return s.size();
    }

    /**
     * 对于第n个数，是前三个数的和，求第n个数的后4位，序列为：1,1,1,3,5,9……
     * 注意，当index稍微大一点的时候，数值会超出long类型的最大表示范围，所以计算出某个index的值的时候需要直接去掉前面的高位值
     *
     * @param index
     * @return
     */
    private static void findNumber(int index) {
        List<Integer> list = new ArrayList<>(index);
        long num = 1;
        if (index <= 3) {
            for (int i = 0; i < index; i++) {
                list.add(1);
            }
        }
        list.add(1);
        list.add(1);
        list.add(1);
        while (list.size() < index) {
            nextList(list);
        }
        //System.out.println(list.get(index-1));
        System.out.println("list:");
        for (int i = 0; i < index; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("list.size() = " + list.size());
    }

    private static List nextList(List<Integer> list) {
        Integer num = list.get(list.size() - 1) + list.get(list.size() - 2) + list.get(list.size() - 3);
        while (num > 10000) {
            System.out.println(num);
            num = num - 10000;
        }
        list.add(num);
        return list;
    }

    private static void max() {
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(970);
        list.add(990);
        list.add(1020);
        list.add(1110);
        list.add(800);
        list.add(800);
        list.add(790);
        list.add(810);
        list.add(770);
        list.add(600);
        list.add(1200);
        list.add(1110);
        list.add(1320);
        list.add(1350);
        list.add(1000);
        list.add(980);
        list.add(800);
        list.add(790);
        list.add(900);

        int length = 20;
        List<List> statusList = new ArrayList<>();
        statusList = getStatusList(length);

        cacl(list, statusList);
    }


    // 获取所有可能的组合情况
    private static List<List> getStatusList(int length) {
        List<List> result = new ArrayList<>();
        List<Integer> base = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            base.add(0);
        }
        result.add(base);

        // 设置第i位的状态机状态
        for (int i = 0; i < length; i++) {
            result = new ArrayList<>(new HashSet<List>(result));

            System.out.println("-----------------设置第 " + i + "位：");
            List<List> resultMirror = new ArrayList<>(result);
            for (int x = 0; x < resultMirror.size(); x++) {
                List<Integer> tmp = new ArrayList<>(base);
                if (resultMirror.size() != 0) {
                    tmp = resultMirror.get(x);
                }
//                System.out.print("检查状态机：" + i);
                List<Integer> status0 = new ArrayList<>(tmp);
                status0.set(i, 1);
                if (check(status0, i)) {
                    result.add(status0);
                }
                List<Integer> status1 = new ArrayList<>(tmp);
                status1.set(i, 0);
                if (check(status1, i)) {
                    result.add(status1);
                }
                List<Integer> status2 = new ArrayList<>(tmp);
                status2.set(i, -1);
                if (check(status2, i)) {
                    result.add(status2);
                }

            }
        }
        result = new ArrayList<>(new HashSet<List>(result));
        return result;
    }

    private static boolean check(List<Integer> status, int i) {

        int res = 0;
        for (int k = 0; k <= i; k++) {
            res += status.get(k);
            if (res > 1 || res < 0) {
//                System.out.print("！！！不符合的状态机：");
//                for (int j = 0; j < status.size(); j++) {
//                    System.out.print(status.get(j) + "  ");
//                }
//                System.out.println();
                return false;
            }
        }
//        System.out.print("符合的状态机：");
//        for (int j = 0; j < status.size(); j++) {
//            System.out.print(status.get(j) + "  ");
//        }
//        System.out.println();
        return true;
    }

    // 计算最大收益
    private static void cacl(List<Integer> list, List<List> statusList) {
        Integer value = 0;
        int statusIndex = 0;
        for (int i = 0; i < statusList.size(); i++) {
            Integer tmp = 0;
            List<Integer> status = statusList.get(i);

            for (int j = 0; j < status.size(); j++) {
                tmp += status.get(j) * list.get(j);
            }
            // System.out.println("tmp = " + tmp);
            if (tmp < value) {
                value = tmp;
                statusIndex = i;
            }

            //
            if (tmp == 0 - 900) {
                int d = 0;
                for (int x = 0; x < list.size(); x++) {
                    //System.out.print(list.get(x) + "*" + statusList.get(statusIndex).get(x) + "  ");
                    System.out.print(list.get(x) + "*" + status.get(x) + "  ");
                    d = d + list.get(x) * status.get(x);
                }
                System.out.print(" = " + d);
                System.out.println();
            }

        }
        System.out.println("最大收益：" + (0 - value));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "*" + statusList.get(statusIndex).get(i) + "  ");
        }

    }

    // 攻击，回血
    private static void battle() {
        int index = 0;

        int totle = 123456789;
        while (true) {
            index++;
            int damage = damage(index);
            int rec = rec(index);
            int ori = totle;
            totle = totle - damage;
            if (totle <= 0) {
                System.out.println("回合数：" + index + " ,done.");
                return;
            } else {
                totle = totle + rec;
            }
            System.out.println("第" + index + "回合，攻击 ：" + damage + ",回血：" + rec + "   血量：" + totle);
            System.out.println("第" + index + "回合:" + ori + " - " + damage + "+ " + rec + " = " + totle);
        }
    }

    private static int rec(int index) {
        int base = index % 2 == 0 ? 900 : 500;
//        System.out.println("index = " + index + ",rec base = " + base);

        int factor = index % 19 == 0 ? 5 : 1;
        int rec = base * factor;

        System.out.println("index = " + index + ",rec = " + rec);
        return rec;
    }

    private static int damage(int index) {
        int base = (index % 3 == 0 ? 3 : index % 3) * 1000;
//        System.out.println("index = " + index + ",damage base = " + base);

        int factor = index % 11 == 0 ? 2 : 1;
        int damage = base * factor;

        System.out.println("index = " + index + ", damage = " + damage);
        return damage;
    }
}

