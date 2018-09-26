package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

	Topic findTopicById(Integer topic_id);

	List<Topic> findAllByTopicById(int topicId);


}
