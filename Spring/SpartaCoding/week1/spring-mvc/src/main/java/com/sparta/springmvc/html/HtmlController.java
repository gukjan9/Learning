package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static long visitCount = 0;

    // 정적 웹페이지

    // thymeleaf 주석
    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    // thymeleaf 활성화
    @GetMapping("/html/templates")
    public String htmlTemplates(){
        return "hello";
    }

    // 동적 웹페이지

    @GetMapping("html/dynamic")
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
