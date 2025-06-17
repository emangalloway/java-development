package com.pluralsight.NorthwindTradersSpringBoot4.db;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
public class DataBaseConfig {
    private BasicDataSource dataSource;

    public DataBaseConfig(@Value("${datasource.url}") String url, @Value("${datasource.username}") String username, @Value("${datasource.password}") String Password) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(Password);

    }

    @Bean
    public DataSource dataSource(){
        return dataSource;
    }
}
