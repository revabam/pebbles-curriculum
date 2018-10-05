package com.revature.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.CurriculumWeek;

/**
 * Repository for Topic
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface WeekRepository extends JpaRepository<CurriculumWeek, Serializable>{

	/**
	 * Finds all CurriculumWeek
	 * @return List<CurriculumWeek>
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	List<CurriculumWeek> findAll();

	/**
	 * Finds CurriculumWeek by id and week num
	 * @param id, week 
	 * @return CurriculumWeek
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	CurriculumWeek findByIdAndWeekNum(int id, int week);
	
	/**
	 * Deletes CurriculumWeek by id
	 * @param id
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	@Modifying
	@Transactional
	@Query(value="delete from CurriculumWeek c where curriculumWeekId = ?1")
	void deleteByCurriculumWeekId(int id);

}
