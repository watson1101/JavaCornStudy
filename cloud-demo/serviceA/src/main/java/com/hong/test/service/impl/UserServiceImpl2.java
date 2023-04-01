package com.hong.test.service.impl;


import com.hong.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    /**
     * @param name
     * @return
     */
    @Override
    public String searchUser(String name) {

        System.out.println("From service 2----- input name is " + name);
        return "From service 2, name = "+name;
    }
}
