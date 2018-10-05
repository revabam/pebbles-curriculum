package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Curriculum;

/**
 * Repository for Curriculum
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {

	/**
	 * Finds Curriculum by id
	 * @param id
	 * @return Curriculum 
	 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
	 */
	Curriculum findById(Integer id);

}
