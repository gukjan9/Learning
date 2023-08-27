package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content-Type: text/html
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
        // text 반환
    }

    // Content-Type: application/json
    // Response Body
    @GetMapping("/json/class")
    // html 반환하려는게 아니다.
    // 그냥 data 반환하려한다.
    @ResponseBody
    public Star helloClassJson(){
        // Java 의 객체를 Spring 이 자동으로 Json 으로 변환
        return new Star("Robbie", 95);
        // json 반환
    }
}