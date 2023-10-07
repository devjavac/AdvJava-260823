import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

// SQL : SELECT studnm FROM studinfo
// HQL : SELECT name FROM Student
@Entity
@Table(name = "studinfo")
public class Student {
	@Id
	@Column(name = "studid")
	@SequenceGenerator(name = "stud_seq", initialValue = 1, allocationSize = 1) // Oracle
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stud_seq") // Oracle
	//@GeneratedValue(strategy = GenerationType.IDENTITY) // Mysql Only
	private int id;
	@Column(name = "studnm", length = 50, nullable = false)
	private String name;
	@Column(length = 10, nullable = false, unique = true)
	private String contact;
	private LocalDate dob;
	private char gender;
	@Column(columnDefinition = "number")
	private boolean status;
	@CreationTimestamp
	private LocalDateTime createdOn;
	@UpdateTimestamp
	private LocalDateTime updatedOn;
	@Transient
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}




