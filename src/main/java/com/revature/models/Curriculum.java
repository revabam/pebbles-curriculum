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

/**
 * This maps the Curriculum model to the Curriculum table in H2 database
 * @author Rhys Yamasaki | Joshua Maciejewski | Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@Entity
@Component
@Table(name="curriculum")
@SequenceGenerator(name="curriculum_seq_name", sequenceName="curriculum_seq", initialValue=3, allocationSize=1)
public class Curriculum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	private Integer id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="version")
	private Integer version;
	
	@NotNull
	@Column(name="creator_id")
	private String creatorId;
	
	@Column(name="approved_by_id")
	private String approvedById;
	
	@Column(name="status")
	private int status;
	
	@NotNull
	@Column(name="date_created")
	private Date dateCreated;
	
	@NotNull
	@Column(name="number_of_weeks")
	private Integer numberOfWeeks;
	
	@OneToMany(mappedBy = "weeks", fetch = FetchType.LAZY)
	private Set<CurriculumWeek> curriculumWeeks = new HashSet<CurriculumWeek>();

	public Curriculum() {
		super();
	}

	public Curriculum(Integer id, String name, Integer version, String creatorId, String approvedById, int status,
			Date dateCreated, Integer numberOfWeeks, Set<CurriculumWeek> curriculumWeek) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.creatorId = creatorId;
		this.approvedById = approvedById;
		this.status = status;
		this.dateCreated = dateCreated;
		this.numberOfWeeks = numberOfWeeks;
		this.curriculumWeeks = curriculumWeek;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getApprovedById() {
		return approvedById;
	}

	public void setApprovedById(String approvedById) {
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

	public Integer getNumberOfWeeks() {
		return numberOfWeeks;
	}

	public void setNumberOfWeeks(Integer numberOfWeeks) {
		this.numberOfWeeks = numberOfWeeks;
	}

	public Set<CurriculumWeek> getCurriculumWeeks() {
		return curriculumWeeks;
	}

	public void setCurriculumWeeks(Set<CurriculumWeek> curriculumWeek) {
		this.curriculumWeeks = curriculumWeek;
	}

	@Override
	public String toString() {
		return "Curriculum [id=" + id + ", name=" + name + ", version=" + version + ", creatorId=" + creatorId
				+ ", approvedById=" + approvedById + ", status=" + status + ", dateCreated=" + dateCreated
				+ ", numberOfWeeks=" + numberOfWeeks + ", curriculumWeek=" + curriculumWeeks + "]";
	}
	
}
