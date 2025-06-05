package com.example.spring6training.controllers;

import com.example.spring6training.services.ThankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedThanksQualifierController {
    ThankingService thankingService;

    @Autowired
    public ConstructorInjectedThanksQualifierController(@Qualifier("thanksPrimaryService") ThankingService thankingService) {
        this.thankingService = thankingService;
    }

    public String sayThankYou(){
        System.out.println("Thank you from qualifier controller");
        return thankingService.sayThanks();
    }
}
