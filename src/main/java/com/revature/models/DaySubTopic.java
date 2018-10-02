package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Component
@Table(name = "DAY_SUBTOPIC")
public class DaySubTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "day_subtopic_seq_name", sequenceName = "day_subtopic_seq_name", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "day_subtopic_seq_name")
	@Column(name = "subtopic_id")
	private Integer id;
	
	@Column(name="CURRICULUM_DAY_ID")
	private Integer curriculumDayId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID", insertable = false, updatable = false)
	private CurriculumDay dailySubtopics;
	
	@Column(name="SUBTOPIC_NAME_ID")
	private int subTopicNameId;

	public DaySubTopic() {
	}

	public DaySubTopic(Integer id, Integer curriculumDayId, int subTopicNameId) {
		super();
		this.id = id;
		this.curriculumDayId = curriculumDayId;
		this.subTopicNameId = subTopicNameId;
	}

	public Integer getCurriculumDayId() {
		return curriculumDayId;
	}

	public void setCurriculumDayId(Integer curriculumDayId) {
		this.curriculumDayId = curriculumDayId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSubTopicNameId() {
		return subTopicNameId;
	}

	public void setSubTopicNameId(int subTopicNameId) {
		this.subTopicNameId = subTopicNameId;
	}

	@Override
	public String toString() {
		return "DaySubTopic [id=" + id + ", curriculumDayId=" + curriculumDayId + ", subTopicNameId=" + subTopicNameId
				+ "]";
	}

	
}
