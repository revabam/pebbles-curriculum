package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.CurriculumTopic;

public interface CurriculumTopicRepository extends JpaRepository<CurriculumTopic, Integer> {

	List<CurriculumTopic> findCurriculumTopicByCurriculumId();
	CurriculumTopic findCurriculumTopicByTopicId(Integer id);

}
