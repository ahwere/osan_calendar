package com.osan.calendar.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class AccommodationController {

    // 숙소 현황
    @RequestMapping(value = "/accommodation", method={RequestMethod.GET,RequestMethod.POST})
    public String accommodation(HttpServletRequest request) {
        return "/main/accommodation";
    }
}
