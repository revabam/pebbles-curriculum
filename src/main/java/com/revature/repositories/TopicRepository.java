package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

	Integer findTopicById(Integer topic_id);

}
