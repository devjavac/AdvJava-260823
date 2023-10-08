package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "edu_dtls")
public class EducationDetails {
	@Id
	@SequenceGenerator(name = "edu_dtls_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "edu_dtls_seq", strategy = GenerationType.SEQUENCE)
	private int eid;
	@Column(length = 10)
	private String title;
	private int passyear;
	private double percent;
	@JoinColumn(name = "sid")
	@ManyToOne	// Many Education To One Student
	private StudentDetails studDetails;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPassyear() {
		return passyear;
	}
	public void setPassyear(int passyear) {
		this.passyear = passyear;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public StudentDetails getStudDetails() {
		return studDetails;
	}
	public void setStudDetails(StudentDetails studDetails) {
		this.studDetails = studDetails;
	}
}
