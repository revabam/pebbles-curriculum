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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * This maps the CurriculumDay model to the curriculum_day table in H2 database
 * @author Rhys Yamasaki | Joshua Maciejewski | Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@Entity
@Table(name = "CURRICULUM_DAY")
public class CurriculumDay implements Serializable{

	private static final long serialVersionUID = 5619871966502548105L;
	@Id
	@SequenceGenerator(name="CURRICULUM_DAY_SEQ", sequenceName="CURRICULUM_DAY_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CURRICULUM_DAY_SEQ")
	@Column(name = "CURRICULUM_DAY_ID")
	private int id;
	
	@Column(name = "DAY_NUM")
	private int dayNum;
	
	@Column(name = "CURRICULUM_WEEK_ID")
	private int weekId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_WEEK_ID", insertable= false, updatable=false)
	private CurriculumWeek days;
	
	@OneToMany(mappedBy = "dailySubtopics", fetch = FetchType.EAGER)
	private Set<DaySubTopic> daySubTopics = new HashSet<DaySubTopic>();

	public CurriculumDay() {
		super();
	}
	
	public CurriculumDay(int curriculumDayId, int dayNum, int weekId, Set<DaySubTopic> subTopic) {
		super();
		this.id = curriculumDayId;
		this.dayNum = dayNum;
		this.weekId = weekId;
		this.daySubTopics = subTopic;
	}

	public int getWeekId() {
		return weekId;
	}

	public void setWeekId(int weekId) {
		this.weekId = weekId;
	}

	public int getId() {
		return id;
	}

	public void setId(int curriculumDayId) {
		this.id = curriculumDayId;
	}

	public int getDayNum() {
		return dayNum;
	}

	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}

	public Set<DaySubTopic> getDaySubTopics() {
		return daySubTopics;
	}

	public void setDaySubTopics(Set<DaySubTopic> subTopic) {
		this.daySubTopics = subTopic;
	}

	@Override
	public String toString() {
		return "CurriculumDay [curriculumDayId=" + id + ", dayNum=" + dayNum
				+ ", subTopic=" + daySubTopics + "]";
	}
	
}
