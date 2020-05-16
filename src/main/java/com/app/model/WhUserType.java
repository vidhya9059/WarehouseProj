package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whusertypetab")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="utype")
	private String userType;
	@Column(name="ucode")
	private String userCode;
	@Column(name="userfor")
	private String userFor;
	@Column(name="uemail")
	private String userEmail;
	@Column(name="ucontact")
	private String userContact;
	@Column(name="uidtype")
	private String userIdType;
	@Column(name="uidother")
	private String ifOther;
	@Column(name="uidnumber")
	private String idNumber;
	public WhUserType() {
		super();
	}
	public WhUserType(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserFor() {
		return userFor;
	}
	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getIfOther() {
		return ifOther;
	}
	public void setIfOther(String ifOther) {
		this.ifOther = ifOther;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	@Override
	public String toString() {
		return "WhUserType [id=" + id + ", userType=" + userType + ", userCode=" + userCode + ", userFor=" + userFor
				+ ", userEmail=" + userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType
				+ ", ifOther=" + ifOther + ", idNumber=" + idNumber + "]";
	}
	

}
