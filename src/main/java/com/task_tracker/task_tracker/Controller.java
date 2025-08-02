package com.task_tracker.task_tracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping
    public String hello(){
        return "Heeloooo";
    }
}
