package com.hong.test.service.impl;


import com.hong.test.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class UserServiceImpl1 implements UserService {
    /**
     * @param name
     * @return
     */
    @Override
    public String searchUser(String name) {
        System.out.println("From service 1, the main service !! input name is " + name);
        return "From service 1, name = "+name;
    }
}

