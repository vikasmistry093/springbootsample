package com.republish.model;

import java.util.Date;

public class Seller {
	private long userId;
	private String firstName;
	private String lastName;
	private String productName;
	private long accountNumber;
	private String ifscCode;
	private String password;
	private String phoneNumber;
	private String emailId;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	public Seller(long userId, String firstName, String lastName, String productName, long accountNumber,
			String ifscCode, String password, String phoneNumber, String emailId, Date createdTimeStamp,
			Date updatedTimeStamp) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.productName = productName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
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
		return "Seller [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", productName="
				+ productName + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", createdTimeStamp=" + createdTimeStamp
				+ ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
}
