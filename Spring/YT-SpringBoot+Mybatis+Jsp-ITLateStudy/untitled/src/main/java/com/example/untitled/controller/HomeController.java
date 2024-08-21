package com.example.untitled.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String goHome(){
        return "/home";
    }

    @GetMapping("/study")
    public String goStudy(){
        return "/study";
    }

    @GetMapping("/memberList")
    public String goMember(){
        return "/member";
    }

    @GetMapping("/about")
    public String goAbout(){
        return "/about";
    }
}