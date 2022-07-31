package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface V5StudentCommandRepository extends
		JpaRepository<Student, Long>,
		V5StudentCommandRepositoryCustom
{

}
