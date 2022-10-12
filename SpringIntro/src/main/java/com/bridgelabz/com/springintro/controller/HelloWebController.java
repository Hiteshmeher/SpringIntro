package com.bridgelabz.com.springintro.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @GetMapping("/hello")
    public String message(@RequestParam String message ){
        return message;
    }

    @GetMapping("/hi/{message}")
    public String message1(@PathVariable String message){
        return message;
    }
}
