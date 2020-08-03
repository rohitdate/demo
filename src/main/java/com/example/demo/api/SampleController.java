package com.example.demo.api;

import com.example.demo.exception.InternalServerException;
import com.example.demo.exception.NotFoundException;
import com.example.demo.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/{contractId}")
    public String getContract(@PathVariable (value = "contractId") Integer integer) {
        return sampleService.getContract();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/insertContract")
    public String insertContract(@RequestBody String integer) {
        return sampleService.insertContract();
    }
}
