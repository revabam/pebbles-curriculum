package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.CurriculumWeek;
import com.revature.repositories.WeekRepository;

@Service
public class WeekService {
	
	@Autowired 
	WeekRepository weekRepo;

	/**
	 * Finds all weeks within the database.
	 * @return List<CurriculumWeek>
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public List<CurriculumWeek> findAllWeeks(){
		return weekRepo.findAll();
	}
	/**
	 * Creates a new week within the database.
	 * @param CurriculumWeek
	 * @return Saved CurriculumWeek
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public CurriculumWeek addWeek(CurriculumWeek newWeek) {
		return weekRepo.save(newWeek);
	}
	/**
	 * Updates a week that is already in the database.
	 * @param CurriculumWeek
	 * @return Saved CurriculumWeek
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public CurriculumWeek updateWeek(CurriculumWeek week) {
		return weekRepo.save(week);
	}
	/**
	 * Finds a week by it ID.
	 * @param int id
	 * @return CurriculumWeek
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public CurriculumWeek findById(int id) {
		return weekRepo.findOne(id);
	}
	/**
	 * Finds a week by it ID and week number.
	 * @param int id, int week
	 * @return CurriculumWeek
	 * @author Beck Larson | Spark 1806 June25 2018 | USF | Steven Kelsey
	 */
	public CurriculumWeek findByIdAndWeekNum(int id, int week) {
		return weekRepo.findByCurriculumWeekIdAndWeekNum(id, week);
	}
	
}
