package com.springboot.bankapp.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String city;
	
	@Column(nullable = false, unique = true)
	private String panNumber;
	
	
	@Column(length = 512)
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserInfo usserInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account account;
	
	
	public UserInfo getUsserInfo() {
		return usserInfo;
	}

	public void setUsserInfo(UserInfo usserInfo) {
		this.usserInfo = usserInfo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
