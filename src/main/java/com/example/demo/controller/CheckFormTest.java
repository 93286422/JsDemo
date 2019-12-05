package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckFormTest {
    @RequestMapping("/test1")
    public String test1(@RequestParam("usernameSS")String username){
        System.out.println(username);
        System.out.println("ssss");
        return "test7表单校验";

    }
}
