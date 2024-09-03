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
                .url("jdbc:mysql://localhost:3306/ecommerce")
                .username("mysqldbe")
                .password("mysqldbe")
                .build();
    }

}
