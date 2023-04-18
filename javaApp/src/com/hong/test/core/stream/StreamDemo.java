package com.hong.test.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        stringToIntMap();
        stringToIntFlatmap();

    }

    /**
     * map 用途一对一转换，将字符串转换为user对象，并收集到集合中
     * map：对元素进行处理转换
     */
    private static void stringToIntMap() {
        List<String> ids = Arrays.asList("101", "102", "103", "104", "201", "202", "203", "205");
        List<User> users = ids.stream().map(id -> {
            User user = new User(Integer.valueOf(id));
            return user;
        }).collect(Collectors.toList());
        for (User user : users
        ) {
            System.out.println(user);
        }

    }

    /**
     * map 用途，一对多转换，将两个字符串以空格拆分成多个字符串，并收集到集合中
     * flatMap:将元素铺开
     */
    private static void stringToIntFlatmap() {
        List<String> sentences = Arrays.asList("hello world", "bye bye");
        List<String> results = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
        for (String res : results
        ) {
            System.out.println(res);
        }


    }

}
