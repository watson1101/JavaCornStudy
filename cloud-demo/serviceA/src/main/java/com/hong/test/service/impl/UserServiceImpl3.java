package com.hong.test.service.impl;


import com.hong.test.service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl3 implements UserService {
    /**
     * @param name
     * @return
     */
    @Override
    public String searchUser(String name) {
        System.out.println("From service 3, the main service !! input name is " + name);
        return "From service 3, name = " + name;
    }
}
