package com.zeus.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @className HelloService
 * @auther smile
 * @Description TODO
 * @Date 2020-04-02 16:16
 */
@Service
public class HelloService {



    @Autowired
    RestTemplate restTemplate;

    public String sayHello(){
        return restTemplate.getForObject("http://ribbon-provider/hello?name=zhangsanfeng",String.class);
    }
}
