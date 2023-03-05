package com.virg.pricer.controllers;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BinanceLogginerController {

    @RequestMapping(path="/test", method = RequestMethod.POST)
    public Hello Test(){
        return new Hello();
    }

    class Hello{
        int id = 0;
        int a = 2;
        String yes="no";
    }
}
