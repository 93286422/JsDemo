package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A3 {
    @RequestMapping("/a3")
    public String a3(){
        System.out.println("2222222222222222222222222222222222");
        return "a3";
    }
}
