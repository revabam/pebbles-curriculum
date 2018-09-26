package com.revature.models;

import java.io.Serializable;
import java.util.List;

public class CurriculumWeek implements Serializable{
	
	private int curriculumWeekId;
	
	private int curriculumId;
	
	private int weekNum;
	
	private List<CurriculumDay> days;

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
