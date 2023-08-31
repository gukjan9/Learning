package com.sparta.springauth.controller;

import com.sparta.springauth.dto.LoginRequestDto;
import com.sparta.springauth.dto.SignupRequestDto;
import com.sparta.springauth.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// controller 여서 html 자동 찾아짐
@Controller
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/login-page")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/user/signup")
    public String signupPage() {
        return "signup";
    }

    @PostMapping("/user/signup")
    public String signup(SignupRequestDto requestDto){
        userService.signup(requestDto);

        return "redirect:/api/user/login-page";
    }

//      로그인은 필터 단에서 처리
//    @PostMapping("/user/login")
//    public String login(LoginRequestDto requestDto, HttpServletResponse res){
//        try {
//            userService.login(requestDto, res);
//        } catch (Exception e) {
//            return "redirect:/api/user/login-page?error";
//        }
//
//        return "redirect:/";
//    }
}