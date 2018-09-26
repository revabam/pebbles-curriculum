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
@Table(name = "CURRICULUM_DAY")
public class CurriculumDay implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5619871966502548105L;
	@Id
	@Column(name = "CURRICULUM_DAY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	private int curriculumDayId;
	
	@Column(name = "CURRICULUM_WEEK_ID")
	private int curriculumWeekId;
	
	@Column(name = "DAY_NAME")
	private String dayName;
	
	@Column(name = "DAY_NUM")
	private int dayNum;
	
	@OneToMany(mappedBy = "ID", fetch = FetchType.EAGER)
	private List<Subtopic> SubTopics;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID")
	private Set<CurriculumWeek> allWeeks =  new HashSet<CurriculumWeek>();

	public CurriculumDay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurriculumDay(int curriculumDayId, int curriculumWeekId, String dayName, int dayNum,
			List<Subtopic> subTopics) {
		super();
		this.curriculumDayId = curriculumDayId;
		this.curriculumWeekId = curriculumWeekId;
		this.dayName = dayName;
		this.dayNum = dayNum;
		SubTopics = subTopics;
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

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public int getDayNum() {
		return dayNum;
	}

	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}

	public List<Subtopic> getSubTopics() {
		return SubTopics;
	}

	public void setSubTopics(List<Subtopic> subTopics) {
		SubTopics = subTopics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SubTopics == null) ? 0 : SubTopics.hashCode());
		result = prime * result + curriculumDayId;
		result = prime * result + curriculumWeekId;
		result = prime * result + ((dayName == null) ? 0 : dayName.hashCode());
		result = prime * result + dayNum;
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
		CurriculumDay other = (CurriculumDay) obj;
		if (SubTopics == null) {
			if (other.SubTopics != null)
				return false;
		} else if (!SubTopics.equals(other.SubTopics))
			return false;
		if (curriculumDayId != other.curriculumDayId)
			return false;
		if (curriculumWeekId != other.curriculumWeekId)
			return false;
		if (dayName == null) {
			if (other.dayName != null)
				return false;
		} else if (!dayName.equals(other.dayName))
			return false;
		if (dayNum != other.dayNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurriculumDay [curriculumDayId=" + curriculumDayId + ", curriculumWeekId=" + curriculumWeekId
				+ ", dayName=" + dayName + ", dayNum=" + dayNum + ", SubTopics=" + SubTopics + "]";
	}
	
	
	
	
}
