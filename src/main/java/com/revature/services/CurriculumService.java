package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Curriculum;
import com.revature.models.Subtopic;
import com.revature.models.Topic;
import com.revature.repositories.CurriculumRepository;
import com.revature.repositories.SubtopicRepository;
import com.revature.repositories.TopicRepository;

@Service
@Transactional
public class CurriculumService {

	@Autowired
	CurriculumRepository currRepo;

	@Autowired
	TopicRepository topicRepo;

	@Autowired
	SubtopicRepository subRepo;

	public List<Curriculum> findAllCurriculums() {
		return currRepo.findAll();
	}

	public Curriculum findCurriculumById(Integer id) {
		return currRepo.findById(id);
	}

	public Curriculum addCurriculum(Curriculum newCurr) {
		return currRepo.save(newCurr);
	}

	public Curriculum updateCurriculum(Curriculum updatedCurr) {
		Curriculum curr = currRepo.findById(updatedCurr.getId());

		if (curr == null) {
			return curr;
		} else {
			return currRepo.save(updatedCurr);
		}
	}


//	public List<Subtopic> getSubtopicsByCurriculumId(int id) {
//		List<Topic> topics = getTopicsByCurriculumId(id);
//		List<Subtopic> subtopics = new ArrayList<>();
//		for (Topic topic : topics) {
//			List<Subtopic> temp = subRepo.findSubtopicByParentTopicId(topic.getId());
//			if (temp.size() > 0) {
//				subtopics.addAll(temp);
//			}
//		}
//		return subtopics;
//	}

	public Topic addTopic(Topic newTopic) {
		return topicRepo.save(newTopic);
	}

	public Subtopic addSubtopic(Subtopic newSubtopic) {
		return subRepo.save(newSubtopic);
	}

//	public Topic updateTopic(Topic updatedTopic) {
//		Topic topic = topicRepo.findByTopicId(updatedTopic.getTopicId());
//		if (topic == null) {
//			return null;
//		} else {
//			return topicRepo.save(updatedTopic);
//		}
//	}

	public Subtopic updateSubtopic(Subtopic updatedSubtopic) {
		Subtopic subtopic = subRepo.findOne(updatedSubtopic.getId());
		if (subtopic == null) {
			return null;
		} else {
			return subRepo.save(updatedSubtopic);
		}
	}

//	public CurriculumTopic updateCurriculumTopic(int id, int week, Topic topic) {
//		List<CurriculumTopic> cts = currTopicRepo.findCurriculumTopicByCurriculumId(id);
//		if (cts == null) {
//			return null;
//		} else {
//			for (CurriculumTopic ct : cts) {
//				if (ct.getTopicId() == topic.getId()) {
//					ct.setNumberOfWeeks(week);
//					return currTopicRepo.save(ct);
//				}
//			}
//		}
//		return null;
//	}
}
