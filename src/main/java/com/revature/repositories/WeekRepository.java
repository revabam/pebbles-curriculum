package com.revature.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.CurriculumWeek;

@Repository
public interface WeekRepository extends JpaRepository<CurriculumWeek, Serializable>{

	List<CurriculumWeek> findAll();

	CurriculumWeek findByCurriculumWeekIdAndWeekNum(int id, int week);
	
	@Modifying
	@Transactional
	@Query(value="delete from CurriculumWeek c where curriculumWeekId = ?1")
	void deleteByCurriculumWeekId(int id);

}
