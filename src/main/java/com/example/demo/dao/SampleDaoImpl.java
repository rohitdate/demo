package com.example.demo.dao;

import com.example.demo.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class SampleDaoImpl implements SampleDao {

    @Autowired
    private RestTemplate restTemplate;

    String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=Un";

    @Override
    public String getContract() {
        String result = restTemplate.getForObject(url, String.class);
        if(result == null)
            throw new NotFoundException("Cannot fetch data...");

        return result;
    }

    @Override
    public String insertContract() {
        return restTemplate.getForObject(url, String.class);
    }
}
