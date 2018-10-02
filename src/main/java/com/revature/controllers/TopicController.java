package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	 * Creates a topic
	 *
	 * @param newTopic
	 *            Topic
	 * @return ResponseEntity<Topic> A newly created topic object and a HTTP status
	 *         code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 * 		   Rhys Yamasaki | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	@PostMapping
	public ResponseEntity<Topic> addTopic(@RequestBody Topic newTopic) {
		Topic topic = service.addTopic(newTopic);
		return new ResponseEntity<>(topic, HttpStatus.CREATED);
	}
	/**
	 * Finds topic by its ID.
	 * @param Int id
	 * @return ResponseEntity<Topic>
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Topic> findByTopicId(@PathVariable int id){
		
		Topic value = service.findTopic(id);
		return new ResponseEntity<>(value, HttpStatus.OK);
		
	}
	/**
	 * Find all topics within the database.
	 * @return
	 * @author Beck Larson, Joey Shannon | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	@GetMapping
	public ResponseEntity<List<Topic>> findAllTopics(){
		List<Topic> value = service.findAllTopics();
		return new ResponseEntity<>(value, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteTopic(@PathVariable int id){
		service.deleteTopic(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	/**
	 * Handles all exceptions thrown within the SubTopicController, then creates a error object. 
	 * @param Exception
	 * @param request
	 * @return ResponseEntity<ExceptionObject> A error object that contains details based off of the exception caught and a HttpStatus based off of the exception thrown. 
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
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
