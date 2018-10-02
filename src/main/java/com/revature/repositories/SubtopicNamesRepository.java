package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.SubtopicNames;

@Repository
public interface SubtopicNamesRepository extends JpaRepository<SubtopicNames, Integer> {

	
}
