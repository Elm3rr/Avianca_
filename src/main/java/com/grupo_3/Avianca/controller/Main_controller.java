package com.grupo_3.Avianca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Main_controller {
    @GetMapping("/login")
    public String home() {
        return "login";
    }
    @GetMapping("/Menu")
    public String Showindexpage(){
        return "index";
    }
    
}
