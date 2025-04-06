package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class testController {
    // This is a test controller
    // Add your endpoints here
    // For example:
     @GetMapping("/test")
     public String test() {
         return "Test successful!";
     }
}
