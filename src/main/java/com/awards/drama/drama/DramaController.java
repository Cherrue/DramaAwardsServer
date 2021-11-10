package com.awards.drama.drama;

import com.awards.drama.entity.DramaEntity;
import com.awards.drama.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("drama")
public class DramaController {

    private final TestService testService;
    private final DramaService dramaService;

    @Autowired
    public DramaController(TestService testService, DramaService dramaService){
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

    @GetMapping("/")
    public List<DramaEntity> searchDrama(){
        return dramaService.searchDrama();
    }
}
