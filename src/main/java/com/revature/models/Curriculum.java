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
	private Integer id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="version")
	private String vrsion;
	
	@NotNull
	@Column(name="creator_id")
	private Integer creatorId;
	
	@Column(name="APPROVED_BY_ID")
	private int approvedById;
	
	@Column(name="CURRICULUM_STATUS_ID")
	private int status;
	
	@NotNull
	@Column(name="date_created")
	private Date dateCreated;
	
	@NotNull
	@Column(name="number_of_weeks")
	private Integer numOfWeeks;
	
	@OneToMany(mappedBy = "curWeeks", fetch = FetchType.LAZY)
	private Set<CurriculumWeek> weeks = new HashSet<CurriculumWeek>();

	public Curriculum() {}

	public Curriculum(Integer id, String name, String vrsion, Integer creatorId, int approvedById, int status,
			Date dateCreated, Integer numOfWeeks, Set<CurriculumWeek> weeks) {
		super();
		this.id = id;
		this.name = name;
		this.vrsion = vrsion;
		this.creatorId = creatorId;
		this.approvedById = approvedById;
		this.status = status;
		this.dateCreated = dateCreated;
		this.numOfWeeks = numOfWeeks;
		this.weeks = weeks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVrsion() {
		return vrsion;
	}

	public void setVrsion(String vrsion) {
		this.vrsion = vrsion;
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public int getApprovedById() {
		return approvedById;
	}

	public void setApprovedById(int approvedById) {
		this.approvedById = approvedById;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getNumOfWeeks() {
		return numOfWeeks;
	}

	public void setNumOfWeeks(Integer numOfWeeks) {
		this.numOfWeeks = numOfWeeks;
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
		result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numOfWeeks == null) ? 0 : numOfWeeks.hashCode());
		result = prime * result + status;
		result = prime * result + ((vrsion == null) ? 0 : vrsion.hashCode());
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
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfWeeks == null) {
			if (other.numOfWeeks != null)
				return false;
		} else if (!numOfWeeks.equals(other.numOfWeeks))
			return false;
		if (status != other.status)
			return false;
		if (vrsion == null) {
			if (other.vrsion != null)
				return false;
		} else if (!vrsion.equals(other.vrsion))
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
		return "Curriculum [id=" + id + ", name=" + name + ", vrsion=" + vrsion + ", creatorId=" + creatorId
				+ ", approvedById=" + approvedById + ", status=" + status + ", dateCreated=" + dateCreated
				+ ", numOfWeeks=" + numOfWeeks + ", weeks=" + weeks + "]";
	}

	
	
}
