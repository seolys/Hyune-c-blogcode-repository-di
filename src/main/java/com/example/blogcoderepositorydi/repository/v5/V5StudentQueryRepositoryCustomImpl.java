package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class V5StudentQueryRepositoryCustomImpl implements V5StudentQueryRepositoryCustom {

	@Override
	public List<Student> findByDifficultCondition(final String name) {
		return List.of(Student.of("복잡이", 19, "제주도"));
	}

}
