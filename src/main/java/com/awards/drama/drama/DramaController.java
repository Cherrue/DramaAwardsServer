package com.awards.drama.drama;

import com.awards.drama.drama.model.TestEntity;
import com.awards.drama.entity.Test;
import com.awards.drama.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DramaController {

    private TestService testService;

    @Autowired
    public DramaController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/drama/apitest")
    public Object testApi(){
        return testService.getTestEntity();
    }

    @GetMapping("/drama/dbtest")
    public List<Test> findAllTest(){
        return testService.getTestAll();
    }
}
