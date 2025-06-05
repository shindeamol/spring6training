package com.example.spring6training.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("GE")
@Service("i18Service")
public class ThinkingServiceImplGE implements ThankingService{
    @Override
    public String sayThanks() {
        return "Danke";
    }
}
