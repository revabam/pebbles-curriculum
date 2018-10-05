package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.CurriculumDay;

/**
 * Repository for Curriculum Day 
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface CurriculumDayRepository extends JpaRepository<CurriculumDay, Integer> {
	
	/**
	 * Finds by week id and day number 
	 * @param id
	 * @param dayNum
	 * @return List<CurriculumDay>
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	public List<CurriculumDay> findByWeekIdAndDayNum(int id, int dayNum);

	}
