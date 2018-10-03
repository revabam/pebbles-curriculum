package com.revature.controllers;

import java.util.List;

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

import com.revature.models.CurriculumDay;
import com.revature.models.ExceptionObject;
import com.revature.services.CurriculumDayService;

@CrossOrigin
@RestController
@RequestMapping("/curriculums/days")
public class CurriculumDayController {

	@Autowired
	CurriculumDayService curriculumDayService;
	
	/**
	 * Gets a list all curriculum days
	 * @return 
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@GetMapping
	public ResponseEntity<List<CurriculumDay>> findAllCurriculumDays() {
		List<CurriculumDay> allCurr = curriculumDayService.findAllCurriculumDay();
		return new ResponseEntity<>(allCurr, HttpStatus.OK);
	}
	
	/**
	 * Gets a curriculumDay by its id
	 * @param id
	 * @return a curriculum day object
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@GetMapping("/{id}")
	public ResponseEntity<CurriculumDay> findByCurriculumDayId(@PathVariable int id) {
		CurriculumDay currDay = curriculumDayService.findByCurriculumDayId(id);
		return new ResponseEntity<>(currDay, HttpStatus.OK);
	}
	
	/**
	 * Gets a curriculum day by passing in curriculumWeekId and dayNum
	 * @param curriculumWeekId
	 * @param dayNum
	 * @return a list of curriculum days
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@GetMapping("/{curriculumWeekId}/{dayNum}")
	public ResponseEntity<List<CurriculumDay>> findByCurriculumWeekIdAndDayNum(@PathVariable int curriculumWeekId, @PathVariable int dayNum) {
		List<CurriculumDay> curriculumDay = curriculumDayService.findByCurriculumWeekIdAndDayNum(curriculumWeekId, dayNum);
		return new ResponseEntity<>(curriculumDay, HttpStatus.OK);
	}
	
	/**
	 * Creates a curriculum day by passing in a curriculum day object
	 * @param day
	 * @return the created 
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@PostMapping
	public ResponseEntity<CurriculumDay> addCurriculumDay(@RequestBody CurriculumDay day) {
		CurriculumDay add = curriculumDayService.addDay(day);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}
	
	/**
	 * Updates a curriculum day by passing a curriculum day object
	 * @param day
	 * @return the updated object
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@PutMapping
	public ResponseEntity<CurriculumDay> updateCurriculumDay(@RequestBody CurriculumDay day) {
		CurriculumDay update = curriculumDayService.updateDay(day);
		return new ResponseEntity<>(update, HttpStatus.OK);
	}
	
	/**
	 * Deletes a Curriculumday from the database based on id
	 * @param id
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	@DeleteMapping("{id}")
	public void deleteCurriculumDay(@PathVariable int id) {
		curriculumDayService.delete(id);
	}
	
	/**
	 * Handles all exceptions thrown within the CurriculumDayController, then creates a error object. 
	 * @param Exception
	 * @param request
	 * @return ResponseEntity<ExceptionObject> A error object that contains details based off of the exception caught and a HttpStatus based off of the exception thrown. 
	 * @author Rhys Yamasaki | Spark-1806-Jun-USF | Steven Kelsey
	 */
	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<ExceptionObject> curriculumDayException(Exception ex, WebRequest request) {
		ExceptionObject errorDetails = new ExceptionObject(ex.getMessage(), ex.toString(), "" + this.getClass());
		if (ex instanceof HttpMessageNotReadableException) {
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	
}
