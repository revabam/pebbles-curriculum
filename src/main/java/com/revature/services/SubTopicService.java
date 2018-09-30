package com.revature.services;

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
	
	
	
	public DaySubTopic addSubtopic(DaySubTopic newSubtopic) {
		return subRepo.save(newSubtopic);
	}
	
	public DaySubTopic updateSubtopic(DaySubTopic updatedSubtopic) {
		DaySubTopic subtopic = subRepo.findOne(updatedSubtopic.getId());
		if (subtopic == null) {
			return null;
		} else {
			return subRepo.save(updatedSubtopic);
		}
	}

}
