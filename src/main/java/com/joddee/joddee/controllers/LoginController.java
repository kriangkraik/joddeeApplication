package com.joddee.joddee.controllers;

import com.joddee.joddee.entitys.Login;
import com.joddee.joddee.exception.LoginException;
import com.joddee.joddee.services.LoginService;
import com.joddee.joddee.utils.JwtAuthenticationResponse;
import com.joddee.joddee.utils.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        try {
            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    login.getUsername(), login.getPassword());
            loginService.login(login.getUsername(), login.getPassword());
            String jwt = jwtTokenProvider.generateToken(authentication);
            return ResponseEntity.ok()
                    .body(Map.of(
                            "status", 200,
                            "message", "success",
                            "token", new JwtAuthenticationResponse(jwt).getJwt()
                    ));
        } catch (LoginException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }
}
