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

@Entity
@Table(name = "CURRICULUM_DAY")
@SequenceGenerator(name="curriculum_seq_name", sequenceName="curriculum_seq", initialValue=3, allocationSize=1)
public class CurriculumDay implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5619871966502548105L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	@NotNull
	@Column(name = "CURRICULUM_DAY_ID")
	private int curriculumDayId;
	
	@Column(name = "CURRICULUM_WEEK_ID")
	@NotNull
	private int curriculumWeekId;
	
	@Column(name = "DAY_NUM")
	@NotNull
	private int dayNum;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subtopic_id", insertable= false, updatable=false)
	@NotNull
	private CurriculumWeek allWeeks;
	
	@OneToMany(mappedBy = "dailyTopics", fetch = FetchType.EAGER)
	private Set<Subtopic> subTopics = new HashSet<Subtopic>();

	public CurriculumDay() {
		super();
	}

	public CurriculumDay(int curriculumDayId, int curriculumWeekId, int dayNum, Set<Subtopic> subTopics) {
		super();
		this.curriculumDayId = curriculumDayId;
		this.curriculumWeekId = curriculumWeekId;
		this.dayNum = dayNum;
		this.subTopics = subTopics;
	}

	public int getCurriculumDayId() {
		return curriculumDayId;
	}

	public void setCurriculumDayId(int curriculumDayId) {
		this.curriculumDayId = curriculumDayId;
	}

	public int getCurriculumWeekId() {
		return curriculumWeekId;
	}

	public void setCurriculumWeekId(int curriculumWeekId) {
		this.curriculumWeekId = curriculumWeekId;
	}

	public int getDayNum() {
		return dayNum;
	}

	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}

	public Set<Subtopic> getSubTopics() {
		return subTopics;
	}

	public void setSubTopics(Set<Subtopic> subTopics) {
		this.subTopics = subTopics;
	}


	@Override
	public String toString() {
		return "CurriculumDay [curriculumDayId=" + curriculumDayId + ", curriculumWeekId=" + curriculumWeekId
				+ ", dayNum=" + dayNum + ", subTopics=" + subTopics + "]";
	}

	
}
