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

	@OneToMany(mappedBy = "subtopics", fetch = FetchType.EAGER)
	private Set<Subtopic> topics = new HashSet<Subtopic>();


	public Topic() {
	}

	public Topic(Integer topicId, String name, Set<Subtopic> topics) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.topics = topics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((topicId == null) ? 0 : topicId.hashCode());
		result = prime * result + ((topics == null) ? 0 : topics.hashCode());
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
		if (topics == null) {
			if (other.topics != null)
				return false;
		} else if (!topics.equals(other.topics))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", name=" + name + ", topics=" + topics + "]";
	}

}
