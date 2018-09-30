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
	CurriculumRepository currRepo;

	public List<Curriculum> findAllCurriculums() {
		System.out.println("RETURN IS " + currRepo.findAll());
		return currRepo.findAll();
	}

	public Curriculum findCurriculumById(Integer id) {
		return currRepo.findById(id);
	}

	public Curriculum addCurriculum(Curriculum newCurr) {
		return currRepo.save(newCurr);
	}

	public Curriculum updateCurriculum(Curriculum updatedCurr) {
		Curriculum curr = currRepo.findById(updatedCurr.getId());

		if (curr == null) {
			return curr;
		} else {
			return currRepo.save(updatedCurr);
		}
	}
}
