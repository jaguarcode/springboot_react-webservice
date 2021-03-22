package com.jaguarcode.springboot_react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @GetMapping("/hello")
    public HashMap hello() {
        HashMap result = new HashMap();
        result.put("message", "안녕하세요");
        return result;
    }
}
