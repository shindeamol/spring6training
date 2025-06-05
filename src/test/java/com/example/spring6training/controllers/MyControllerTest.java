package com.example.spring6training.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void hello(){
        MyController myController = new MyController();
        System.out.println(myController.hello());
    }

}