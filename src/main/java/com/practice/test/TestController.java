package com.practice.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @PostMapping(path = "/insert", consumes = "application/json", produces = "application/json")
    public void insertMethod(@RequestBody TestEntity t) {
        testService.insertData(t);
    }

    @GetMapping(path = "/data", produces = "application/json")
    public TestEntity getData(@RequestParam String name) {
        return testService.testMethod(name);
    }
}
