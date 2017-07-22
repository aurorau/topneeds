package com.topneeds.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Iroshan on 5/10/2017.
 */

@RestController
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "/")
    public String testMethod() {
        LOG.info("-----------------Enter testMethod---------------");
        return "Home";
    }

    @RequestMapping(value = "/test")
    public String testAPI() {
        LOG.info("-----------------Enter testAPI---------------");
        return "TestAPI";
    }
}
