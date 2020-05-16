package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="parttable")
public class Part {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="code")
	private String code;
	@Column(name="lenght")
	private Double lenght;
	@Column(name="height")
	private Double height;
	@Column(name="width")
	private Double width;
	@Column(name="basecode")
	private String baseCode;
	@Column(name="basecurrency")
	private Double baseCurrency;
	@ManyToOne
	@JoinColumn(name="uomIdFK")
	private UomType uomTypes;
	@ManyToOne
	@JoinColumn(name="orsaleIdFK")
	private OrderMethod orderSale;
	
	@ManyToOne
	@JoinColumn(name="orpurcIdFK")
	private OrderMethod orderPurchase;
	
	
	
	@Column(name="descri")
	private String description;
	public Part() {
		super();
	}
	public Part(Integer id, String code, Double lenght, Double height, Double width, String baseCode,
			Double baseCurrency, UomType uomTypes, String description) {
		super();
		this.id = id;
		this.code = code;
		this.lenght = lenght;
		this.height = height;
		this.width = width;
		this.baseCode = baseCode;
		this.baseCurrency = baseCurrency;
		this.uomTypes = uomTypes;
		this.description = description;
	}
	
	public OrderMethod getOrderPurchase() {
		return orderPurchase;
	}
	public void setOrderPurchase(OrderMethod orderPurchase) {
		this.orderPurchase = orderPurchase;
	}
	public OrderMethod getOrderSale() {
		return orderSale;
	}
	public void setOrderSale(OrderMethod orderSale) {
		this.orderSale = orderSale;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getLenght() {
		return lenght;
	}
	public void setLenght(Double lenght) {
		this.lenght = lenght;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public String getBaseCode() {
		return baseCode;
	}
	public void setBaseCode(String baseCode) {
		this.baseCode = baseCode;
	}
	public Double getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(Double baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public UomType getUomTypes() {
		return uomTypes;
	}
	public void setUomTypes(UomType uomTypes) {
		this.uomTypes = uomTypes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Part [id=" + id + ", code=" + code + ", lenght=" + lenght + ", height=" + height + ", width=" + width
				+ ", baseCode=" + baseCode + ", baseCurrency=" + baseCurrency + ", uomTypes=" + uomTypes
				+ ", orderSale=" + orderSale + ", orderPurchase=" + orderPurchase + ", description=" + description
				+ "]";
	}
	



}
