package com.example.spring6training.controllers.i18n;

import com.example.spring6training.services.ThankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final ThankingService thankingService;

    @Autowired
    public I18nController(@Qualifier("i18Service") ThankingService thankingService) {
        this.thankingService = thankingService;
    }

    public String sayThankYou(){
        return thankingService.sayThanks();
    }
}
