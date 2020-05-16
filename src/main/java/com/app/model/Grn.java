package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grntab")
public class Grn {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="gcode")
	private String grnCode;
	@Column(name="gtype")
  private String grnType;
	@Column(name="ocode")
	private String orderCode;
	@Column(name="descri")
  private String description;
	public Grn() {
		super();
	}
	public Grn(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGrnCode() {
		return grnCode;
	}
	public void setGrnCode(String grnCode) {
		this.grnCode = grnCode;
	}
	public String getGrnType() {
		return grnType;
	}
	public void setGrnType(String grnType) {
		this.grnType = grnType;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Grn [id=" + id + ", grnCode=" + grnCode + ", grnType=" + grnType + ", orderCode=" + orderCode
				+ ", description=" + description + "]";
	}
	
}
