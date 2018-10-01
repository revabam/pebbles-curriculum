package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.CurriculumWeek;
import com.revature.services.WeekService;

@CrossOrigin
@RestController
@RequestMapping("/curriculums/weeks")
public class CurriculumWeekController {
	
	@Autowired
	WeekService service;
	
	@GetMapping
	public ResponseEntity<List<CurriculumWeek>> findAllWeeks(){
		List<CurriculumWeek> values = service.findAllWeeks();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CurriculumWeek> addWeek(@RequestBody CurriculumWeek week){
		CurriculumWeek value = service.addWeek(week);
		return new ResponseEntity<>(value, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<CurriculumWeek> updateWeek(@RequestBody CurriculumWeek week){
		CurriculumWeek value = service.updateWeek(week);
		return new ResponseEntity<>(value, HttpStatus.ACCEPTED);
	}
	
}
