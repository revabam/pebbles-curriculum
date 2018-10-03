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
	 * 
	 * @return List<CurriculumDay>
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public List<CurriculumDay> findAllCurriculumDay() {
		return curriculumDayRepo.findAll();
	}

	/**
	 * Gets a curriculum day by its id
	 * 
	 * @param id
	 * @return CurriculumDay 
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public CurriculumDay findByCurriculumDayId(int id) {
		return curriculumDayRepo.findOne(id);
	}
	
	/**
	 * Gets a list of CurriculumDay by curriculumWeekId and dayNum
	 * 
	 * @param id
	 * @param dayNum
	 * @return List<CurriculumDay>
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public List<CurriculumDay> findByCurriculumWeekIdAndDayNum(int id, int dayNum) {
		return curriculumDayRepo.findByWeekIdAndDayNum(id, dayNum);
	}

	/**
	 * creates a CurriculumDay and persists it in the database
	 * 
	 * @param day
	 * @return CurriculumDay
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public CurriculumDay addDay(CurriculumDay day) {
		return curriculumDayRepo.save(day);
	}

	/**
	 * Updates a CurriculumDay and persists it in the database
	 * 
	 * @param day
	 * @return CurriculumDay
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public CurriculumDay updateDay(CurriculumDay day) {
		return curriculumDayRepo.save(day);
	}
	
	/**
	 * Deletes a CurriculumDay from the database based on id
	 * 
	 * @param id
	 * @author Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public void delete(int id) {
		curriculumDayRepo.delete(id);
	}
}
