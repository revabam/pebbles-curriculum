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
	
	@Column(name = "CURRICULUM_ID")
	@NotNull
	private int curriculumId;
	
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
		// TODO Auto-generated constructor stub
	}


	public CurriculumWeek(int curriculumWeekId, int curriculumId, int weekNum, Set<CurriculumDay> curWeeks,
			Set<CurriculumDay> days) {
		super();
		this.curriculumWeekId = curriculumWeekId;
		this.curriculumId = curriculumId;
		this.weekNum = weekNum;
//		this.curWeeks = curWeeks;
		this.days = days;
	}


	public int getCurriculumWeekId() {
		return curriculumWeekId;
	}


	public void setCurriculumWeekId(int curriculumWeekId) {
		this.curriculumWeekId = curriculumWeekId;
	}


	public int getCurriculumId() {
		return curriculumId;
	}


	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}


	public int getWeekNum() {
		return weekNum;
	}


	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}


//	public Set<CurriculumDay> getCurWeeks() {
//		return curWeeks;
//	}
//
//
//	public void setCurWeeks(Set<CurriculumDay> curWeeks) {
//		this.curWeeks = curWeeks;
//	}


	public Set<CurriculumDay> getDays() {
		return days;
	}


	public void setDays(Set<CurriculumDay> days) {
		this.days = days;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curWeeks == null) ? 0 : curWeeks.hashCode());
		result = prime * result + curriculumId;
		result = prime * result + curriculumWeekId;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + weekNum;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurriculumWeek other = (CurriculumWeek) obj;
		if (curWeeks == null) {
			if (other.curWeeks != null)
				return false;
		} else if (!curWeeks.equals(other.curWeeks))
			return false;
		if (curriculumId != other.curriculumId)
			return false;
		if (curriculumWeekId != other.curriculumWeekId)
			return false;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (weekNum != other.weekNum)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CurriculumWeek [curriculumWeekId=" + curriculumWeekId + ", curriculumId=" + curriculumId + ", weekNum="
				+ weekNum + ", curWeeks=" + curWeeks + ", days=" + days + "]";
	}


}
