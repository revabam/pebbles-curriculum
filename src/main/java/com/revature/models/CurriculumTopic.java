package com.revature.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="CURRICULUM_TOPICS")
@SequenceGenerator(name="curriculum_topics_seq_name", sequenceName="curriculum_topics_seq", initialValue=12, allocationSize=1)
public class CurriculumTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_topics_seq_name")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional= false, cascade =CascadeType.ALL)
	@JoinColumn(name="curriculum_id", nullable=false, referencedColumnName="id")
	@NotNull
	private Curriculum curriculumId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional= false, cascade =CascadeType.ALL)
	@JoinColumn(name="topic_id", nullable=false, referencedColumnName="id")
	@NotNull
	private Topic topicId;
	
	@NotNull
	@Column(name="week_number")
	private Integer numberOfWeeks;
	
	public CurriculumTopic() {}

	

	public CurriculumTopic(Curriculum curriculumId, Topic topicId, Integer numberOfWeeks) {
		super();
		this.curriculumId = curriculumId;
		this.topicId = topicId;
		this.numberOfWeeks = numberOfWeeks;
	}

	public CurriculumTopic(Integer id, Curriculum curriculumId, Topic topicId, Integer numberOfWeeks) {
		super();
		this.id = id;
		this.curriculumId = curriculumId;
		this.topicId = topicId;
		this.numberOfWeeks = numberOfWeeks;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Curriculum getCurriculumId() {
		return curriculumId;
	}



	public void setCurriculumId(Curriculum curriculumId) {
		this.curriculumId = curriculumId;
	}



	public Topic getTopicId() {
		return topicId;
	}



	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}



	public Integer getNumberOfWeeks() {
		return numberOfWeeks;
	}



	public void setNumberOfWeeks(Integer numberOfWeeks) {
		this.numberOfWeeks = numberOfWeeks;
	}


	
	

}
