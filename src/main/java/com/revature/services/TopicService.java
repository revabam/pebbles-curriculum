package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Topic;
import com.revature.repositories.TopicRepository;

@Service
@Transactional
public class TopicService {
	
	@Autowired
	TopicRepository topicRepo;

	/**
	 * Creates a new subtopic in the database.
	 * @param Topic
	 * @return Saved Topic.
	 */
	public Topic addTopic(Topic newTopic) {
		return topicRepo.save(newTopic);
	}
	
	/**
	 * Finds a Topic by its id.
	 * @param int id
	 * @return Topic
	 * @author Beck Larson
	 */
	public Topic findTopic( int id) {
		return topicRepo.findByTopicId(id);
	}

}
