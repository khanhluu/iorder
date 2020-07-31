package com.icom.order.model;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table(name = "TBL_ORDER")
public class Order {
	
	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID orderId;
	
	@Column(name = "ORDER_DATE")
	private Timestamp orderDate;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	
	@Column(name = "STATUS")
	private String status;
	
	@OneToOne(mappedBy = "order")
	private Shipment shipInfo;
	
	@PrePersist
	protected void initOrderDate() {
		this.orderDate = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UUID getOrderId() {
		return orderId;
	}
	
}
