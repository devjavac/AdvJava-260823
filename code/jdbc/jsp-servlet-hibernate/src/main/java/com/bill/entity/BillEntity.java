package com.bill.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "elecbill")
public class BillEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int billid;
	private String username;
	private String city;
	private double unitconsume;
	private double amount;
	private double payamt;
	@CreationTimestamp
	private LocalDate billdate;
	private LocalDate duedate;
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getUnitconsume() {
		return unitconsume;
	}
	public void setUnitconsume(double unitconsume) {
		this.unitconsume = unitconsume;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPayamt() {
		return payamt;
	}
	public void setPayamt(double payamt) {
		this.payamt = payamt;
	}
	public LocalDate getBilldate() {
		return billdate;
	}
	public void setBilldate(LocalDate billdate) {
		this.billdate = billdate;
	}
	public LocalDate getDuedate() {
		return duedate;
	}
	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}
	
}
