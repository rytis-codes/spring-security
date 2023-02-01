package com.example.logindemo.controller;

import com.example.logindemo.model.LoginRequest;
import com.example.logindemo.model.LoginResponse;
import com.example.logindemo.security.JwtIssuer;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final JwtIssuer jwtIssuer;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest request) {
        var token = jwtIssuer.issue(JwtIssuer.Request.builder()
                .userId(1L)
                .email("test@test.com")
                .roles(List.of("ROLE_ADMIN"))
                .build());

        return LoginResponse.builder()
                .token(token)
                .build();
    }
}
