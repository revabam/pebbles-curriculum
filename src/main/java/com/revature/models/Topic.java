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
	private Integer id;

	@NotNull
	@Column(name = "name", unique = true)
	private String name;
	
	@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
	private Set<SubtopicNames> subTopics = new HashSet<SubtopicNames>();

	public Topic() {
	}

	public Topic(Integer topicId, String name, Set<SubtopicNames> daySubTopic) {
		super();
		this.id = topicId;
		this.name = name;
		this.subTopics = daySubTopic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer topicId) {
		this.id = topicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SubtopicNames> getSubTopic() {
		return subTopics;
	}

	public void setSubTopic(Set<SubtopicNames> daySubTopic) {
		this.subTopics = daySubTopic;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + id + ", name=" + name + ", daySubTopic=" + subTopics + "]";
	}

}
