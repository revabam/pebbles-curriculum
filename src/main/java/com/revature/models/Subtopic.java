package com.revature.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="SUBTOPIC")
@SequenceGenerator(name="subtopic_seq_name", sequenceName="subtopic_seq", initialValue=12, allocationSize=1)
public class Subtopic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="subtopic_seq_name")
	private Integer id;
	
	@NotNull
	@Column(name="name", unique=true)
	private String name;
	
//	@ManyToOne
//	@JoinColumn(name="parent_topic_id", nullable=false, referencedColumnName="id")
	@NotNull
	@Column(name="parent_topic_id")
	private Integer parentTopicId;
	
	public Subtopic() {}

	public Subtopic(String name, Integer parent_topic_id) {
		super();
		this.name = name;
		this.parentTopicId = parent_topic_id;
	}

	public Subtopic(Integer id, String name, Integer parent_topic_id) {
		super();
		this.id = id;
		this.name = name;
		this.parentTopicId = parent_topic_id;
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

	public Integer getParent_topic_id() {
		return parentTopicId;
	}

	public void setParent_topic_id(Integer parent_topic_id) {
		this.parentTopicId = parent_topic_id;
	}

}
