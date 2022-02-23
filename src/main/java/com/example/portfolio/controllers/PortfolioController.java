package com.example.portfolio.controllers;

import com.example.portfolio.repositories.SoundPlayer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {


    @GetMapping("/")
    public String getFrontPage(){
        new SoundPlayer("src/main/resources/the9th.wav");
        return "index";
    }
    @GetMapping("/imsimon")
    public String getImsimon(){
        return "imsimon";
    }
}
