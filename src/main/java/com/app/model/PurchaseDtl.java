package com.app.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.app.model.Part;
//import javax.persistence.Table;
@Entity
//@Table(name="purdtltab")
public class PurchaseDtl {
	@Id
	//@Column(name="id")
	private Integer id;
	//@Column(name="slno")
	private Integer slno;
	//@Column(name="qty")
	private Integer qty;
	
	@ManyToOne
	
	@JoinColumn(name="partIdFk")
	
	private Part part;

	public PurchaseDtl() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "PurchaseDtl [id=" + id + ", slno=" + slno + ", qty=" + qty + ", part=" + part + "]";
	}
  
	 
}
