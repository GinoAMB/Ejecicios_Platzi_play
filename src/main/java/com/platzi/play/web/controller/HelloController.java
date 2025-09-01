package com.platzi.play.web.controller;

import com.platzi.play.domain.service.PlatziPlayAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String plaaform;
    private final PlatziPlayAIService aiService;

    public HelloController(@Value("${spring.application.name}") String plaaform, PlatziPlayAIService aiService) {
        this.plaaform = plaaform;
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String hello(){
        return this.aiService.generateGreeting(plaaform);
    }

}
