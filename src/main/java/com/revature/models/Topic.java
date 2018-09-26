package com.revature.models;

import java.io.Serializable;
import java.util.HashSet;
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
@Table(name="TOPIC")
@SequenceGenerator(name="topic_seq_name", sequenceName="topic_seq", initialValue=5, allocationSize=1)
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TOPIC_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="topic_seq_name")
	private Integer topicId;
	
	@NotNull
	@Column(name="name", unique=true)
	private String name;
	
	@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
	private Set<Subtopic> ct = new HashSet<Subtopic>();
	
	public Topic() {}



public Topic(Integer topicId, String name, Set<Subtopic> ct) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.ct = ct;
	}

public Integer getTopicId() {
	return topicId;
}

public void setTopicId(Integer topicId) {
	this.topicId = topicId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Subtopic> getCt() {
	return ct;
}

public void setCt(Set<Subtopic> ct) {
	this.ct = ct;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ct == null) ? 0 : ct.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((topicId == null) ? 0 : topicId.hashCode());
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
	Topic other = (Topic) obj;
	if (ct == null) {
		if (other.ct != null)
			return false;
	} else if (!ct.equals(other.ct))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (topicId == null) {
		if (other.topicId != null)
			return false;
	} else if (!topicId.equals(other.topicId))
		return false;
	return true;
}

@Override
public String toString() {
	return "Topic [topicId=" + topicId + ", name=" + name + ", ct=" + ct + "]";
}


	

}
