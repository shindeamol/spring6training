package com.example.spring6training.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedThanksQualifierControllerTest {
    @Autowired
    ConstructorInjectedThanksQualifierController controller;

    @Test
    void sayThankYou() {
        System.out.println(controller.sayThankYou());
    }
}