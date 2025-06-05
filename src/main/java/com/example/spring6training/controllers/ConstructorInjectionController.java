package com.example.spring6training.controllers;

import com.example.spring6training.services.GreetingService;

public class ConstructorInjectionController {
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greet();
    }
}
