package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.CurriculumDay;
import com.revature.repositories.CurriculumDayRepository;

@Service
public class CurriculumDayService {

	@Autowired
	CurriculumDayRepository curriculumDayRepo;

	/**
	 * Gets a list of all curriculum day
	 * @return a list of all CurriculumDay objects
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public List<CurriculumDay> findAllCurriculumDay() {
		return curriculumDayRepo.findAll();
	}

	/**
	 * Gets a curriculum day by its id
	 * @param id
	 * @return a CurriculumDay object
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public CurriculumDay findByCurriculumDayId(int id) {
		return curriculumDayRepo.findOne(id);
	}
	
	/**
	 * Gets a list of CurriculumDay by curriculumWeekId and dayNum
	 * @param id
	 * @param dayNum
	 * @return a list of CurriculumDay objects
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public List<CurriculumDay> findByCurriculumWeekIdAndDayNum(int id, int dayNum) {
		return curriculumDayRepo.findByWeekIdAndDayNum(id, dayNum);
	}

	/**
	 * creates a CurriculumDay and persists it in the database
	 * @param day
	 * @return the curriculumDay object
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public CurriculumDay addDay(CurriculumDay day) {
		return curriculumDayRepo.save(day);
	}

	/**
	 * Updates a Curriculumday and persists it in the database
	 * @param day
	 * @return the curriculumDay object
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public CurriculumDay updateDay(CurriculumDay day) {
		return curriculumDayRepo.save(day);
	}
	
	/**
	 * Deletes a Curriculumday from the database based on id
	 * @param id
	 * @author Rhys Yamasaki | Spark-1806-Jun-2018-USF | Steven Kelsey
	 */
	public void delete(int id) {
		curriculumDayRepo.delete(id);
	}
}
