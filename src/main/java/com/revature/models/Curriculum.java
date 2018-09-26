package com.revature.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="CURRICULUM")
@SequenceGenerator(name="curriculum_seq_name", sequenceName="curriculum_seq", initialValue=3, allocationSize=1)
public class Curriculum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CURRICULUM_WEEK_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	private Integer curriculumId;
	
	@NotNull
	@Column(name="name")
	private String curriculumName;
	
	@NotNull
	@Column(name="version")
	private String curriculumVersion;
	
	@NotNull
	@Column(name="creator_id")
	private Integer creatorId;
	
	@NotNull
	@Column(name="date_created")
	private Date dateCreated;
	
	@NotNull
	@Column(name="number_of_weeks")
	private Integer numWeeks;
	
	@Column(name="APPROVED_BY_ID")
	private int approvedById;
	
	@Column(name="CURRICULUM_STATUS")
	private int curriculumStatus;
	
	@OneToMany(mappedBy = "curWeeks", fetch = FetchType.LAZY)
	private Set<CurriculumWeek> weeks = new HashSet<CurriculumWeek>();
	
	

	public Curriculum() {
		super();
	}



	public Curriculum(Integer curriculumId, String curriculumName, String curriculumVersion, Integer creatorId,
			Date dateCreated, Integer numWeeks, int approvedById, int curriculumStatus, Set<CurriculumWeek> weeks) {
		super();
		this.curriculumId = curriculumId;
		this.curriculumName = curriculumName;
		this.curriculumVersion = curriculumVersion;
		this.creatorId = creatorId;
		this.dateCreated = dateCreated;
		this.numWeeks = numWeeks;
		this.approvedById = approvedById;
		this.curriculumStatus = curriculumStatus;
		this.weeks = weeks;
	}



	public Integer getCurriculumId() {
		return curriculumId;
	}



	public void setCurriculumId(Integer curriculumId) {
		this.curriculumId = curriculumId;
	}



	public String getCurriculumName() {
		return curriculumName;
	}



	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}



	public String getCurriculumVersion() {
		return curriculumVersion;
	}



	public void setCurriculumVersion(String curriculumVersion) {
		this.curriculumVersion = curriculumVersion;
	}



	public Integer getCreatorId() {
		return creatorId;
	}



	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}



	public Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}



	public Integer getNumWeeks() {
		return numWeeks;
	}



	public void setNumWeeks(Integer numWeeks) {
		this.numWeeks = numWeeks;
	}



	public int getApprovedById() {
		return approvedById;
	}



	public void setApprovedById(int approvedById) {
		this.approvedById = approvedById;
	}



	public int getCurriculumStatus() {
		return curriculumStatus;
	}



	public void setCurriculumStatus(int curriculumStatus) {
		this.curriculumStatus = curriculumStatus;
	}



	public Set<CurriculumWeek> getWeeks() {
		return weeks;
	}



	public void setWeeks(Set<CurriculumWeek> weeks) {
		this.weeks = weeks;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approvedById;
		result = prime * result + ((creatorId == null) ? 0 : creatorId.hashCode());
		result = prime * result + ((curriculumId == null) ? 0 : curriculumId.hashCode());
		result = prime * result + ((curriculumName == null) ? 0 : curriculumName.hashCode());
		result = prime * result + curriculumStatus;
		result = prime * result + ((curriculumVersion == null) ? 0 : curriculumVersion.hashCode());
		result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result + ((numWeeks == null) ? 0 : numWeeks.hashCode());
		result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
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
		Curriculum other = (Curriculum) obj;
		if (approvedById != other.approvedById)
			return false;
		if (creatorId == null) {
			if (other.creatorId != null)
				return false;
		} else if (!creatorId.equals(other.creatorId))
			return false;
		if (curriculumId == null) {
			if (other.curriculumId != null)
				return false;
		} else if (!curriculumId.equals(other.curriculumId))
			return false;
		if (curriculumName == null) {
			if (other.curriculumName != null)
				return false;
		} else if (!curriculumName.equals(other.curriculumName))
			return false;
		if (curriculumStatus != other.curriculumStatus)
			return false;
		if (curriculumVersion == null) {
			if (other.curriculumVersion != null)
				return false;
		} else if (!curriculumVersion.equals(other.curriculumVersion))
			return false;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (numWeeks == null) {
			if (other.numWeeks != null)
				return false;
		} else if (!numWeeks.equals(other.numWeeks))
			return false;
		if (weeks == null) {
			if (other.weeks != null)
				return false;
		} else if (!weeks.equals(other.weeks))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Curriculum [curriculumId=" + curriculumId + ", curriculumName=" + curriculumName
				+ ", curriculumVersion=" + curriculumVersion + ", creatorId=" + creatorId + ", dateCreated="
				+ dateCreated + ", numWeeks=" + numWeeks + ", approvedById=" + approvedById + ", curriculumStatus="
				+ curriculumStatus + ", weeks=" + weeks + "]";
	}
	

	

}
