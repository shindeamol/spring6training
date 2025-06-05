package com.example.spring6training.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSourceService")
public class DataSourceImplProd implements DataSource {
    @Override
    public String getDataSourceLink() {
        return "This is datasource link for Prod Environment";
    }
}
