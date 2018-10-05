package com.revature.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.DaySubTopic;

/**
 * Repository for DaySubtopic
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface SubtopicRepository extends CrudRepository<DaySubTopic, Integer> {
	
	/**
	 * Finds all DaySubTopic
	 * @return Set<DaySubTopic>
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	Set<DaySubTopic> findAll();
	
}
