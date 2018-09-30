package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.DaySubTopic;
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
	 * @param newSubtopic
	 *            Subtopic
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
	 * @param updatedSubtopic
	 *            Subtopic
	 * @return ResponseEntity<Subtopic> A subtopic object and a HTTP status code
	 * @author Christian DeFaria 1806-Jun18-USF-Java Wezley Singleton
	 */
	@PutMapping
	public ResponseEntity<DaySubTopic> updateSubtopic(@Valid @RequestBody DaySubTopic updatedSubtopic) {
		DaySubTopic subtopic = service.updateSubtopic(updatedSubtopic);
		return new ResponseEntity<>(subtopic, HttpStatus.OK);
	}

}
