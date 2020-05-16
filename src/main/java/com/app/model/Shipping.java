package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Shipping {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="shipcode")
	private String shippingCode;
	@Column(name="shiprefnumber")
	private String ShippingRefNumber;
	@Column(name="courrefnumber")
	private String courierRefNumber;
	@Column(name="contactdet")
	private String contactDetails;
	@Column(name="sordercode")
	private String saleOrderCode;
	@Column(name="descri")
	private String description;
	@Column(name="billtoaddr")
	private String billToAddress;
	@Column(name="shiptpaddr")
	private String shipToAddress;
	public Shipping() {
		super();
	}
	public Shipping(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShippingCode() {
		return shippingCode;
	}
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	public String getShippingRefNumber() {
		return ShippingRefNumber;
	}
	public void setShippingRefNumber(String shippingRefNumber) {
		ShippingRefNumber = shippingRefNumber;
	}
	public String getCourierRefNumber() {
		return courierRefNumber;
	}
	public void setCourierRefNumber(String courierRefNumber) {
		this.courierRefNumber = courierRefNumber;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getSaleOrderCode() {
		return saleOrderCode;
	}
	public void setSaleOrderCode(String saleOrderCode) {
		this.saleOrderCode = saleOrderCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBillToAddress() {
		return billToAddress;
	}
	public void setBillToAddress(String billToAddress) {
		this.billToAddress = billToAddress;
	}
	public String getShipToAddress() {
		return shipToAddress;
	}
	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	@Override
	public String toString() {
		return "Shipping [id=" + id + ", shippingCode=" + shippingCode + ", ShippingRefNumber=" + ShippingRefNumber
				+ ", courierRefNumber=" + courierRefNumber + ", contactDetails=" + contactDetails + ", saleOrderCode="
				+ saleOrderCode + ", description=" + description + ", billToAddress=" + billToAddress
				+ ", shipToAddress=" + shipToAddress + "]";
	}
}
