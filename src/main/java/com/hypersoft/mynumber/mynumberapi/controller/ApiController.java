package com.hypersoft.mynumber.mynumberapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @ResponseBody
    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public String calculate() {
        return "Hello world";
    }
}
