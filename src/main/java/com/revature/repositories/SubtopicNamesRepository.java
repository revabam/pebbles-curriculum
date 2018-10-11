package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.SubtopicNames;

/**
 * Repository for Subtopic Names 
 * @author Beck Larson | Rhys Yamasaki | Spark1806-USF-Java | Steven Kelsey
 */
@Repository
public interface SubtopicNamesRepository extends JpaRepository<SubtopicNames, Integer> {

}
