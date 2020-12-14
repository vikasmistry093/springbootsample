package com.republish.model;

import java.util.Date;

public class Payment {

	private long paymentId;
	private String paymentType;
	private long cardNumber;
	private Date cardExipryDate;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	
	public Payment() {}
	
	
	public Payment(long paymentId, String paymentType, long cardNumber, Date cardExipryDate, Date createdTimeStamp,
			Date updatedTimeStamp) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.cardNumber = cardNumber;
		this.cardExipryDate = cardExipryDate;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
	}


	public long getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}


	public Date getCardExipryDate() {
		return cardExipryDate;
	}


	public void setCardExipryDate(Date cardExipryDate) {
		this.cardExipryDate = cardExipryDate;
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
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", cardNumber=" + cardNumber
				+ ", cardExipryDate=" + cardExipryDate + ", createdTimeStamp=" + createdTimeStamp
				+ ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
}
