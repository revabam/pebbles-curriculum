package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Curriculum;
import com.revature.models.CurriculumTopic;
import com.revature.models.Subtopic;
import com.revature.models.Topic;
import com.revature.repositories.CurriculumRepository;
import com.revature.repositories.CurriculumTopicRepository;
import com.revature.repositories.SubtopicRepository;
import com.revature.repositories.TopicRepository;

@Service
@Transactional
public class CurriculumService {
	
	@Autowired
	CurriculumRepository currRepo;
	
	@Autowired
	CurriculumTopicRepository currTopicRepo;
	
	@Autowired
	TopicRepository topicRepo;
	
	@Autowired
	SubtopicRepository subRepo;

	public List<Curriculum> findAllCurriculums() {
		return currRepo.findAll();
	}

	public Curriculum findCurriculumById(Integer id) {
		return currRepo.findCurriculumById(id);
	}

	public Curriculum addCurriculum(Curriculum newCurr) {
		return currRepo.save(newCurr);
	}

	public Curriculum updateCurriculum(Curriculum updatedCurr) {
		Curriculum curr = currRepo.findCurriculumById(updatedCurr.getId());
		
		if(curr == null) {
			return curr;
		} else {
			return currRepo.save(updatedCurr);
		}
	}

	public List<Topic> getTopicsByCurriculumId(int id) {
		List<CurriculumTopic> currTopics = currTopicRepo.findCurriculumTopicByCurriculumId(id);
		List<Topic> topics = new ArrayList<>();
		for(CurriculumTopic curr : currTopics) {
			Topic topic = topicRepo.findOne(curr.getTopic_id());
			if(topic != null) {
				topics.add(topic);
			}
		}
		return topics;
	}

	public List<Subtopic> getSubtopicsByCurriculumId(int id) {
		List<Topic> topics = getTopicsByCurriculumId(id);
		System.out.println("Topics: " + topics.size());
		List<Subtopic> subtopics = new ArrayList<>();
		for(Topic topic : topics) {
			List<Subtopic> temp = subRepo.findSubtopicByParentTopicId(topic.getId());
			if(temp.size() > 0) {
				subtopics.addAll(temp);
			}
		}
		return subtopics;
	}

	public Topic addTopic(Topic newTopic) {
		return topicRepo.save(newTopic);
	}

	public CurriculumTopic addCurriculumTopic(CurriculumTopic ct) {
		return currTopicRepo.save(ct);
	}

	public Subtopic addSubtopic(Subtopic newSubtopic) {
		return subRepo.save(newSubtopic);
	}

	public Topic updateTopic(Topic updatedTopic) {
		Topic topic = topicRepo.findTopicById(updatedTopic.getId());
		if(topic == null) {
			return null;
		} else {
			return topicRepo.save(updatedTopic);
		}
	}

	public Subtopic updateSubtopic(Subtopic updatedSubtopic) {
		Subtopic subtopic = subRepo.findSubtopicById(updatedSubtopic.getId());
		if(subtopic == null) {
			return null;
		} else {
			return subRepo.save(updatedSubtopic);
		}
	}

	public CurriculumTopic updateCurriculumTopic(int id, int week, Integer topic) {
		List<CurriculumTopic> cts = currTopicRepo.findCurriculumTopicByCurriculumId(id);
		if(cts == null) {
			return null;
		} else {
			for(CurriculumTopic ct : cts) {
				if(ct.getTopic_id() == topic) {
					ct.setNumber_of_weeks(week);
					return currTopicRepo.save(ct);
				}
			}
		}
		return null;
	}
}
