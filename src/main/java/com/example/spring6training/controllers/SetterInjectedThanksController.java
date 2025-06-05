package com.example.spring6training.controllers;

import com.example.spring6training.services.ThankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedThanksController {
    ThankingService thankingService;

    @Autowired
    public void setThankingService(ThankingService thankingService) {
        this.thankingService = thankingService;
    }

    public String sayThankYou(){
        System.out.println("Thank you from controller");
        return thankingService.sayThanks();
    }
}
