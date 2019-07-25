package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dengchao
 * @date 2019/7/25 23:30
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
