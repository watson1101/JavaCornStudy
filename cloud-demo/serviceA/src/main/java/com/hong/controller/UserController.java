package com.hong.controller;

import com.hong.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 对于同一个类的不同实现，Autowired 有两种方案：<br/>
     * 第一个是，在默认实现类中加上 @Primary 注解，则默认实现类的方法优先于指定的实现类；<br/>
     * 第二种方案：注入的时候增加 @Qualifier("userServiceImpl2") 注解，指明注入的具体实现类。<br/>
     */
//
//    @Autowired
//    private UserService userServicePrimery;
//
//    @Autowired
//    @Qualifier("userServiceImpl2")
//    private UserService userService;
//
//    @RequestMapping("/usertest1/{name}")
//    public String userTest1(@PathVariable("name") String name) {
//        return userServicePrimery.searchUser(name);
//    }
//
//    @RequestMapping("/usertest2/{name}")
//    public String userTest2(@PathVariable("name") String name) {
//        return userService.searchUser(name);
//    }

    @Autowired()
    private UserService userServiceImpl3;
    @Autowired
    private UserService userServiceImpl4;

    @RequestMapping("/usertest3/{name}")
    public String userTest3(@PathVariable("name") String name) {
        return "By name..." + userServiceImpl3.searchUser(name);
    }
    @RequestMapping("/usertest4/{name}")
    public String userTest4(@PathVariable("name") String name) {
        return "By name..." + userServiceImpl4.searchUser(name);
    }

}
