package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	/**
	 * Finds all weeks within the database.
	 * 
	 * @return ResponseEntity<List<CurriculumWeek>>
	 * @author Beck Larson
	 */
	@GetMapping
	public ResponseEntity<List<CurriculumWeek>> findAllWeeks() {
		List<CurriculumWeek> values = service.findAllWeeks();
		return new ResponseEntity<>(values, HttpStatus.OK);
	}

	/**
	 * Finds a curriculum week by its ID from the database.
	 * 
	 * @return ResponseEntity<CurriculumWeek>
	 * @author Beck Larson
	 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<CurriculumWeek> findWeek(@PathVariable int id) {
		CurriculumWeek value = service.findById(id);
		return new ResponseEntity<>(value, HttpStatus.OK);
	}
	/**
	 * Finds a curriculum week by its ID and week num from the database.
	 * 
	 * @return ResponseEntity<CurriculumWeek>
	 * @author Beck Larson
	 */
	@GetMapping(value = "/{id}/{week}")
	public ResponseEntity<CurriculumWeek> findWeek(@PathVariable int id, int week) {
		CurriculumWeek value = service.findByIdAndWeekNum(id, week);
		return new ResponseEntity<>(value, HttpStatus.OK);
	}

	/**
	 * Creates a new week and saves it to the database.
	 * 
	 * @param CurriculumWeek
	 * @return ResponseEntity<CurriculumWeek>
	 * @author Beck Larson
	 */
	@PostMapping
	public ResponseEntity<CurriculumWeek> addWeek(@RequestBody CurriculumWeek week) {
		CurriculumWeek value = service.addWeek(week);
		return new ResponseEntity<>(value, HttpStatus.CREATED);
	}

	/**
	 * Updates a week that is already in the database.
	 * 
	 * @param CurriculumWeek
	 * @return ResponseEntity<CurriculumWeek>
	 * @author Beck Larson
	 */
	@PutMapping
	public ResponseEntity<CurriculumWeek> updateWeek(@RequestBody CurriculumWeek week) {
		CurriculumWeek value = service.updateWeek(week);
		return new ResponseEntity<>(value, HttpStatus.ACCEPTED);
	}

}
