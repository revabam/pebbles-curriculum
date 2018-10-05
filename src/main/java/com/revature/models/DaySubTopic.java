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

/**
 * This maps the DaySubTopic model to the day_subtopic table in H2 database
 * @author Rhys Yamasaki | Joshua Maciejewski | Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@Entity
@Component
@Table(name = "DAY_SUBTOPIC")
public class DaySubTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DAY_SUBTOPIC_SEQ_NAME", sequenceName = "DAY_SUBTOPIC_SEQ_NAME", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAY_SUBTOPIC_SEQ_NAME")
	@Column(name = "subtopic_id")
	private Integer id;
	
	@Column(name="CURRICULUM_DAY_ID")
	private Integer dayId;
	
	@Column(name="INDEX")
	private Integer index;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID", insertable = false, updatable = false)
	private CurriculumDay dailySubtopics;
	
	@Column(name="SUBTOPIC_NAME_ID")
	private int subTopicId;

	public DaySubTopic() {
	}

	public DaySubTopic(Integer id, Integer dayId, Integer index, int subTopicNameId) {
		super();
		this.id = id;
		this.dayId = dayId;
		this.index = index;
		this.subTopicId = subTopicNameId;
	}

	public Integer getDayId() {
		return dayId;
	}

	public void setDayId(Integer curriculumDayId) {
		this.dayId = curriculumDayId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSubTopicId() {
		return subTopicId;
	}

	public void setSubTopicId(int subTopicNameId) {
		this.subTopicId = subTopicNameId;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "DaySubTopic [id=" + id + ", dayId=" + dayId + ", index=" + index + ", subTopicNameId=" + subTopicId
				+ "]";
	}
	
}
