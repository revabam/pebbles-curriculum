package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Subtopic;

@Repository
public interface SubtopicRepository extends CrudRepository<Subtopic, Integer> {

	List<Subtopic> findById(Integer id);

}
