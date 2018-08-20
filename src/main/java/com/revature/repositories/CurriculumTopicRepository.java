package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.CurriculumTopic;

@Repository
public interface CurriculumTopicRepository extends JpaRepository<CurriculumTopic, Integer> {

	List<CurriculumTopic> findCurriculumTopicByCurriculumId(Integer id);
	CurriculumTopic findCurriculumTopicByTopicId(Integer id);

}
