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
	@JoinColumn(name = "CURRICULUM_WEEK_ID", insertable= false, updatable=false)
	@NotNull
	private CurriculumWeek curWeeks;
	
	@OneToMany(mappedBy = "curriculumDayId", fetch = FetchType.EAGER)
	@NotNull
	private Set<CurriculumDay> days = new HashSet<CurriculumDay>();
	

	public CurriculumWeek() {
		super();
	}


	public CurriculumWeek(int curriculumWeekId, int weekNum, Set<CurriculumDay> days) {
		super();
		this.curriculumWeekId = curriculumWeekId;
		this.weekNum = weekNum;
		this.days = days;
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



	public Set<CurriculumDay> getDays() {
		return days;
	}


	public void setDays(Set<CurriculumDay> days) {
		this.days = days;
	}


	@Override
	public String toString() {
		return "CurriculumWeek [curriculumWeekId=" + curriculumWeekId + ", weekNum=" + weekNum + ", days=" + days + "]";
	}

	

}
