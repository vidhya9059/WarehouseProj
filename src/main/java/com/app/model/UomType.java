package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uomtab")
public class UomType {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	@Column(name="utype")
	private String uomtype;

	@Column(name="umodel")
	private String uommodel;

	@Column(name="descr")
	private String descreption;

	public UomType() {
		super();
	}

	public UomType(Integer id, String uomtype, String uommodel, String descreption) {
		super();
		this.id = id;
		this.uomtype = uomtype;
		this.uommodel = uommodel;
		this.descreption = descreption;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUomtype() {
		return uomtype;
	}

	public void setUomtype(String uomtype) {
		this.uomtype = uomtype;
	}

	public String getUommodel() {
		return uommodel;
	}

	public void setUommodel(String uommodel) {
		this.uommodel = uommodel;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	@Override
	public String toString() {
		return "UomType [id=" + id + ", uomtype=" + uomtype + ", uommodel=" + uommodel + ", descreption=" + descreption
				+ "]";
	}



}
