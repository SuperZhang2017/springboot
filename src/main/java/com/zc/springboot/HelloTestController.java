package com.zc.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloTestController {

    @Autowired
    private HelloProperties helloProperties;

    @RequestMapping("/helloKitty")
    public String hello(){

        return helloProperties.getHi()+','+ helloProperties.getName() + helloProperties.getAge()+helloProperties.getClass();
    }



}
