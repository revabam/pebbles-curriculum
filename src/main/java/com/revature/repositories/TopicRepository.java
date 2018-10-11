package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Topic;

/**
 * Repository for Topic
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

	/**
	 * Deletes topic by id
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	@Modifying
	@Transactional
	@Query(value="delete from Topic c where id = ?1")
	void deleteTopicById(int id);

}
