import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "expense")
public class ExpenseEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "stud_seq", initialValue = 1, allocationSize = 1) // Oracle
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exp_seq") // Oracle
	@Column(name = "eid")
	private int id;
	@Column(length = 100)
	private String title;
	@Column(length = 1000, name = "description")
	private String desc;
	@Column(name = "expdate")
	private LocalDate date;
	@Column(name = "amount")
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
