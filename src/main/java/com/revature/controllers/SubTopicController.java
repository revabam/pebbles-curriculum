package com.revature.controllers;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.revature.models.DaySubTopic;
import com.revature.models.ExceptionObject;
import com.revature.models.SubtopicNames;
import com.revature.services.SubTopicService;

@CrossOrigin
@RestController
@RequestMapping("/subtopic")
public class SubTopicController {

	@Autowired
	SubTopicService service;

	/**
	 * Creates a subtopic in the database
	 * @param newSubtopic Subtopic
	 * @return ResponseEntity<Subtopic> A newly created subtopic object and a HTTP
	 *         status code
	 * @author Christian DeFaria | 1806-Jun18-USF-Java | Wezley Singleton
	 */
	@PostMapping("/day")
	public ResponseEntity<DaySubTopic> addDaySubtopic(@RequestBody DaySubTopic newSubtopic) {
		System.out.println("CREATING SUBTOPIC " + newSubtopic);
		DaySubTopic subtopic = service.addDaySubtopic(newSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.CREATED);
	}
	
	/**
	 * Updates a subtopic in the database
	 * @param updatedSubtopic Subtopic
	 * @return ResponseEntity<Subtopic> A subtopic object and a HTTP status code
	 * @author Christian DeFaria | 1806-Jun18-USF-Java | Wezley Singleton
	 */
	@PutMapping("/day")
	public ResponseEntity<DaySubTopic> updateDaySubtopic(@Valid @RequestBody DaySubTopic updatedSubtopic) {
		DaySubTopic subtopic = service.updateSubtopic(updatedSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.OK);
	}

	/**
	 * Returns all subtopics within the database
	 * @return ResponseEntity<Set<DaySubTopic>> A set of day subtopics and an
	 *         HttpStatus.OK
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	@GetMapping("/day")
	public ResponseEntity<Set<DaySubTopic>> getAllDaySubtopics() {
		Set<DaySubTopic> values = service.getAllDaySubtopics();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}
	/**
	 * Deletes a day subtopic with the specified id from the database.
	 * @param int id
	 * @return HttpStatus
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	@DeleteMapping("/day/{id}")
	public ResponseEntity<HttpStatus> deleteDaySubTopic(@PathVariable int id){
		service.deleteSubtopic(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/**
	 * Deletes a subtopic with the specified id from the database.
	 * @param int id
	 * @return HttpStatus
	 * @author Chris Holmes | Spark1806-USF-Java | Steven Kelsey
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteSubTopic(@PathVariable int id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/**
	 * Returns all subtopics within the database
	 * @return ResponseEntity<List<SubtopicNames>> A list of subtopics and an
	 *         HttpStatus.OK
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	@GetMapping
	public ResponseEntity<List<SubtopicNames>> getAllSubtopics() {
		List<SubtopicNames> values = service.getAllSubtopics();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}
	
	/**
	 * Return a subtopic within the database
	 * @return ResponseEntity<SubtopicNames> and an
	 *         HttpStatus.OK
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	@GetMapping("/{id}")
	public ResponseEntity<SubtopicNames> getBySubtopicId(@PathVariable int id) {
		SubtopicNames value = service.getBySubtopicId(id);
		return new ResponseEntity<>(value, HttpStatus.OK);
	}
	
	/**
	 * Adds a new subtopic to subtopic names table
	 * @param newSubtopic
	 * @return ResponseEntity<SubtopicNames> and
	 * 			an HttpStatus of ok
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	@PostMapping
	public ResponseEntity<SubtopicNames> addSubtopic(@RequestBody SubtopicNames newSubtopic) {
		System.out.println("CREATING SUBTOPIC " + newSubtopic);
		SubtopicNames subtopic = service.addSubtopic(newSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.CREATED);
	}

	/**
	 * Handles all exceptions thrown within the SubTopicController, then creates a
	 * error object.
	 * @param ex
	 * @param request
	 * @return ResponseEntity<ExceptionObject> A error object that contains details
	 *         based off of the exception caught and a HttpStatus based off of the
	 *         exception thrown.
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionObject> subtopicException(Exception ex, WebRequest request) {
		ExceptionObject errorDetails = new ExceptionObject(ex.getMessage(), ex.toString(), "" + this.getClass());
		if (ex instanceof HttpMessageNotReadableException) {
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
