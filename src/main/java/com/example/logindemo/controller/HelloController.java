package com.example.logindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello, world! This is public to everyone";
    }

    @GetMapping("/secured")
    public String secured() {
        return "This can only be seen by a logged in user";
    }
}
