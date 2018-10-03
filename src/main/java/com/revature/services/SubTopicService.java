package com.revature.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.DaySubTopic;
import com.revature.models.SubtopicNames;
import com.revature.repositories.SubtopicNamesRepository;
import com.revature.repositories.SubtopicRepository;

@Service
public class SubTopicService {
	
	@Autowired
	SubtopicRepository subRepo;
	
	@Autowired
	SubtopicNamesRepository subtopicNamesRepo;
	
	
	/**
	 * Creates a day new subtopic and saves it to the database.
	 * @param DaySubTopic
	 * @return saved DaySubTopic
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public DaySubTopic addDaySubtopic(DaySubTopic newSubtopic) {
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
	 * Gets all of the day subtopics within the database.
	 * @return Set<DaySubTopic>
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public Set<DaySubTopic> getAllDaySubtopics() {
		return subRepo.findAll();
	}
	
	/**
	 * Deletes a day subtopic.
	 * 
	 * @param int id
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public void deleteSubtopic(int id) {
		subRepo.delete(id);
	}
	
	/**
	 * Deletes a subtopic.
	 * 
	 * @param int id
	 * @author Chris Holmes | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public void delete(int id) {
		subtopicNamesRepo.delete(id);
	}
	
	/**
	 * Gets all of the subtopics within the database.
	 * @return List<SubtopicNames>
	 * @author Rhys Yamasaki | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public List<SubtopicNames> getAllSubtopics() {
		return subtopicNamesRepo.findAll();
	}
	
	/**
	 * Gets a subtopic by id within the database.
	 * @return SubtopicNames
	 * @author Rhys Yamasaki | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public SubtopicNames getBySubtopicId(int id) {
		return subtopicNamesRepo.findOne(id);
	}
	
	/**
	 * Creates a new subtopic and saves it to the database.
	 * @param SubTopicNames
	 * @return saved SubTopicName
	 * @author Rhys Yamasaki | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public SubtopicNames addSubtopic(SubtopicNames newSubtopic) {
		return subtopicNamesRepo.save(newSubtopic);
	}

}
