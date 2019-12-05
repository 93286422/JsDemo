package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SessionTest {
    @RequestMapping("")
    public String test1(HttpServletRequest request){

         String s = (String)request.getSession().getAttribute("test");


        return null;
    }


}
