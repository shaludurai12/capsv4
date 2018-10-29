package com.caps.dev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_details")
public class Person {
	@Id @Column(name="person_id")
	private int personId;
	@Column(name="person_name")
	private String personName;
	
	@Column(name="Person_age")
	private int personAge;
	
	@Column(name="Person_email")
	private String personEmail;
	
	@Column(name="person_address")
	private String personAddress;

	
	

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personEmail=" + personEmail + ", personAddress=" + personAddress + "]";
	}
	
	
	
	}

