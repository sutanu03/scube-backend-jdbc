package com.sutanu.main.model;

public class Supplier {
	
	private String supp_code;
	
	private String supp_name;
	
	private String address;
	
	private String contact_number;
	
	private String contact_person;
	
	private String designation;
	
	private String mobile_no;
	
	private String gst_number;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(String supp_code, String supp_name, String address, String contact_number, String contact_person,
			String designation, String mobile_no, String gst_number) {
		super();
		this.supp_code = supp_code;
		this.supp_name = supp_name;
		this.address = address;
		this.contact_number = contact_number;
		this.contact_person = contact_person;
		this.designation = designation;
		this.mobile_no = mobile_no;
		this.gst_number = gst_number;
	}

	public String getSupp_code() {
		return supp_code;
	}

	public void setSupp_code(String supp_code) {
		this.supp_code = supp_code;
	}

	public String getSupp_name() {
		return supp_name;
	}

	public void setSupp_name(String supp_name) {
		this.supp_name = supp_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getGst_number() {
		return gst_number;
	}

	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}

	@Override
	public String toString() {
		return "Supplier [supp_code=" + supp_code + ", supp_name=" + supp_name + ", address=" + address
				+ ", contact_number=" + contact_number + ", contact_person=" + contact_person + ", designation="
				+ designation + ", mobile_no=" + mobile_no + ", gst_number=" + gst_number + "]";
	}

}
