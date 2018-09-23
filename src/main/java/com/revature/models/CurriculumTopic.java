package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
//	@ManyToOne
//	@JoinColumn(name="curriculum_id", nullable=false, referencedColumnName="id")
	@NotNull
	@Column(name="curriculum_id")
	private Integer curriculumId;
	
//	@ManyToOne
//	@JoinColumn(name="topic_id", nullable=false, referencedColumnName="id")
	@NotNull
	@Column(name="topic_id")
	private Integer topicId;
	
//	@NotNull
	@Column(name="number_of_weeks")
	private Integer numberOfWeeks;
	
	public CurriculumTopic() {}

	

	public CurriculumTopic(Integer curriculumId, Integer topicId, Integer numberOfWeeks) {
		super();
		this.curriculumId = curriculumId;
		this.topicId = topicId;
		this.numberOfWeeks = numberOfWeeks;
	}

	public CurriculumTopic(Integer id, Integer curriculumId, Integer topicId, Integer numberOfWeeks) {
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



	public Integer getCurriculumId() {
		return curriculumId;
	}



	public void setCurriculumId(Integer curriculumId) {
		this.curriculumId = curriculumId;
	}



	public Integer getTopicId() {
		return topicId;
	}



	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}



	public Integer getNumberOfWeeks() {
		return numberOfWeeks;
	}



	public void setNumberOfWeeks(Integer numberOfWeeks) {
		this.numberOfWeeks = numberOfWeeks;
	}


	
	

}
