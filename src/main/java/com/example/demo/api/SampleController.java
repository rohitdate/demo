package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{contractId}")
    public void getContract(@PathVariable ("contractId") Integer integer) {

        String result = restTemplate.getForObject("https://jsonmock.hackerrank.com/api/movies/search/?Title=Un", String.class);
        System.out.println(result);
    }
}
