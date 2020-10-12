package com.hong.Collection;

import com.hong.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {

    public static void main(String[] args) {
        //    List<User> list = new ArrayList<>();
        Map<String, User> map = new HashMap<>();
        User user1 = new User(1, "aaa", 22, "f");
        map.put("AAA", user1);
        User user2 = new User(2, "bbb", 29, "fffff");
        map.put("BBB", user2);
        User bbb = map.get("BBB");
        bbb.setName("cccccccccccccccccccc");

        System.out.println("AAA: "+map.get("AAA"));
        System.out.println("BBB: "+map.get("BBB"));
        System.out.println("========");
        List<User> ss = new ArrayList<>(map.values());
        for (User u : ss) {
            System.out.println("ss--" + u);
        }
    }
}
