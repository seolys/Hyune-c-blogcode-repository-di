package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * 재학생 조회
 */
@Repository
public class V5EnrolledStudentQueryRepositoryImpl implements V5EnrolledStudentQueryRepository {

	@Override
	public List<Student> findEnrolledStudents() {
		return List.of(Student.of("나학생", 15, "서울"));
	}
}
