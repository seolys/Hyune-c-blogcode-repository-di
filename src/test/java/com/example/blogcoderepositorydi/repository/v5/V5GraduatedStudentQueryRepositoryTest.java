package com.example.blogcoderepositorydi.repository.v5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V5GraduatedStudentQueryRepositoryTest {

	@Autowired private V5GraduatedStudentQueryRepository v5GraduatedStudentQueryRepository;

	@Test
	void findGraduatedStudents() {
		v5GraduatedStudentQueryRepository.findGraduatedStudents();
	}
}