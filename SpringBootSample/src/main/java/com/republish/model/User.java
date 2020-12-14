package com.republish.model;

import java.util.Date;

public class User {
	
	private long userId;
	private String firstName;
	private String lastName;
	private String shippingAddress;
	private String billingAddress;
	private String password;
	private String phoneNumber;
	private String emailId;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	public User() {}
	
	
	public User(long userId, String firstName, String lastName, String shippingAddress, String billingAddress,
			String password, String phoneNumber, String emailId, Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
		
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getShippingAddress() {
		return shippingAddress;
	}


	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


	public String getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}


	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}


	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}


	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", shippingAddress="
				+ shippingAddress + ", billingAddress=" + billingAddress + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + ", createdTimeStamp=" + createdTimeStamp
				+ ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
	
	
	
	
	
	
}
