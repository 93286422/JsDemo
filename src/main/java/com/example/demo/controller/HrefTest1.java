package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HrefTest1 {
    @RequestMapping("/hreftest1")
    public String test1(@RequestParam("a1")String a1){

        System.out.println(a1);
        return "hrefTest1";
    }
}
