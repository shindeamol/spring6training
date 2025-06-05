package com.example.spring6training.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18Service")
public class ThankingServiceImplEN implements ThankingService {

    @Override
    public String sayThanks() {
        return "Thank you";
    }
}
