package com.icom.order.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.rest.core.annotation.RestResource;


@Entity
@Table
public class Shipment {

	@Id
	@Column(name = "SHIPMENT_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID shipmentId;
	
	@OneToOne
	@JoinColumn(name = "orderId")
	@RestResource(path = "order", rel = "order")
	private Order order;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	
	@Column(name = "RECEIVER_NAME")
	private String receiverName;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "STATUS")
	private String status;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UUID getShipmentId() {
		return shipmentId;
	}
	
	
}
