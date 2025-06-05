package com.example.spring6training.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DataSourceControllerDevTest {

    @Autowired
    private DataSourceController dataSourceController;

    @Test
    void getDataSourceLink() {
        System.out.println(dataSourceController.getDataSourceLink());
    }
}