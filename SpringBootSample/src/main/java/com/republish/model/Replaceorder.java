package com.republish.model;


import java.util.Date;

public class Replaceorder {
	private long orderId;
	private String ReplaceorderId;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	public Replaceorder() {}
	
	
	public Replaceorder(long orderId, String replaceorderId, Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.orderId = orderId;
		ReplaceorderId = replaceorderId;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
	}


	public long getOrderId() {
		return orderId;
	}


	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public String getReplaceorderId() {
		return ReplaceorderId;
	}


	public void setReplaceorderId(String replaceorderId) {
		ReplaceorderId = replaceorderId;
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
		return "Replaceorder [orderId=" + orderId + ", ReplaceorderId=" + ReplaceorderId + "]";
	}

}
