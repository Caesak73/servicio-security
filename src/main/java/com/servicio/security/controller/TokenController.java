package com.servicio.security.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.security.entity.TokenResponse;
import com.servicio.security.service.AuthenticationService;

@RestController
@RequestMapping("/get-token")
public class TokenController {
	
	@Autowired
    private AuthenticationService authenticationService;

    @GetMapping
    public TokenResponse getToken() {
        String token = authenticationService.getToken();
        LocalDate date = LocalDate.now();
        return new TokenResponse(token, date);
    }
}