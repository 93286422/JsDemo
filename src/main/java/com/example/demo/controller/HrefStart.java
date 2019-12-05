package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HrefStart {
    @RequestMapping("/start")
    public String test1(Model model){
        List<String> list = new ArrayList<String>();
        list.add("s1");
        list.add("s2");
        model.addAttribute("list",list);
        return "hrefTest1";
    }
}
