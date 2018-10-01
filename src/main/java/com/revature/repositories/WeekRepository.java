package com.revature.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.CurriculumWeek;

@Repository
public interface WeekRepository extends JpaRepository<CurriculumWeek, Serializable>{

	List<CurriculumWeek> findAll();

	CurriculumWeek findByCurriculumWeekIdAndWeekNum(int id, int week);
}
