package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Curriculum;
import com.revature.repositories.CurriculumRepository;

@Service
@Transactional
public class CurriculumService {
	
	@Autowired
	CurriculumRepository repo;

	public List<Curriculum> findAllUsers() {
		return repo.findAll();
	}

	public Curriculum findCurriculumById(Integer id) {
		return repo.findCurriculumById(id);
	}

	public Curriculum addCurriculum(Curriculum newCurr) {
		return repo.save(newCurr);
	}

	public Curriculum updateCurriculum(Curriculum updatedCurr) {
		Curriculum curr = repo.findCurriculumById(updatedCurr.getId());
		
		if(curr == null) {
			return curr;
		} else {
			return repo.save(updatedCurr);
		}
	}

}
