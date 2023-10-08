package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	// You can connect with another table without creating Foreign Key 
	// In the mappedBy you must provide the reference variable name which is created for a foreign key column 
	@OneToMany(mappedBy = "studDetails", fetch = FetchType.EAGER)   // One Student To Many Education
	private List<EducationDetails> edus;

	@OneToOne(mappedBy = "studDetails", fetch = FetchType.EAGER) 
	private AddressDetails addDetails;
	
	public List<EducationDetails> getEdus() {
		return edus;
	}
	public void setEdus(List<EducationDetails> edus) {
		this.edus = edus;
	}
	
	public AddressDetails getAddDetails() {
		return addDetails;
	}
	public void setAddDetails(AddressDetails addDetails) {
		this.addDetails = addDetails;
	}
	
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
