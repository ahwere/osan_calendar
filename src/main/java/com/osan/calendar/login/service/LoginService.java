package com.osan.calendar.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osan.calendar.login.domain.User;
import com.osan.calendar.login.repository.UserRepository;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

}