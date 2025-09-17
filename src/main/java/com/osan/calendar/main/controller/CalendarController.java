package com.osan.calendar.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/main")
public class CalendarController {

    // 달력(강의실 현황)
    @RequestMapping(value = "/calendar", method={RequestMethod.GET,RequestMethod.POST})
    public String calendar(HttpServletRequest request) {
        return "/main/calendar";
    }
}
