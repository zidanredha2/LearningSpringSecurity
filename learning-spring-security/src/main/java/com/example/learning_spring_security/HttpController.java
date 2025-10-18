package com.example.learning_spring_security;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HttpController {
    @GetMapping
    public String sessionID(HttpSession session) {
        String sessionId = session.getId();
        return "Hi! your session ID is " + sessionId;
    }
}
