package com.example.untitled.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/login")
    public String goLogin(){
        return "/login";
    }

    @GetMapping("/signup")
    public String goSignup(){
        return "/signup";
    }
}
