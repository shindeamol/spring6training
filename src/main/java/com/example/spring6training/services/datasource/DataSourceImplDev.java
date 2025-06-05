package com.example.spring6training.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("dataSourceService")
public class DataSourceImplDev implements DataSource {

    @Override
    public String getDataSourceLink() {
        return "This is datasource link for Development Environment";
    }
}
