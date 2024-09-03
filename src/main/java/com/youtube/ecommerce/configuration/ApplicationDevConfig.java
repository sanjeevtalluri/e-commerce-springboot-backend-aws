package com.youtube.ecommerce.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationDevConfig {
	
    @Bean
    @Profile("dev")
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .url("jdbc:mysql://ecommerce.c9s2qgooyrj4.eu-north-1.rds.amazonaws.com:3306/ecommerce")
                .username("mysqldbe")
                .password("mysqldbe")
                .build();
    }

}
