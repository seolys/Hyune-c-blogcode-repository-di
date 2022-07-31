package com.example.blogcoderepositorydi.repository.v5;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class V5EnrolledStudentQueryRepositoryTest {

	@Autowired
	private V5EnrolledStudentQueryRepository v5EnrolledStudentQueryRepository;

	@Test
	void findEnrolledStudents() {
		v5EnrolledStudentQueryRepository.findEnrolledStudents();
	}
}