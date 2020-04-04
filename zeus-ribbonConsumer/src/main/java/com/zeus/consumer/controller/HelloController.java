package com.zeus.consumer.controller;

import com.zeus.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className HelloController
 * @auther smile
 * @Description TODO
 * @Date 2020-04-02 16:15
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello()+" "+name;
    }


}
