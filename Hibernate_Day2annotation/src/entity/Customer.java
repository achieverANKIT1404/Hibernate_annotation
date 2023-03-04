package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customtb")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="srno")
	private int srno;
	
	@Column
	private String fname,lname,address;
	
	public Customer() {
		super();
	}

	
	public Customer(int srno) {
		super();
		this.srno = srno;
	}

	

	public Customer(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}


	public Customer(int srno, String fname, String lname, String address) {
		super();
		this.srno = srno;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	}

