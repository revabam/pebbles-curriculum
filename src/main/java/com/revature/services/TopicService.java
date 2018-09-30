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

	
	public Topic addTopic(Topic newTopic) {
		return topicRepo.save(newTopic);
	}
	
	public Topic findTopic( int id) {
		return topicRepo.findByTopicId(id);
	}

}
