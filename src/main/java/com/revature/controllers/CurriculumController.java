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
		List<Curriculum> allCurr = service.findAllUsers();
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

}
