package com.example.spring6training.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("GE")
@SpringBootTest
class I18nControllerGETest {
    @Autowired
    private I18nController i18nController;

    @Test
    void sayThankYou() {
        System.out.println(i18nController.sayThankYou());
    }
}