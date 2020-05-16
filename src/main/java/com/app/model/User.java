package com.app.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="usertab")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="uname")
	private String userName;
	@Column(name="umail")
	private String userEamil;
	@Column(name="upassword")
	private String userPassword;
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="rolestab",joinColumns=@JoinColumn(name="id"))
	@Column(name="uroles")
	private Set<String> userRoles;
	public User() {
		super();
	}
	public User(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEamil() {
		return userEamil;
	}
	public void setUserEamil(String userEamil) {
		this.userEamil = userEamil;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Set<String> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<String> userRoles) {
		this.userRoles = userRoles;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEamil=" + userEamil + ", userPassword="
				+ userPassword + ", userRoles=" + userRoles + "]";
	}

}
