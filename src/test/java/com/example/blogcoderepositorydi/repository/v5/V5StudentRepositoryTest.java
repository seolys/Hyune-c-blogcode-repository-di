package com.example.blogcoderepositorydi.repository.v5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V5StudentRepositoryTest {

	@Autowired private V5StudentQueryRepository v5StudentRepository;

	@Test
	void findByDifficultCondition() {
		final var students = v5StudentRepository.findByDifficultCondition("seolys");
	}

}
