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

	public List<CurriculumWeek> findAllWeeks(){
		return weekRepo.findAll();
	}
	
	public CurriculumWeek addWeek(CurriculumWeek newWeek) {
		return weekRepo.save(newWeek);
	}
	
	public CurriculumWeek updateWeek(CurriculumWeek week) {
		return weekRepo.save(week);
	}
	
}
