package com.pl.middleware.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @Value("${app.profile}")
    private String profile;

    @GetMapping
    ResponseEntity<String> test() {
        return ResponseEntity.ok(profile);
    }
}
