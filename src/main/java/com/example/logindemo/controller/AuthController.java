package com.example.logindemo.controller;

import com.example.logindemo.model.LoginRequest;
import com.example.logindemo.model.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest request) {
        return LoginResponse.builder()
                .token("Bla bla bla")
                .build();
    }
}
