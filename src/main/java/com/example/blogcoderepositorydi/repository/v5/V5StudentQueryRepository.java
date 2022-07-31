package com.example.blogcoderepositorydi.repository.v5;

import com.example.blogcoderepositorydi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 역할: C, R(Entity를 리턴해야하는 경우)
 */
public interface V5StudentQueryRepository extends
		JpaRepository<Student, Long>,
		V5StudentQueryRepositoryCustom // 엔티티를 리턴해야하는데, 조건이 복잡한 경우.
{

}
