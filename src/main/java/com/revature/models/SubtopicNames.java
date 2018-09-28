package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SUBTOPIC_NAMES")
public class SubtopicNames implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6260965338214448594L;

	@Id
	@Column(name = "NAME_ID")
	private int nameId;

	@Column(name = "SUBTOPIC_NAME")
	@NotNull
	private String topicName;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subtopicNames")
	private Set<Subtopic> subtopic = new HashSet<Subtopic>();

	public SubtopicNames() {
		super();
	}

	public SubtopicNames(int nameId, String topicName, Set<Subtopic> subtopic) {
		super();
		this.nameId = nameId;
		this.topicName = topicName;
		this.subtopic = subtopic;
	}

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	@Override
	public String toString() {
		return "SubtopicNames [nameId=" + nameId + ", topicName=" + topicName + "]";
	}

}
