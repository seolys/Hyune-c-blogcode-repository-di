package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import java.util.List;

public interface V5StudentQueryRepositoryCustom {
	List<Student> findByDifficultCondition(String name);
}
