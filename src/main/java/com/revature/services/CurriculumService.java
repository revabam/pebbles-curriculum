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
	
	/**
	 * Find all curriculums that are currently in the database.
	 * 
	 * @return List<Curriculum> 
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	public List<Curriculum> findAllCurriculums() {
		return currRepo.findAll();
	}

	/**
	 *Finds a Curriculum by is id.
	 *
	 * @param integer id
	 * @return Curriculum 
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	public Curriculum findCurriculumById(Integer id) {
		return currRepo.findById(id);
	}

	/**
	 * Creates a new curriculum in the database.
	 * 
	 * @param Curriculum
	 * @return saved Curriculum
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	public Curriculum addCurriculum(Curriculum newCurr) {
		return currRepo.save(newCurr);
	}

	/**
	 * Updates a Curriculum in the Database
	 * 
	 * @param Curriculum
	 * @return updated Curriculum
	 * @author Beck Larson | Spark1806-USF-Java | Steven Kelsey
	 */
	public Curriculum updateCurriculum(Curriculum updatedCurr) {
		Curriculum curr = currRepo.findById(updatedCurr.getId());

		if (curr == null) {
			return curr;
		} else {
			return currRepo.save(updatedCurr);
		}
	}
}
