package com.example.demo.controller;

import javafx.scene.control.Alert;
import javafx.scene.media.SubtitleTrack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class JsToFromValue {

    @RequestMapping("/test2")
    public String test(@RequestParam("text1")String test1,
                        @RequestParam("text2")String test2,
                        @RequestParam("file1")MultipartFile file)
    {

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(file);
        return "JsToFromValue";
    }
}
