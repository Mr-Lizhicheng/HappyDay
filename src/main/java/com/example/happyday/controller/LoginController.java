package com.example.happyday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "hello!get";
    }

    @PostMapping("/login")
    @ResponseBody
    public String logins() {

        return "hello!post";
    }

}
