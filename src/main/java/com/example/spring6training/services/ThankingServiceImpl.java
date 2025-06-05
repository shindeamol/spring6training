package com.example.spring6training.services;

import org.springframework.stereotype.Service;

@Service("thanksService")
public class ThankingServiceImpl implements ThankingService {
    /**
     * @return String
     */
    @Override
    public String sayThanks() {
        return "Thanks from service implementation";
    }
}
