package com.sayantan.manager.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/status", "/health"})
public class HomeController {

    @Value("${money.manager.frontend.url}")
    private String frontendUrl;
    @GetMapping
    public String healthCheck() {
        System.out.println("frontend url is "+frontendUrl);
        return "Application is running";
    }
}
