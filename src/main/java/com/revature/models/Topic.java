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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "TOPIC")
@SequenceGenerator(name = "topic_seq_name", sequenceName = "topic_seq", initialValue = 5, allocationSize = 1)
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topic_seq_name")
	private Integer topicId;

	@NotNull
	@Column(name = "name", unique = true)
	private String name;
	
	@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
	private Set<SubtopicNames> daySubTopic = new HashSet<SubtopicNames>();

	public Topic() {
	}

	public Topic(Integer topicId, String name, Set<SubtopicNames> daySubTopic) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.daySubTopic = daySubTopic;
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

	public Set<SubtopicNames> getDaySubTopic() {
		return daySubTopic;
	}

	public void setDaySubTopic(Set<SubtopicNames> daySubTopic) {
		this.daySubTopic = daySubTopic;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", name=" + name + ", daySubTopic=" + daySubTopic + "]";
	}

}
