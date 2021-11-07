package com.awards.drama.drama;

import com.awards.drama.drama.model.TestEntity;
import com.awards.drama.entity.Test;
import com.awards.drama.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final 객체 생성자 삽입. autowired 효과
@Service
public class TestService {
    private final TestRepository testRepository;

    public TestEntity getTestEntity(){
        return new TestEntity();
    }

    public List<Test> getTestAll(){
        return testRepository.findAll();
    }
}
