package com.example.demo.service;

import com.example.demo.dao.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleService {

    @Autowired
    private SampleDao sampleDao;

    public String getContract() {
        return sampleDao.getContract();
    }

    public String insertContract() {
        return sampleDao.insertContract();
    }
}