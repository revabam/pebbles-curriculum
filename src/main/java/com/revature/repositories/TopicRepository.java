package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

	@Modifying
	@Transactional
	@Query(value="delete from Topic c where id = ?1")
	void deleteTopicById(int id);

}
