package com.republish.model;

import java.util.Date;

public class Category {
	
	private long categoryId;
	private String categoryName;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	private String status;
	
	public Category() {}
	
	public Category(long categoryId, String categoryName, Date createdTimeStamp, Date updatedTimeStamp, String status) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
		this.status = status;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
