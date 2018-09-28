package com.revature.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="SUBTOPIC")
public class Subtopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="subtopic_seq_name", sequenceName="subtopic_seq_name", initialValue=12, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subtopic_seq_name")
	@Column(name="subtopic_id")
	private Integer id;
	
	@NotNull
	@Column(name="name_id", unique=true)
	private int nameId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRICULUM_DAY_ID", insertable= false, updatable=false)
	@NotNull
	private CurriculumDay dailySubtopics;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID", insertable= false, updatable=false)
	@NotNull
	private Topic subtopics;
	
	
	public Subtopic() {}


	public Subtopic(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subtopic [id=" + id + ", name=" + name + "]";
	}
}
