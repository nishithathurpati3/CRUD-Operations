package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloSpring")
    public String  HelloSpring() {

        return "Lets explore Spring Boot with I.T Mastar !! ";
    }

}
