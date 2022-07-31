package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * 졸업생 조회
 */
@Repository
public class V5GraduatedStudentQueryRepositoryImpl implements V5GraduatedStudentQueryRepository {

	@Override
	public List<Student> findGraduatedStudents() {
		return List.of(Student.of("졸업함", 15, "서울"));
	}
}
