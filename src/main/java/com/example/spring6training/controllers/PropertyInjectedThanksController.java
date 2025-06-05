package com.example.spring6training.controllers;

import com.example.spring6training.services.ThankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedThanksController {
    @Autowired
    ThankingService thankingService;

    public String sayThankYou(){
        return thankingService.sayThanks();
    }
}
