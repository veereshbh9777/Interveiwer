package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ineterviewerapp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Candidate_name")
	private String candidateName;

	@Column(name = "Candidate_age")
	private String candidateAge;

	@Column(name = "Stream")
	private String stream;

	@Column(name = "College")
	private String college;

	public Employee() {

	}

	public Employee(String candidateName, String candidateAge, String stream, String college) {
		super();
		this.candidateName = candidateName;
		this.candidateAge = candidateAge;
		this.stream = stream;
		this.college = college;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateAge() {
		return candidateAge;
	}

	public void setCandidateAge(String candidateAge) {
		this.candidateAge = candidateAge;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
