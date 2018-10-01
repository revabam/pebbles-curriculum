package com.revature.controllers;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.revature.models.DaySubTopic;
import com.revature.models.ExceptionObject;
import com.revature.services.SubTopicService;

@CrossOrigin
@RestController
@RequestMapping("/subtopic")
public class SubTopicController {

	@Autowired
	SubTopicService service;

	/**
	 * Creates a subtopic in the database
	 *
	 * @param newSubtopic Subtopic
	 * @return ResponseEntity<Subtopic> A newly created subtopic object and a HTTP
	 *         status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PostMapping
	public ResponseEntity<DaySubTopic> addSubtopic(@RequestBody DaySubTopic newSubtopic) {
		System.out.println("CREATING SUBTOPIC " + newSubtopic);
		DaySubTopic subtopic = service.addSubtopic(newSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.CREATED);
	}

	/**
	 * Updates a subtopic in the database
	 *
	 * @param updatedSubtopic Subtopic
	 * @return ResponseEntity<Subtopic> A subtopic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping
	public ResponseEntity<DaySubTopic> updateSubtopic(@Valid @RequestBody DaySubTopic updatedSubtopic) {
		DaySubTopic subtopic = service.updateSubtopic(updatedSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.OK);
	}

	/**
	 * Returns all subtopics within the database
	 * 
	 * @return ResponseEntity<Set<DaySubTopic>> A set of subtopics and an
	 *         HttpStatus.OK
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 * 
	 */
	@GetMapping
	public ResponseEntity<Set<DaySubTopic>> getAllSubtopics() {
		Set<DaySubTopic> values = service.getAllSubtopics();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}

	/**
	 * Handles all exceptions thrown within the SubTopicController, then creates a
	 * error object.
	 * 
	 * @param Exception
	 * @param request
	 * @return ResponseEntity<ExceptionObject> A error object that contains details
	 *         based off of the exception caught and a HttpStatus based off of the
	 *         exception thrown.
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
