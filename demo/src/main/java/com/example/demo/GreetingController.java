package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting/{endpoint}")  // Endpoint'i dinamik olarak kullanma
    public String greet(@PathVariable String endpoint,
                        @RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "! Your endpoint is: " + endpoint;
    }
}
