package com.example.spring6training.controllers;

import com.example.spring6training.services.GreetingService;
import com.example.spring6training.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hello() {
        System.out.println("hello");
        return greetingService.greet();
    }

}
