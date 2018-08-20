package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@ManyToOne
	@JoinColumn(name="curriculum_id", nullable=false, referencedColumnName="id")
	private Integer curriculum_id;
	
	@ManyToOne
	@JoinColumn(name="topic_id", nullable=false, referencedColumnName="id")
	private Integer topic_id;
	
	@NotNull
	@Column(name="number_of_weeks")
	private Integer number_of_weeks;
	
	public CurriculumTopic() {}

	public CurriculumTopic(Integer curriculum_id, Integer topic_id, Integer number_of_weeks) {
		super();
		this.curriculum_id = curriculum_id;
		this.topic_id = topic_id;
		this.number_of_weeks = number_of_weeks;
	}

	public CurriculumTopic(Integer id, Integer curriculum_id, Integer topic_id, Integer number_of_weeks) {
		super();
		this.id = id;
		this.curriculum_id = curriculum_id;
		this.topic_id = topic_id;
		this.number_of_weeks = number_of_weeks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCurriculum_id() {
		return curriculum_id;
	}

	public void setCurriculum_id(Integer curriculum_id) {
		this.curriculum_id = curriculum_id;
	}

	public Integer getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}

	public Integer getNumber_of_weeks() {
		return number_of_weeks;
	}

	public void setNumber_of_weeks(Integer number_of_weeks) {
		this.number_of_weeks = number_of_weeks;
	}
	
	

}
