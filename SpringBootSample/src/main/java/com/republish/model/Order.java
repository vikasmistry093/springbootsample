package com.republish.model;

import java.util.Date;
import java.util.List;

public class Order {
	
	private long orderId;
	private User userId;
	private List<Product> products;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	public Order() {}
	
	public Order(long orderId, User userId, List<Product> products, Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.products = products;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
	}

	public long getOrderId() {
		return orderId;
	}


	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public User getUserId() {
		return userId;
	}


	public void setUserId(User userId) {
		this.userId = userId;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
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
		return "Order [orderId=" + orderId + ", userId=" + userId + ", products=" + products + ", createdTimeStamp="
				+ createdTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
}
