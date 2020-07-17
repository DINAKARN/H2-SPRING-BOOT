package com.practice.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService implements TestInterface {
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);
    @Autowired
    TestRepository testRepository;

    @Override
    public TestEntity testMethod(String name) {
        return testRepository.findByFirstname(name);
    }

    @Override
    public void insertData(TestEntity t) {
        TestEntity res = testRepository.save(t);
        logger.info("TestEntity",res);
        logger.error("TestEntity",res);
    }

}
