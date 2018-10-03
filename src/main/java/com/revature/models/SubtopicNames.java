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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "SUBTOPIC_NAMES")
public class SubtopicNames implements Serializable {

	private static final long serialVersionUID = -6260965338214448594L;

	@Id
	@SequenceGenerator(name = "subtopic_seq_name", sequenceName = "subtopic_seq_name", initialValue = 12, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subtopic_seq_name")
	@Column(name = "SUBTOPIC_NAME_ID")
	private int id;

	@Column(name = "SUBTOPIC_NAME")
	@NotNull
	private String name;

	@Column(name="TOPIC_ID")
	private int parentTopicId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "TOPIC_ID", insertable= false, updatable=false)
	private Topic topic;
    
	public SubtopicNames() {
		super();
	}

	public SubtopicNames(int id, String name, int parentTopicId) {
		super();
		this.id = id;
		this.name = name;
		this.parentTopicId = parentTopicId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "SubtopicNames [id=" + id + ", name=" + name + ", parentTopicId=" + parentTopicId + "]";
	}

}
