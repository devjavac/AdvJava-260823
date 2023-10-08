package com.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "add_dtls")
public class AddressDetails {
	@Id
	@SequenceGenerator(name = "add_dtls_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "add_dtls_seq", strategy = GenerationType.SEQUENCE)
	private int aid;
	private String city;
	private String pincode;
	private String state;
	@JoinColumn(name = "sid")
	@OneToOne(fetch = FetchType.LAZY)
	private StudentDetails studDetails;  // One Address To One StudentDetails
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StudentDetails getStudDetails() {
		return studDetails;
	}
	public void setStudDetails(StudentDetails studDetails) {
		this.studDetails = studDetails;
	}
}
