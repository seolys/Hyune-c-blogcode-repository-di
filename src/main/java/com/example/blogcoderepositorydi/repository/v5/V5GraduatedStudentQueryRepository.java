package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import java.util.List;

/**
 * 졸업생 조회
 */
public interface V5GraduatedStudentQueryRepository {
	List<Student> findGraduatedStudents();
}
