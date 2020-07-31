package com.icom.order.feign.dto;

import java.util.UUID;


public class ProductDTO {
	
	private UUID productId;
	
	private String productName;
	
	private String description;
	
	private double price;

	
	private int inStock;


	public UUID getProductId() {
		return productId;
	}


	public void setProductId(UUID productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
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


	public int getInStock() {
		return inStock;
	}


	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
}
