package com.xkcoding.actuator.controller;

import com.xkcoding.actuator.service.MyCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MyCounterService myCounterService;

    @GetMapping("/hello")
    public void hello() {
        myCounterService.processCollectResult();
    }
}
