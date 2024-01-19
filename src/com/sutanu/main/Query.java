package com.sutanu.main;

public class Query {
	
	public static String insertSupp = "INSERT INTO supplier ( supp_code, supp_name, address, contact_number, contact_person, designation, mobile_no, gst_number ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	public static String readSupp = "SELECT * from supplier";
}
