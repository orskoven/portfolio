package com.example.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {


    @GetMapping("/")
    public String getFrontPage(){
        return "index";
    }
    @GetMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }

    @GetMapping("/curriculum")
    public String getCv(){
        return "curriculum";
    }
}
