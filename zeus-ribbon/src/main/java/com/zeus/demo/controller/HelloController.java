package com.zeus.demo.controller;

import com.zeus.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className HelloController
 * @auther smile
 * @Description TODO
 * @Date 2020-04-02 18:11
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return helloService.sayHello() + " " + name;
    }

}
