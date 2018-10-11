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

/**
 * This maps the CurriculumWeek model to the curriculum_week table in H2 database
 * @author Rhys Yamasaki | Joshua Maciejewski | Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@Entity
@Table(name = "CURRICULUM_WEEK")
public class CurriculumWeek implements Serializable{

	@Id
	@SequenceGenerator(name="CURRICULUM_WEEK_SEQ", sequenceName="CURRICULUM_WEEK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CURRICULUM_WEEK_SEQ")
	@Column(name = "CURRICULUM_WEEK_ID")
	@NotNull
	private int id;
	
	@Column(name = "WEEK_NUM")
	@NotNull
	private int weekNum;
	
	@Column(name = "CURRICULUM_ID")
	private int curriculumId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CURRICULUM_ID", insertable= false, updatable=false)
	private Curriculum weeks;
	
	@OneToMany(mappedBy = "days", fetch = FetchType.EAGER)
	@NotNull
	private Set<CurriculumDay> curriculumDays = new HashSet<CurriculumDay>();
	
	public CurriculumWeek() {
		super();
	}

	public CurriculumWeek(int id, int weekNum, int curriculumId, Set<CurriculumDay> curriculumDay) {
		super();
		this.id = id;
		this.weekNum = weekNum;
		this.curriculumId = curriculumId;
		this.curriculumDays = curriculumDay;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getWeekNum() {
		return weekNum;
	}

	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}

	public Set<CurriculumDay> getCurriculumDays() {
		return curriculumDays;
	}

	public void setCurriculumDays(Set<CurriculumDay> curriculumDay) {
		this.curriculumDays = curriculumDay;
	}

	public int getCurriculumId() {
		return curriculumId;
	}

	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}

	@Override
	public String toString() {
		return "CurriculumWeek [id=" + id + ", weekNum=" + weekNum 
				+ ", curriculumDay=" + curriculumDays + "]";
	}

}
