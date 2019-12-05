package com.example.demo.controller;


import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

@Controller
public class OCRController {

    public static final String APP_ID = "17517097";
    public static final String API_KEY = "ke6HrIwlcSwzu52TVpVIGVxt";
    public static final String SECRET_KEY = "on4V4AHtzFvQfXsRKMgRAH0T5xncNKb9";

    @ResponseBody
    @PostMapping("ocrimg")
    public String ocrimg(MultipartFile file) throws IOException {

        HashMap options = new HashMap();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");
        AipOcr client=new AipOcr(APP_ID,API_KEY,SECRET_KEY);
        byte [] bite=file.getBytes();
        JSONObject jsonObject=client.basicGeneral(bite,options);
        System.out.println(jsonObject.toString());
        JSONArray likeArray=jsonObject.getJSONArray("words_result");
        String s = likeArray.toString();
        System.out.println(s);
        for(int i=0;i<likeArray.length();i++)
        {
            JSONObject obj = likeArray.getJSONObject(i);
            //JSONObject a = new JSONObject();
            System.out.println(obj.get("words").toString());
        }
        return jsonObject.toString();
    }


}
