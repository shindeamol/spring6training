package com.example.spring6training.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("thanksPrimaryService")
public class ThankingServicePrimary implements ThankingService {


    /**
     * @return String
     */
    @Override
    public String sayThanks() {
        return "Thank you from primary service";
    }
}
