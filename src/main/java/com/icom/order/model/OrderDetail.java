package com.icom.order.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table
public class OrderDetail {

	@Id
	@Column(name = "ORDER_DETAIL_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID orderDetailId;
	
	@Column(name = "PROD_NAME")
	private String productName;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "QUANTITY")
	private double quantity;
	
	@Column(name = "PRICE")
	private double price;
	
	@ManyToOne(targetEntity = Order.class)
	@JoinColumn(name = "orderId")
	private Order order;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public UUID getOrderDetailId() {
		return orderDetailId;
	}
	
}
