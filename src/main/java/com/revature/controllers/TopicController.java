package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.revature.models.ExceptionObject;
import com.revature.models.Topic;
import com.revature.services.TopicService;

@CrossOrigin
@RestController
@RequestMapping("/topic")
public class TopicController {
	
	@Autowired
	TopicService service;
	
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
		Topic topic = service.addTopic(newTopic);
		//CurriculumTopic ct = new CurriculumTopic(id, topic.getId(), week);
		//service.addCurriculumTopic(ct);
		return new ResponseEntity<>(topic, HttpStatus.CREATED);
	}
	/**
	 * Finds topic by its ID.
	 * @param Int id
	 * @return ResponseEntity<Topic>
	 * @author Beck Larson
	 */
	@GetMapping("/find/{id}")
	public ResponseEntity<Topic> findTopic(@PathVariable int id){
		
		Topic value = service.findTopic(id);
		return new ResponseEntity<>(value, HttpStatus.OK);
		
	}
	/**
	 * Find all topics within the database.
	 * @return
	 * @author Beck Larson, Joey Shannon
	 */
	@GetMapping("/topics")
	public ResponseEntity<List<Topic>> findAllTopics(){
		List<Topic> value = service.findAllTopics();
		return new ResponseEntity<>(value, HttpStatus.OK);
	}
	/**
	 * Handles all exceptions thrown within the SubTopicController, then creates a error object. 
	 * @param Exception
	 * @param request
	 * @return ResponseEntity<ExceptionObject> A error object that contains details based off of the exception caught and a HttpStatus based off of the exception thrown. 
	 * @author Beck Larson
	 */
	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<ExceptionObject> handleUserNotFoundException(Exception ex, WebRequest request) {
		ExceptionObject errorDetails = new ExceptionObject(ex.getMessage(), ex.toString(), "" + this.getClass());
		if (ex instanceof HttpMessageNotReadableException) {
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }

}
