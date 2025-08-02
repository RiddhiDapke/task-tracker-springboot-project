package com.task_tracker.task_tracker;

import org.springframework.web.bind.annotation.RequestMapping;

public class test {

    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }
}
