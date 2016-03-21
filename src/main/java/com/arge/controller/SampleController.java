package com.arge.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by M.UNLU on 17.03.2016.
 */

    @Controller
    @EnableAutoConfiguration
    public class SampleController {

        @RequestMapping(path = "/sayhello",method = RequestMethod.GET)
        @ResponseBody
        String home() {

            return "Hello World!";
        }
    }
