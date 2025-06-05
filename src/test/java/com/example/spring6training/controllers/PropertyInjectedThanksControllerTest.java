package com.example.spring6training.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedThanksControllerTest {
    @Autowired
    private PropertyInjectedThanksController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new PropertyInjectedThanksController();
//        controller.thankingService = new ThankingServiceImpl();
//    }

    @Test
    void sayThankYou() {
        System.out.println(controller.sayThankYou());
    }
}