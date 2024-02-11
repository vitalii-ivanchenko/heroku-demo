package com.vivanchenko.heroku.controller;

import com.vivanchenko.heroku.dto.MonoEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monoweb/")
public class HerokuDemoController {

    private final Logger logger = LoggerFactory.getLogger(HerokuDemoController.class);

    @GetMapping
    public String getGreetingMessage() {
        return "Hello Mono!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void handleOperation(@RequestBody MonoEvent event) {
        logger.info("Hooray!!!");
        logger.info("Mono event fired: {}, {}", event.getType(), event.getData().getStatementItem().getAmount());
    }


}
