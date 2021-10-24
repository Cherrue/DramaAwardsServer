package com.awards.drama.drama;

import com.awards.drama.drama.model.TestEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestEntity getTestEntity(){
        return new TestEntity();
    }
}
