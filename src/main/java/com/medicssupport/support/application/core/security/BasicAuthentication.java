package com.medicssupport.support.application.core.security;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BasicAuthentication {

    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> test(Authentication authentication) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Authentication successful");
        response.put("user", authentication.getName());
        response.put("timestamp", new Date());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user-info")
    public ResponseEntity<Map<String, Object>> getUserInfo(Authentication authentication) {
        Map<String, Object> response = new HashMap<>();
        response.put("username", authentication.getName());
        response.put("authorities", authentication.getAuthorities());
        return ResponseEntity.ok(response);
    }
}
