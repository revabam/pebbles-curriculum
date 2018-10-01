package com.revature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.DaySubTopic;
import com.revature.repositories.SubtopicRepository;

@Service
@Transactional
public class SubTopicService {
	
	@Autowired
	SubtopicRepository subRepo;
	
	
	/**
	 * Creates a new subtopic and saves it to the database.
	 * @param DaySubTopic
	 * @return saved DaySubTopic
	 * @author Beck Larson
	 */
	public DaySubTopic addSubtopic(DaySubTopic newSubtopic) {
		return subRepo.save(newSubtopic);
	}
	
	/**
	 * Updates a subtopic that exists in the database.
	 * @param DaySubTopic
	 * @return null or saved DaySubTopic
	 * @author Beck Larson
	 */
	public DaySubTopic updateSubtopic(DaySubTopic updatedSubtopic) {
		DaySubTopic subtopic = subRepo.findOne(updatedSubtopic.getId());
		if (subtopic == null) {
			return null;
		} else {
			return subRepo.save(updatedSubtopic);
		}
	}
	
	/**
	 * Gets all of the subtopics within the database.
	 * @return Set<DaySubTopic>
	 * @author Beck Larson
	 */
	public Set<DaySubTopic> getAllSubtopics() {
		return subRepo.findAll();
	}

}
