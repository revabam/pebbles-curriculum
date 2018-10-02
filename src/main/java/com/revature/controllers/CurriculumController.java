package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.revature.models.Curriculum;
import com.revature.models.ExceptionObject;
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
