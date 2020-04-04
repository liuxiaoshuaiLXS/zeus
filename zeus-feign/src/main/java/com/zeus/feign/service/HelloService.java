package com.zeus.feign.service;

import com.zeus.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {


    @Autowired
    private GetHello getHello;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return getHello.sayHello();
    }
}
