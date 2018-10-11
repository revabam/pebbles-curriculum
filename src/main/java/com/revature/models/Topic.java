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

/**
 * This maps the Topic model to the topic table in H2 database
 * @author Rhys Yamasaki | Joshua Maciejewski | Beck Larson | Spark-1806-Jun-2018-USF | Steven Kelsey
 */
@Entity
@Component
@Table(name = "TOPIC")
@SequenceGenerator(name = "TOPIC_SEQ_NAME", sequenceName = "TOPIC_SEQ")
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TOPIC_SEQ_NAME")
	private Integer id;

	@NotNull
	@Column(name = "NAME", unique = true)
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
