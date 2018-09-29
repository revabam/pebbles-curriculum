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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "SUBTOPIC")
public class Subtopic implements Serializable {

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SUBTOPIC_NAME_ID")
	private SubtopicNames subtopicNames = new SubtopicNames();

	public Subtopic() {
	}

	public Subtopic(Integer id, SubtopicNames subtopicNames) {
		super();
		this.id = id;
		this.subtopicNames = subtopicNames;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SubtopicNames getSubtopicNames() {
		return subtopicNames;
	}

	public void setSubtopicNames(SubtopicNames subtopicNames) {
		this.subtopicNames = subtopicNames;
	}

	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", subtopicNames=" + subtopicNames + "]";
	}

}
