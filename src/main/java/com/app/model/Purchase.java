package com.app.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author JV
 *
 */
@Entity
@Table(name="purchasetable")
public class Purchase {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	@Column(name="ocode")
	private String orderCode;
	@Column(name="smode")
	private String shipmentMode;
	@Column(name="vendor")
	private String vendor;
	@Column(name="refnumber")
	private String referenceNumber;
	@Column(name="qcheck")
	private String qualityCheck;
	@Column(name="defstatus")
	private String defaultStatus;
	@Column(name="desrip")
	private String description;
	@ManyToOne
	@JoinColumn(name="shipIdFK")
	private ShipmentType shipmentType;
     @ManyToOne
     @JoinColumn(name="whIdFK")
	private WhUserType whUserTypeVendor;
	@OneToMany
	@JoinColumn(name="puIdFk")
	  private List<PurchaseDtl> purchaseDtl; 
     
     
	public Purchase() {
		super();
	}
    
	public List<PurchaseDtl> getPurchaseDtl() {
		return purchaseDtl;
	}

	public void setPurchaseDtl(List<PurchaseDtl> purchaseDtl) {
		this.purchaseDtl = purchaseDtl;
	}

	public ShipmentType getShipmentType() {
		return shipmentType;
	}

	public void setShipmentType(ShipmentType shipmentType) {
		this.shipmentType = shipmentType;
	}
	


	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Purchase(Integer id) {
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
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
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


	public WhUserType getWhUserTypeVendor() {
		return whUserTypeVendor;
	}


	public void setWhUserTypeVendor(WhUserType whUserTypeVendor) {
		this.whUserTypeVendor = whUserTypeVendor;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", orderCode=" + orderCode + ", shipmentMode=" + shipmentMode + ", vendor="
				+ vendor + ", referenceNumber=" + referenceNumber + ", qualityCheck=" + qualityCheck
				+ ", defaultStatus=" + defaultStatus + ", description=" + description + ", shipmentType=" + shipmentType
				+ ", whUserTypeVendor=" + whUserTypeVendor + ", purchaseDtl=" + purchaseDtl + "]";
	}


		
	
}
