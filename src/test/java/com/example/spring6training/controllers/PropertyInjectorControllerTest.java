package com.example.spring6training.controllers;

import com.example.spring6training.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {

    PropertyInjectorController propertyInjectorController;

    @BeforeEach
    void setUp() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void hello() {
        System.out.println(propertyInjectorController.hello());
    }
}