package com.awards.drama;

import com.awards.drama.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;
import java.util.Optional;

@SpringBootTest
class DramaApplicationTests {
	@Autowired
	TestRepository testRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void SelectTestTable(){
		Optional<com.awards.drama.entity.Test> result = testRepository.findById(1);
		System.out.println("===== SelectTestTable RESULT =====");
		System.out.println(result.get().getName());
		assert(Objects.equals(result.get().getName(), "a"));
	}
}
