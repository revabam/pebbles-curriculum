package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Subtopic;

public interface SubtopicRepository extends JpaRepository<Subtopic, Integer> {

	List<Subtopic> findSubtopicByParentTopicId(Integer id);
	Subtopic findSubtopicById(Integer id);

}
