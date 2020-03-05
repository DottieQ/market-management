package org.launchcode.marketmanagement.controllers;

//created by Dottie Quick

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController  {

    @GetMapping()
    @ResponseBody
    public String hello() {
        return "Hello! This is the beginning of my project. So exciting!";
    }
}
