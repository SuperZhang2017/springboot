package com.zc.springboot;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Component
@Controller
public class HelloController {
//
//    @Autowired
//    private HelloProperties helloProperties;

    @RequestMapping("/hello")
    public String hello(Model model){
         model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
         return "hello";
    }



}
