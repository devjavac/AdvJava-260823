package com.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "task_details")
public class TaskDetails {
	//@SequenceGenerator(name = "task_details_seq", initialValue = 1, allocationSize = 1)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_details_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int tid;
	@Column(length = 50)
	private String title;
	@Column(length = 100)
	private String details;
	private LocalDate taskdate;
	@Column(length = 15)
	private String status;
	@JoinColumn(name = "uid")
	@ManyToOne
	private UserDetails userId;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDate getTaskdate() {
		return taskdate;
	}
	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserDetails getUserId() {
		return userId;
	}
	public void setUserId(UserDetails userId) {
		this.userId = userId;
	}
	
}












