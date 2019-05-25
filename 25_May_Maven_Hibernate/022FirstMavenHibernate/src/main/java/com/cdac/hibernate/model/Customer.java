package com.cdac.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CDAC_CUSTOMER_ANO")
public class Customer {
	@Id //mapping primary key - assigned by the client
	//what if it will generated by the  database?
	@GeneratedValue(strategy=GenerationType.AUTO)
	//first hibernate will check for which database is configured, 
	//then which strategy db follows for primary key generation
	//accordingly will generate the PK using the specific DB strategy
	//eg: if MySQL -auto-increment
	//if Oracle then Sequence
	//NOTE: when we use generated value then never pass the id or set the id 
	@Column(name="CUST_ID")
	private Integer custId;
	
	@Column(name="CUST_NAME")
	private String custName;
	private String email;
	private String phone;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer custId, String custName, String email, String phone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
