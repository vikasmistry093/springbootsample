package com.republish.model;

import java.util.Date;

public class Repair {
	private long userId;
	private String firstName;
	private String lastName;
	private String productName;
	private String problem;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	public Repair(long userId, String firstName, String lastName, String productName, String problem,
			Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.productName = productName;
		this.problem = problem;
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
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
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
		return "Repair [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", productName="
				+ productName + ", problem=" + problem + ", createdTimeStamp=" + createdTimeStamp
				+ ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
}
