package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
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
@Table(name = "CURRICULUM_WEEK")
@SequenceGenerator(name="curriculum_seq_name", sequenceName="curriculum_seq", initialValue=3, allocationSize=1)
public class CurriculumWeek implements Serializable{

	@Id
	@Column(name = "CURRICULUM_WEEK_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	@NotNull
	private int curriculumWeekId;
	
	@Column(name = "WEEK_NUM")
	@NotNull
	private int weekNum;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ID", insertable= false, updatable=false)
	private Curriculum weeks;
	
	@OneToMany(mappedBy = "days", fetch = FetchType.EAGER)
	@NotNull
	private Set<CurriculumDay> curriculumDay = new HashSet<CurriculumDay>();
	

	public CurriculumWeek() {
		super();
	}


	public CurriculumWeek(int curriculumWeekId, int weekNum, Curriculum weeks, Set<CurriculumDay> curriculumDay) {
		super();
		this.curriculumWeekId = curriculumWeekId;
		this.weekNum = weekNum;
		this.weeks = weeks;
		this.curriculumDay = curriculumDay;
	}


	public int getCurriculumWeekId() {
		return curriculumWeekId;
	}


	public void setCurriculumWeekId(int curriculumWeekId) {
		this.curriculumWeekId = curriculumWeekId;
	}


	public int getWeekNum() {
		return weekNum;
	}


	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}


	public Set<CurriculumDay> getCurriculumDay() {
		return curriculumDay;
	}


	public void setCurriculumDay(Set<CurriculumDay> curriculumDay) {
		this.curriculumDay = curriculumDay;
	}


	@Override
	public String toString() {
		return "CurriculumWeek [curriculumWeekId=" + curriculumWeekId + ", weekNum=" + weekNum 
				+ ", curriculumDay=" + curriculumDay + "]";
	}


	

	

}
