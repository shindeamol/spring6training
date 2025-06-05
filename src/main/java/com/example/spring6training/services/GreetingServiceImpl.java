package com.example.spring6training.services;

public class GreetingServiceImpl implements GreetingService {
    /**
     * @return String
     */
    @Override
    public String greet() {
        return "Hello from GreetingService!";
    }
}
