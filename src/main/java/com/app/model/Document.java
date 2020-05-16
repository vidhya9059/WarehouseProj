package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="docstab")
public class Document {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="fileName")
	private String fileName;
	@Column(name="fdoc")
	@Lob
	private byte[] fdoc;
	public Document() {
		super();
	}
	public Document(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public byte[] getFdoc() {
		return fdoc;
	}
	public void setFdoc(byte[] fdoc) {
		this.fdoc = fdoc;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", fileName=" + fileName + ", fdoc=" + Arrays.toString(fdoc) + "]";
	}
	
}





