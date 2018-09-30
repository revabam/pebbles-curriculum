package com.revature.models;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DaySubtopic_SubtopicName")
@IdClass(DaySubtopicSubtopicName.class)
public class DaySubtopicSubtopicName implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6260965338214448594L;

	@Id
	@Column(name = "NAME_ID")
	private int subtopicNameId;
	
	
	@Id
	@Column(name = "SUBTOPIC_ID")
	private int daySubtopicId;


	public DaySubtopicSubtopicName() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DaySubtopicSubtopicName(int subtopicNameId, int daySubtopicId) {
		super();
		this.subtopicNameId = subtopicNameId;
		this.daySubtopicId = daySubtopicId;
	}


	public int getSubtopicNameId() {
		return subtopicNameId;
	}


	public void setSubtopicNameId(int subtopicNameId) {
		this.subtopicNameId = subtopicNameId;
	}


	public int getDaySubtopicId() {
		return daySubtopicId;
	}


	public void setDaySubtopicId(int daySubtopicId) {
		this.daySubtopicId = daySubtopicId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "DaySubtopicSubtopicName [subtopicNameId=" + subtopicNameId + ", daySubtopicId=" + daySubtopicId + "]";
	}
	
	
	
	
}