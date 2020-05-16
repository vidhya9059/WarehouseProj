package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="saletable")
public class Sale {
	@Id
	//@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="ocode")
	private String orderCode;
	@Column(name="smode")
	private String shipmentMode;
	@Column(name="customer")
	private String customer;
	@Column(name="refNumber")
	private String refNumber;
	@Column(name="stockmode")
	private String stockMode;
	@Column(name="stocksource")
	private String stockSource;
	@Column(name="degstatus")
	private String defaultStatus;
	@Column(name="descri")
	private String description;
	public Sale() {
		super();
	}
	public Sale(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}
	public String getStockMode() {
		return stockMode;
	}
	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}
	public String getStockSource() {
		return stockSource;
	}
	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}
	public String getDefaultStatus() {
		return defaultStatus;
	}
	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", orderCode=" + orderCode + ", shipmentMode=" + shipmentMode + ", customer="
				+ customer + ", refNumber=" + refNumber + ", stockMode=" + stockMode + ", stockSource=" + stockSource
				+ ", defaultStatus=" + defaultStatus + ", description=" + description + "]";
	}


}
