package org.spring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.spring.config.Gender;

@Entity
public class Employees {

	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_no", unique = true, nullable = false)
	private Integer emp_no;

	@CreationTimestamp
	private Date birth_date;

	private String first_name;

	private String last_name;

	// @Column(columnDefinition = "ENUM('r', 'w', 'i')")
	// @org.hibernate.annotations.ColumnDefault("'i'")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@CreationTimestamp
	private Date hire_date;

	public Integer getEmp_no() {
		return emp_no;
	}

	public void Emp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLastname(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setgGnder(Gender gender) {
		this.gender = gender;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

}
