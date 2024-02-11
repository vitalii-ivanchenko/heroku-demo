package com.vivanchenko.heroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroku/demo")
public class HerokuDemoController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }


}
