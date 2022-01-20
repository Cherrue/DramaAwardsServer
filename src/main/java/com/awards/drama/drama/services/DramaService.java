package com.awards.drama.drama.services;

import com.awards.drama.drama.model.TestEntity;
import com.awards.drama.entity.DramaEntity;
import com.awards.drama.entity.Test;
import com.awards.drama.repository.DramaRepository;
import com.awards.drama.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final 객체 생성자 삽입. autowired 효과
@Service
public class DramaService {
    private final DramaRepository dramaRepository;

    public List<DramaEntity> searchDrama(){
        return dramaRepository.findAll();
    }
}
