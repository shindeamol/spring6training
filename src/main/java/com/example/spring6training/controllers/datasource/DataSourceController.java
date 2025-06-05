package com.example.spring6training.controllers.datasource;

import com.example.spring6training.services.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSource dataSource;

    @Autowired
    public DataSourceController(@Qualifier("dataSourceService") DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSourceLink(){
        return dataSource.getDataSourceLink();
    }
}
