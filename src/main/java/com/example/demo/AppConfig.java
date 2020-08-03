package com.example.demo;

import com.example.demo.dao.SampleDao;
import com.example.demo.dao.SampleDaoImpl;
import com.example.demo.service.SampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public SampleService getSampleService() {
        return new SampleService();
    }

    @Bean
    public SampleDao getSampleDao() {
        return new SampleDaoImpl();
    }
}
