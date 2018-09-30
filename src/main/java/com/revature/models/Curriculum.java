package com.revature.models;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="CURRICULUM")
@SequenceGenerator(name="curriculum_seq_name", sequenceName="curriculum_seq", initialValue=3, allocationSize=1)
public class Curriculum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="curriculum_seq_name")
	private Integer id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="version")
	private String version;
	
	@NotNull
	@Column(name="creator_id")
	private Integer creator_id;
	
	@NotNull
	@Column(name="date_created")
	private Date date_created;
	
	@NotNull
	@Column(name="number_of_weeks")
	private Integer number_of_weeks;
	
	public Curriculum() {}

	public Curriculum(String name, String version, Integer creator_id, Date date_created, Integer number_of_weeks) {
		super();
		this.name = name;
		this.version = version;
		this.creator_id = creator_id;
		this.date_created = date_created;
		this.number_of_weeks = number_of_weeks;
	}

	public Curriculum(Integer id, String name, String version, Integer creator_id, Date date_created,
			Integer number_of_weeks) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.creator_id = creator_id;
		this.date_created = date_created;
		this.number_of_weeks = number_of_weeks;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getCreator_id() {
		return creator_id;
	}

	public void setCreator_id(Integer creator_id) {
		this.creator_id = creator_id;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Integer getNumber_of_weeks() {
		return number_of_weeks;
	}

	public void setNumber_of_weeks(Integer number_of_weeks) {
		this.number_of_weeks = number_of_weeks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creator_id == null) ? 0 : creator_id.hashCode());
		result = prime * result + ((date_created == null) ? 0 : date_created.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number_of_weeks == null) ? 0 : number_of_weeks.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		Curriculum other = (Curriculum) obj;
		if (creator_id == null) {
			if (other.creator_id != null)
				return false;
		} else if (!creator_id.equals(other.creator_id))
			return false;
		if (date_created == null) {
			if (other.date_created != null)
				return false;
		} else if (!date_created.equals(other.date_created))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number_of_weeks == null) {
			if (other.number_of_weeks != null)
				return false;
		} else if (!number_of_weeks.equals(other.number_of_weeks))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curriculum [id=" + id + ", name=" + name + ", version=" + version + ", creator_id=" + creator_id
				+ ", date_created=" + date_created + ", number_of_weeks=" + number_of_weeks + "]";
	}
	
	

}
