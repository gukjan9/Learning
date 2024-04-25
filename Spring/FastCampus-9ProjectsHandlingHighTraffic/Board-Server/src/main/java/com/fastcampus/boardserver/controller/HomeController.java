package com.fastcampus.boardserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value="/hello")
    public String hello(){
        return "Hello World!!!";
    }
}