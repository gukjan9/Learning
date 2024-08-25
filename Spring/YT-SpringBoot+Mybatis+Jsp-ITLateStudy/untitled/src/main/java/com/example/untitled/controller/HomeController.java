package com.example.untitled.controller;

import com.example.untitled.service.StudyService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    StudyService studyService;

    @GetMapping("")
    public String goHome(){
        return "/home";
    }

    @GetMapping("/study")
    public String goStudy(HttpServletRequest request){
        List<Map<String, String>> list = new ArrayList<>();
        list = studyService.doStudyList();

        for(Map<String, String> map : list){
            System.out.println(String.valueOf(map.get("id")));
            System.out.println(map.get("content"));
        }

        request.setAttribute("list", list);

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