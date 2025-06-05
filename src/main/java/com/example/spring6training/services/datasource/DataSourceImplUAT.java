package com.example.spring6training.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSourceService")
public class DataSourceImplUAT implements DataSource {
    @Override
    public String getDataSourceLink() {
        return "This is datasource link for UAT Environment";
    }
}
