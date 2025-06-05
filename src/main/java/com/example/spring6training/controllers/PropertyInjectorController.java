package com.example.spring6training.controllers;

import com.example.spring6training.services.GreetingService;

public class PropertyInjectorController {
    GreetingService greetingService;

    public String hello(){
        return greetingService.greet();
    }
}
