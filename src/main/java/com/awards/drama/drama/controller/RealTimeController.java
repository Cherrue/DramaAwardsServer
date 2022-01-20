package com.awards.drama.drama.controller;

import com.awards.drama.drama.services.DramaService;
import com.awards.drama.drama.TestService;
import com.awards.drama.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drama")
public class RealTimeController {

    private final TestService testService;
    private final DramaService dramaService;

    @Autowired
    public RealTimeController(TestService testService, DramaService dramaService){
        this.testService = testService;
        this.dramaService = dramaService;
    }

    @GetMapping("apitest")
    public Object testApi(){
        return testService.getTestEntity();
    }

    @GetMapping("dbtest")
    public List<Test> findAllTest(){
        return testService.getTestAll();
    }
}
