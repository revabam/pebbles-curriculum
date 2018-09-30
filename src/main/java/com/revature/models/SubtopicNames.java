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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "subTopicName")
    private Set<DaySubTopic> daySubTopic = new HashSet<>();
	

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "NAME_ID", insertable= false, updatable=false)
//    private DaySubTopic subtopicName;
	
	@Column(name="TOPIC_ID")
	private int topicId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "TOPIC_ID", insertable= false, updatable=false)
	private Topic topic;
    
	public SubtopicNames() {
		super();
	}

	public SubtopicNames(int nameId, String topicName, int topicId) {
		super();
		this.nameId = nameId;
		this.topicName = topicName;
		this.topicId = topicId;
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
	
	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	@Override
	public String toString() {
		return "SubtopicNames [nameId=" + nameId + ", topicName=" + topicName + ", topicId=" + topicId + ", topic="
				+ topic + "]";
	}


}
