package com.revature.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.DaySubTopic;
import com.revature.repositories.SubtopicNamesRepository;
import com.revature.repositories.SubtopicRepository;

@Service
public class SubTopicService {
	
	@Autowired
	SubtopicRepository subRepo;
	
	@Autowired
	SubtopicNamesRepository subtopicNamesRepo;
	
	
	/**
	 * Creates a new subtopic and saves it to the database.
	 * @param DaySubTopic
	 * @return saved DaySubTopic
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public DaySubTopic addSubtopic(DaySubTopic newSubtopic) {
		return subRepo.save(newSubtopic);
	}
	
	/**
	 * Updates a subtopic that exists in the database.
	 * @param DaySubTopic
	 * @return null or saved DaySubTopic
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
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
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public Set<DaySubTopic> getAllSubtopics() {
		return subRepo.findAll();
	}
	
	/**
	 * Deletes a subtopic.
	 * 
	 * @param int id
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public void deleteSubtopic(int id) {
		subRepo.delete(id);
	}
	
	/**
	 * Deletes a day subtopic.
	 * 
	 * @param int id
	 * @author Chris Holmes | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public void delete(int id) {
		subtopicNamesRepo.delete(id);
	}

}
