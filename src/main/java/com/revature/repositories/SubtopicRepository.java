package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Subtopic;

@Repository
public interface SubtopicRepository extends JpaRepository<Subtopic, Integer> {

	List<Subtopic> findSubtopicByParentTopicId(Integer id);
	Subtopic findSubtopicById(Integer id);

}
