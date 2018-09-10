package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@RequestMapping("/curriculums")
public class CurriculumController {

	@Autowired
	CurriculumService service;

	private static final Logger logger = LogManager.getLogger(CurriculumController.class);

	/**
	 * Gets all Curriculums
	 * 
	 * @return ResponseEntity<List<Curriculum>> A list of curriculums and an HTTP
	 *         status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Curriculum>> findAllCurriculums() {
		logger.info("[DEBUG] - in CurriculumController.findAllCurriculums()");
		List<Curriculum> allCurr = service.findAllCurriculums();
		return new ResponseEntity<>(allCurr, HttpStatus.OK);
	}

	/**
	 * Gets one curriculum by its id
	 *
	 * @param id
	 *            int
	 * @return ResponseEntity<Curriculum> A curriculum object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> findCurriculumById(@PathVariable("id") int id) {
		logger.info("[DEBUG] - in CurriculumController.findCurriculumById()");

		Curriculum curr = service.findCurriculumById(id);

		if (curr == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(curr, HttpStatus.OK);
		}
	}

	/**
	 * Adds a curriculum to the database and returns it
	 *
	 * @param newCurr
	 *            Curriculum
	 * @return ResponseEntity<Curriculum> A curriculum object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> addCurriculum(@RequestBody Curriculum newCurr) {
		logger.info("[DEBUG] - in CurriculumController.addCurriculum()");
		Curriculum curr = service.addCurriculum(newCurr);
		return new ResponseEntity<>(curr, HttpStatus.CREATED);
	}

	/**
	 * Updates a curriculum in the database and returns it
	 *
	 * @param updatedCurr
	 *            Curriculum
	 * @return ResponseEntity<Curriculum> A curriculum object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curriculum> updateCurriculum(@Valid @RequestBody Curriculum updatedCurr) {
		logger.info("[DEBUG] - in CurriculumController.updateCurriculum()");
		Curriculum curr = service.updateCurriculum(updatedCurr);
		return new ResponseEntity<>(curr, HttpStatus.OK);
	}

	/**
	 * Gets all topics in the database associated with a given curriculum
	 *
	 * @param id
	 *            int
	 * @return ResponseEntity<List<Topic> A list of topic objects and a HTTP status
	 *         code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@GetMapping(value = "/topics/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Topic>> getAllTopicsByCurriculumId(@PathVariable("id") int id) {
		logger.info("[DEBUG] - in CurriculumController.getAllTopicsByCurriculumId()");
		List<Topic> topics = service.getTopicsByCurriculumId(id);
		return new ResponseEntity<>(topics, HttpStatus.OK);
	}

	/**
	 * Gets all subtopics in the database associated with a given curriculum
	 *
	 * @param id
	 *            int
	 * @return ResponseEntity<List<Subtopic> A list of subtopic objects and a HTTP
	 *         status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@GetMapping(value = "/subtopics/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Subtopic>> getAllSubtopicsByCurriculumId(@PathVariable("id") int id) {
		logger.info("[DEBUG] - in CurriculumController.getAllTopicsByCurriculumId()");
		List<Subtopic> subtopics = service.getSubtopicsByCurriculumId(id);
		return new ResponseEntity<>(subtopics, HttpStatus.OK);
	}

	/**
	 * Creates a topic and attaches it to a curriculum
	 *
	 * @param id
	 *            int
	 * @param week
	 *            int
	 * @param newTopic
	 *            Topic
	 * @return ResponseEntity<Topic> A newly created topic object and a HTTP status
	 *         code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PostMapping(value = "/topics/{id}/{week}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Topic> addTopic(@PathVariable("id") int id, @PathVariable("week") int week,
			@RequestBody Topic newTopic) {
		logger.info("[DEBUG] - in CurriculumController.addTopic()");
		Topic topic = service.addTopic(newTopic);
		CurriculumTopic ct = new CurriculumTopic(id, topic.getId(), week);
		service.addCurriculumTopic(ct);
		return new ResponseEntity<>(topic, HttpStatus.CREATED);
	}

	/**
	 * Creates a subtopic in the database
	 *
	 * @param newSubtopic
	 *            Subtopic
	 * @return ResponseEntity<Subtopic> A newly created subtopic object and a HTTP
	 *         status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PostMapping(value = "/subtopics", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Subtopic> addSubtopic(@RequestBody Subtopic newSubtopic) {
		logger.info("[DEBUG] - in CurriculumController.addSubtopic()");
		Subtopic subtopic = service.addSubtopic(newSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.CREATED);
	}

	/**
	 * Updates a topic in the database
	 *
	 * @param updatedTopic
	 *            Topic
	 * @return ResponseEntity<Topic> A topic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping(value = "/topics", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Topic> updateTopic(@Valid @RequestBody Topic updatedTopic) {
		logger.info("[DEBUG] - in CurriculumController.updateTopic()");
		Topic topic = service.updateTopic(updatedTopic);
		return new ResponseEntity<>(topic, HttpStatus.OK);
	}

	/**
	 * Updates a subtopic in the database
	 *
	 * @param updatedSubtopic
	 *            Subtopic
	 * @return ResponseEntity<Subtopic> A subtopic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping(value = "/subtopics", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Subtopic> updateSubtopic(@Valid @RequestBody Subtopic updatedSubtopic) {
		logger.info("[DEBUG] - in CurriculumController.updateSubtopic()");
		Subtopic subtopic = service.updateSubtopic(updatedSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.OK);
	}

	/**
	 * Updates a topic week in the database
	 *
	 * @param id
	 *            int
	 * @param week
	 *            int
	 * @param updatedTopic
	 *            Topic
	 * @return ResponseEntity<Topic> A CurriculumTopic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping(value = "/topics/{id}/{week}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CurriculumTopic> updateTopicWeek(@PathVariable("id") int id, @PathVariable("week") int week,
			@Valid @RequestBody Topic topic) {
		logger.info("[DEBUG] - in CurriculumController.updateTopicWeek()");
		CurriculumTopic ct = service.updateCurriculumTopic(id, week, topic);
		if (ct == null) {
			return new ResponseEntity<>((CurriculumTopic) null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(ct, HttpStatus.OK);
		}
	}
}
