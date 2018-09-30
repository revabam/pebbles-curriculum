package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Component
@Table(name = "DAY_SUBTOPIC")
public class DaySubTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "subtopic_seq_name", sequenceName = "subtopic_seq_name", initialValue = 12, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subtopic_seq_name")
	@Column(name = "subtopic_id")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID", insertable = false, updatable = false)
	@NotNull
	private CurriculumDay dailySubtopics;
	
	@Column(name="SUBTOPIC_NAME")
	private String subTopicName;
	
	@Column(name="PARENT_TOPIC_ID")
	private int parentTopicId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_TOPIC_ID", insertable = false, updatable = false)
	@NotNull
	private Topic topic;

	public DaySubTopic() {
	}

	public DaySubTopic(Integer id, String subTopicName, int parentTopicId) {
		super();
		this.id = id;
		this.subTopicName = subTopicName;
		this.parentTopicId = parentTopicId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubTopicName() {
		return subTopicName;
	}

	public void setSubTopicName(String subTopicName) {
		this.subTopicName = subTopicName;
	}

	public int getParentTopicId() {
		return parentTopicId;
	}

	public void setParentTopicId(int parentTopicId) {
		this.parentTopicId = parentTopicId;
	}

	@Override
	public String toString() {
		return "DaySubTopic [id=" + id + ", subTopicName=" + subTopicName + ", parentTopicId=" + parentTopicId + "]";
	}
	
}
