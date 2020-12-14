package com.republish.model;

import java.util.Date;

public class Status {
	private long orderId;
	private User userId;
	private int stock;
	private Date packedTimeStamp;
	private Date shippingTimeStamp;
	private Date dileveryTimeStamp;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	public Status() {}
	
	
	public Status(long orderId, User userId, int stock, Date packedTimeStamp, Date shippingTimeStamp,
			Date dileveryTimeStamp, Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.stock = stock;
		this.packedTimeStamp = packedTimeStamp;
		this.shippingTimeStamp = shippingTimeStamp;
		this.dileveryTimeStamp = dileveryTimeStamp;
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


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Date getPackedTimeStamp() {
		return packedTimeStamp;
	}


	public void setPackedTimeStamp(Date packedTimeStamp) {
		this.packedTimeStamp = packedTimeStamp;
	}


	public Date getShippingTimeStamp() {
		return shippingTimeStamp;
	}


	public void setShippingTimeStamp(Date shippingTimeStamp) {
		this.shippingTimeStamp = shippingTimeStamp;
	}


	public Date getDileveryTimeStamp() {
		return dileveryTimeStamp;
	}


	public void setDileveryTimeStamp(Date dileveryTimeStamp) {
		this.dileveryTimeStamp = dileveryTimeStamp;
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
		return "Status [orderId=" + orderId + ", userId=" + userId + ", stock=" + stock + ", packedTimeStamp="
				+ packedTimeStamp + ", shippingTimeStamp=" + shippingTimeStamp + ", dileveryTimeStamp="
				+ dileveryTimeStamp + ", createdTimeStamp=" + createdTimeStamp + ", updatedTimeStamp="
				+ updatedTimeStamp + "]";
	}
	
}
