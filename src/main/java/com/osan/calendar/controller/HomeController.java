package com.osan.calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "redirect:/main/lecture";
        } else {
            // 세션이 없으면 login 페이지로 리다이렉트
            return "redirect:/login/loginForm";
        }
    }
}