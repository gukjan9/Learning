package com.example.untitled.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    public String goHome(){
        return "/WEB-INF/views/home.jsp";
    }

    @GetMapping("/study")
    public String goStudy(){
        return "/WEB-INF/views/study.jsp";
    }

    @GetMapping("/memberList")
    public String goMember(){
        return "/WEB-INF/views/member.jsp";
    }

    @GetMapping("/about")
    public String goAbout(){
        return "/WEB-INF/views/about.jsp";
    }
}