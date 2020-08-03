package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

public class SampleService {

    private List<Integer> integerList = new ArrayList<>();

    public void insertInteger(Integer integer) {
        integerList.add(integer);
    }
}