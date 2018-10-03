package com.revature.services;

import java.util.List;

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
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public Topic addTopic(Topic newTopic) {
		return topicRepo.save(newTopic);
	}
	
	/**
	 * Finds a Topic by its id.
	 * @param int id
	 * @return Topic
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public Topic findTopic( int id) {
		return topicRepo.findOne(id);
	}
	/**
	 * Finds all topics currently within the database.
	 * @return List<Topic>
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public List<Topic> findAllTopics(){
		return topicRepo.findAll();
	}
	/**
	 * deletes a topic by its id.
	 * @param int id
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public void deleteTopic(int id) {
		topicRepo.deleteTopicById(id);
	}

}
