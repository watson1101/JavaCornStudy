package com.hong.javacore.test;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {
    public static void main(String[] args) {
        new CollectionTest().test();
    }

    private void test() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("d", "ddd");

        list.add(map);

        System.out.println("ori:  " + JSONObject.toJSONString(list));
        handle(list);
        System.out.println("Last: " + JSONObject.toJSONString(list));
    }

    private void handle(List<Map<String, String>> list) {
        for (Map<String, String> map : list) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("key = " + key + ", value = " + value);
                value = "xxxxxxxx";
                entry.setValue(value);
            }
        }
    }
}
