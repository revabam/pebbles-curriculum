package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CURRICULUM_STATUS")
public class CurriculumStatus implements Serializable{


	private static final long serialVersionUID = 559431756919841462L;
	
	@Id
	@Column(name="STATUS_ID")
	private int statusId;
	
	@Column(name="STATUS")
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CURRICULUM_STATUS_ID", insertable= false, updatable=false)
	@NotNull
	private CurriculumStatus curriculumStatus;

	public CurriculumStatus() {
		super();
	}

	public CurriculumStatus(int statusId, String status) {
		super();
		this.statusId = statusId;
		this.status = status;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curriculumStatus == null) ? 0 : curriculumStatus.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + statusId;
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
		CurriculumStatus other = (CurriculumStatus) obj;
		if (curriculumStatus == null) {
			if (other.curriculumStatus != null)
				return false;
		} else if (!curriculumStatus.equals(other.curriculumStatus))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (statusId != other.statusId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurriculumStatus [statusId=" + statusId + ", status=" + status + ", curriculumStatus="
				+ curriculumStatus + "]";
	}
	
}
