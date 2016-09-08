package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person implements Comparable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastname;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + "]";
	}
	// Additional toString method which includes only last and first name.
	public String toStringSimplified() {
		return lastname + ", " + firstName;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		//System.out.println(this.toString());
		return this.toStringSimplified().compareTo(((Person) arg0).toStringSimplified());
	}

}
