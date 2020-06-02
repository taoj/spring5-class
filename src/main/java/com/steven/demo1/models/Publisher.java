package com.steven.demo1.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Publisher {

	private String name;
	private String addressLine1;
	private String city;
	private String state;
	private String zip;
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@OneToMany
	@JoinColumn(name = "publisher_id")
	private Set<Book> books = new HashSet();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Publisher() {
		
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
