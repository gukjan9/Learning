package com.sparta.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")             // /api 요청은 이 클래스로 넘어온다.
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody                     // 순수하게 string 만 전달한다고 하는 것, hello world 물결 없어짐
    public String hello(){
        return "Hello World!!";       // hello world 에 물결이 쳐지는 이유 : main > resources > templates 에 hello world.html 이 있는지 확인한다.
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "DELETE Method 요청";
    }
}
