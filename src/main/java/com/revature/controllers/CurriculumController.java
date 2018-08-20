package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Curriculum;
import com.revature.models.CurriculumTopic;
import com.revature.models.Subtopic;
import com.revature.models.Topic;
import com.revature.services.CurriculumService;

@CrossOrigin
@RestController
@RequestMapping
public class CurriculumController {
	
	@Autowired
	CurriculumService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curriculum>> findAllCurriculums() {
		System.out.println("[DEBUG] - in CurriculumController.findAllCurriculums()");
		List<Curriculum> allCurr = service.findAllCurriculums();
		return new ResponseEntity<List<Curriculum>>(allCurr, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> findCurriculumById(@PathVariable("id") int id) {
		System.out.println("[DEBUG] - in CurriculumController.findCurriculumById()");
		
		Curriculum curr = service.findCurriculumById(id);
		
		if(curr == null) {
			return new ResponseEntity<Curriculum>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Curriculum>(curr, HttpStatus.OK);
		}
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> addCurriculum(@Valid @RequestBody Curriculum newCurr) {
		System.out.println("[DEBUG] - in CurriculumController.addCurriculum()");
		Curriculum curr = service.addCurriculum(newCurr);
		return new ResponseEntity<Curriculum>(curr, HttpStatus.CREATED);
	}
	
	@PutMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> updateCurriculum(@Valid @RequestBody Curriculum updatedCurr) {
		System.out.println("[DEBUG] - in CurriculumController.updateCurriculum()");
		Curriculum curr = service.updateCurriculum(updatedCurr);
		return new ResponseEntity<Curriculum>(curr, HttpStatus.OK);
	}
	
	@GetMapping(value="/topics/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Topic>> getAllTopicsByCurriculumId(@PathVariable("id") int id) {
		System.out.println("[DEBUG] - in CurriculumController.getAllTopicsByCurriculumId()");
		List<Topic> topics = service.getTopicsByCurriculumId(id);
		return new ResponseEntity<List<Topic>>(topics, HttpStatus.OK);
	}
	
	@GetMapping(value="/subtopics/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Subtopic>> getAllSubtopicsByCurriculumId(@PathVariable("id") int id) {
		System.out.println("[DEBUG] - in CurriculumController.getAllTopicsByCurriculumId()");
		List<Subtopic> subtopics = service.getSubtopicsByCurriculumId(id);
		return new ResponseEntity<List<Subtopic>>(subtopics, HttpStatus.OK);
	}
	
	@PostMapping(value="/topic/{id}/{week}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Topic> addTopic(@PathVariable("id") int id, @PathVariable("week") int week, @Valid @RequestBody Topic newTopic) {
		System.out.println("[DEBUG] - in CurriculumController.addTopic()");
		Topic topic = service.addTopic(newTopic);
		CurriculumTopic ct = new CurriculumTopic(id, topic.getId(), week);
		service.addCurriculumTopic(ct);
		return new ResponseEntity<Topic>(topic, HttpStatus.CREATED);
	}
	
	@PostMapping(value="/subtopic", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Subtopic> addSubtopic(@Valid @RequestBody Subtopic newSubtopic) {
		System.out.println("[DEBUG] - in CurriculumController.addSubtopic()");
		Subtopic subtopic = service.addSubtopic(newSubtopic);
		return new ResponseEntity<Subtopic>(subtopic, HttpStatus.CREATED);
	}
	
	@PutMapping(value="/topic", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Topic> updateTopic(@Valid @RequestBody Topic updatedTopic) {
		System.out.println("[DEBUG] - in CurriculumController.updateTopic()");
		Topic topic = service.updateTopic(updatedTopic);
		return new ResponseEntity<Topic>(topic, HttpStatus.OK);
	}
	
	@PutMapping(value="/subtopic", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Subtopic> updateSubtopic(@Valid @RequestBody Subtopic updatedSubtopic) {
		System.out.println("[DEBUG] - in CurriculumController.updateSubtopic()");
		Subtopic subtopic = service.updateSubtopic(updatedSubtopic);
		return new ResponseEntity<Subtopic>(subtopic, HttpStatus.OK);
	}
	
//	@PutMapping(value="topic/{week}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Topic> updateTopicWeek(@PathVariable("week") int week, @Valid @RequestBody Topic topic) {
//		System.out.println("[DEBUG] - in CurriculumController.updateTopicWeek()");
//		CurriculumTopic ct = service.updateCurriculumTopic(week, topic);
//		if(ct == null) {
//			return new ResponseEntity<Topic>(null, HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Topic>(topic, HttpStatus.OK);
//	}
}
