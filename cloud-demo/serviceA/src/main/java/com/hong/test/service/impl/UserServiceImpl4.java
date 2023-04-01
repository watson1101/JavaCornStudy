package com.hong.test.service.impl;


import com.hong.test.service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl4 implements UserService {
    /**
     * @param name
     * @return
     */
    @Override
    public String searchUser(String name) {
        System.out.println("From service ---4---,  input name is " + name);
        return "From service 4, name = " + name;
    }
}
