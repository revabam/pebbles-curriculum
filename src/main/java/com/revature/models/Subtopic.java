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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="SUBTOPIC")
@SequenceGenerator(name="subtopic_seq_name", sequenceName="subtopic_seq", initialValue=12, allocationSize=1)
public class Subtopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subtopic_seq_name")
	private Integer id;
	
	@NotNull
	@Column(name="name", unique=true)
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="id", nullable=false)
	@NotNull
	@Column(name="parent_topic_id")
	private Integer parentTopicId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="CURRICULUM_DAY_ID")
	private Set<CurriculumDay> curDays = new HashSet<CurriculumDay>();
	
	public Subtopic() {}

	public Subtopic(String name, Integer parentTopicId) {
		super();
		this.name = name;
		this.parentTopicId = parentTopicId;
	}

	public Subtopic(Integer id, String name, Integer parentTopicId) {
		super();
		this.id = id;
		this.name = name;
		this.parentTopicId = parentTopicId;
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

	public Integer getParentTopicId() {
		return parentTopicId;
	}

	public void setParentTopicId(Integer parentTopicId) {
		this.parentTopicId = parentTopicId;
	}



}
