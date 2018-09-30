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
import com.revature.models.DaySubTopic;
import com.revature.models.Topic;
import com.revature.services.CurriculumService;

@CrossOrigin
@RestController
@RequestMapping("/curriculums")
public class CurriculumController {

	@Autowired
	CurriculumService service;

	/**
	 * Gets all Curriculums
	 * 
	 * @return ResponseEntity<List<Curriculum>> A list of curriculums and an HTTP
	 *         status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@GetMapping
	public ResponseEntity<List<Curriculum>> findAllCurriculums() {
		System.out.println("GET METHODHIT");
		List<Curriculum> allCurr = service.findAllCurriculums();
		System.out.println("Returning " + allCurr);
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
	@GetMapping(value = "/{id}")
	public ResponseEntity<Curriculum> findCurriculumById(@PathVariable("id") int id) {

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
	@PostMapping
	public ResponseEntity<Curriculum> addCurriculum(@RequestBody Curriculum newCurr) {
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
		Curriculum curr = service.updateCurriculum(updatedCurr);
		return new ResponseEntity<>(curr, HttpStatus.OK);
	}

//	/**
//	 * Gets all topics in the database associated with a given curriculum
//	 *
//	 * @param id
//	 *            int
//	 * @return ResponseEntity<List<Topic> A list of topic objects and a HTTP status
//	 *         code
//	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
//	 */
//	@GetMapping(value = "/topics/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Topic>> getAllTopicsByCurriculumId(@PathVariable("id") int id) {
//		List<Topic> topics = service.getTopicsByCurriculumId(id);
//		return new ResponseEntity<>(topics, HttpStatus.OK);
//	}
//
//	/**
//	 * Gets all subtopics in the database associated with a given curriculum
//	 *
//	 * @param id
//	 *            int
//	 * @return ResponseEntity<List<Subtopic> A list of subtopic objects and a HTTP
//	 *         status code
//	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
//	 */
//	@GetMapping(value = "/subtopics/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<List<Subtopic>> getAllSubtopicsByCurriculumId(@PathVariable("id") int id) {
//		List<Subtopic> subtopics = service.getSubtopicsByCurriculumId(id);
//		return new ResponseEntity<>(subtopics, HttpStatus.OK);
//	}





	/**
	 * Updates a topic in the database
	 *
	 * @param updatedTopic
	 *            Topic
	 * @return ResponseEntity<Topic> A topic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
//	@PutMapping(value = "/topics", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Topic> updateTopic(@Valid @RequestBody Topic updatedTopic) {
//		Topic topic = service.updateTopic(updatedTopic);
//		return new ResponseEntity<>(topic, HttpStatus.OK);
//	}

	

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
//	@PutMapping(value = "/topics/{id}/{week}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<CurriculumTopic> updateTopicWeek(@PathVariable("id") int id, @PathVariable("week") int week,
//			@Valid @RequestBody Topic topic) {
//		CurriculumTopic ct = service.updateCurriculumTopic(id, week, topic);
//		if (ct == null) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		} else {
//			return new ResponseEntity<>(ct, HttpStatus.OK);
//		}
//	}
}
