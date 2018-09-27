package com.revature.models;

import java.io.Serializable;

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
	@Column(name="subtopic_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subtopic_seq_name")
	private Integer id;
	
	@NotNull
	@Column(name="name", unique=true)
	private String name;
	
	@Column(name="PARENT_TOPIC_ID")
	private int parentTopicId = 0;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "subtopic_id", insertable= false, updatable=false)
	@NotNull
	private Topic dailyTopics;
	
	
	public Subtopic() {}


	public Subtopic(Integer id, String name, int parentTopicId) {
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


	public int getParentTopicId() {
		return parentTopicId;
	}


	public void setParentTopicId(int parentTopicId) {
		this.parentTopicId = parentTopicId;
	}


	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", name=" + name + ", parentTopicId=" + parentTopicId + "]";
	}

}
