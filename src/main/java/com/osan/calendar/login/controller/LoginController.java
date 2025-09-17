package com.osan.calendar.login.controller;

import com.osan.calendar.login.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    // 로그인 폼 보여주기
    @RequestMapping(value = "/loginForm", method={RequestMethod.GET,RequestMethod.POST})
    public String loginForm(HttpServletRequest request) {

/*        String rawPassword = "1234"; // 예: "1234"
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);*/

        return "login/loginForm"; // templates/login/loginForm.html
    }
}