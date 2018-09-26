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
import javax.persistence.Table;

@Entity
@Table(name = "CURRICULUM_WEEK")
public class CurriculumWeek implements Serializable{

	@Id
	@Column(name = "CURRICULUM_WEEK_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	private int curriculumWeekId;
	
	@Column(name = "CURRICULUM_ID")
	private int curriculumId;
	
	@Column(name = "WEEK_NUM")
	private int weekNum;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_WEEK_ID")
	private Set<CurriculumDay> curWeeks;
	
	@OneToMany(mappedBy = "curriculumDayId", fetch = FetchType.EAGER)
	private Set<CurriculumDay> days = new HashSet<CurriculumDay>();
	

	public CurriculumWeek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurriculumWeek(int curriculumWeekId, int curriculumId, int weekNum, List<CurriculumDay> days) {
		super();
		this.curriculumWeekId = curriculumWeekId;
		this.curriculumId = curriculumId;
		this.weekNum = weekNum;
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
	
	public List<CurriculumDay> getDays() {
		return days;
	}
	
	public void setDays(List<CurriculumDay> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
				+ weekNum + ", days=" + days + "]";
	}
	
	
	
}
