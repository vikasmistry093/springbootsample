package com.republish.model;

public class Product {
	
	private long productId;
	private String productName;
	private String rating;
	private String description;
	private double price;
	private int stock;
	private int discount;
	private String status;
	private Category category;
	
	public Product() {}
	
	public Product(long productId, String productName, String rating, String description, double price, int stock,
			int discount, String status, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.rating = rating;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.discount = discount;
		this.status = status;
		this.category = category;
	}



	public long getProductId() {
		return productId;
	}



	public void setProductId(long productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", rating=" + rating
				+ ", description=" + description + ", price=" + price + ", stock=" + stock + ", discount=" + discount
				+ ", status=" + status + ", category=" + category + "]";
	}

}

