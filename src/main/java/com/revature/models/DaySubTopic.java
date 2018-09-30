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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Component
@Table(name = "DAY_SUBTOPIC")
public class DaySubTopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "subtopic_seq_name", sequenceName = "subtopic_seq_name", initialValue = 12, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subtopic_seq_name")
	@Column(name = "subtopic_id")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID", insertable = false, updatable = false)
	@NotNull
	private CurriculumDay dailySubtopics;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE

    })
    @JoinTable(name = "DaySubtopic_SubtopicName", joinColumns = {
            @JoinColumn(name = "SUBTOPIC_ID") }, inverseJoinColumns = {
                    @JoinColumn(name = "NAME_ID") })
	@JsonProperty(access = Access.READ_ONLY)
    private Set<SubtopicNames> subTopicName = new HashSet<>();
	
//    @OneToMany(mappedBy = "subtopicName", fetch = FetchType.LAZY)
//	private Set<SubtopicNames> subtopicName = new HashSet<SubtopicNames>();

	public DaySubTopic() {
	}
	
public DaySubTopic(Integer id, Set<SubtopicNames> subTopicName) {
	super();
	this.id = id;
	this.subTopicName = subTopicName;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Set<SubtopicNames> getSubTopicName() {
	return subTopicName;
}

public void setSubTopicName(Set<SubtopicNames> subTopicName) {
	this.subTopicName = subTopicName;
}

@Override
public String toString() {
	return "DaySubTopic [id=" + id + ", subTopicName=" + subTopicName + "]";
}


	

}
