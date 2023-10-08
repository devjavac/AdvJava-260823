package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "stud_dtls")
public class StudentDetails {
	@Id
	@SequenceGenerator(name = "stud_dtls_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "stud_dtls_seq", strategy = GenerationType.SEQUENCE)
	private int sid;
	private String name;
	private String email;
	private String contact;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
