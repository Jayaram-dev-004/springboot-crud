package com.example.firstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Home page !!";
    }

    @RequestMapping("/about")
    public String about(){
        return "About page!!";
    }
}
