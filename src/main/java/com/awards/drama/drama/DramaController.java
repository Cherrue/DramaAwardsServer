package com.awards.drama.drama;

import com.awards.drama.drama.model.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DramaController {

    private TestService testService;

    @Autowired
    public DramaController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/drama/test")
    public Object testApi(){
        return testService.getTestEntity();
    }
}
