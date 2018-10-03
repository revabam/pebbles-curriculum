package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.CurriculumDay;

@Repository
public interface CurriculumDayRepository extends JpaRepository<CurriculumDay, Integer> {
	
	public List<CurriculumDay> findByWeekIdAndDayNum(int id, int dayNum);

	}
