package com.osan.calendar.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class LectureController {

    // 강의실 현황
    @RequestMapping(value = "/lecture", method={RequestMethod.GET,RequestMethod.POST})
    public String lecture(HttpServletRequest request) {
        return "/main/lecture";
    }
}
