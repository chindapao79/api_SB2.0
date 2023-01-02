package com.api.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class HomeCont {
    @GetMapping(value = "home")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello Spring Gradle", HttpStatus.OK);
    }
}
