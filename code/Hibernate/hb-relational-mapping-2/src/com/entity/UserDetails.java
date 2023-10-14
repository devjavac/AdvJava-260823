package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserDetails {
	//@SequenceGenerator(name = "user_info_seq", initialValue = 1, allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_info_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int uid;
	@Column(length = 20)
	private String name;
	@Column(length = 30)
	private String email;
	@Column(length = 10)
	private String contact;
	@Column(length = 20)
	private String city;
	@OneToMany(mappedBy = "userId")
	private List<TaskDetails> tasks;
	
	public List<TaskDetails> getTasks() {
		return tasks;
	}
	public void setTasks(List<TaskDetails> tasks) {
		this.tasks = tasks;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

