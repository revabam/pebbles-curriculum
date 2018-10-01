package com.revature.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.DaySubTopic;

@Repository
public interface SubtopicRepository extends CrudRepository<DaySubTopic, Integer> {

	List<DaySubTopic> findById(Integer id);
	
	Set<DaySubTopic> findAll();

}
