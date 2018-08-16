package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Curriculum;

public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {

	Curriculum findCurriculumById(Integer id);

}
