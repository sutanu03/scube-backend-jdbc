package com.sutanu.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sutanu.main.DB;
import com.sutanu.main.Query;
import com.sutanu.main.model.Supplier;

public class SupplierDao {
	
	public static void createSupplier(Supplier supplier) throws SQLException {
		Connection conn = DB.connect();
		String query = Query.insertSupp;
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, supplier.getSupp_code());
		ps.setString(2, supplier.getSupp_name());
		ps.setString(3, supplier.getAddress());
		ps.setString(4, supplier.getContact_number());
		ps.setString(5, supplier.getContact_person());
		ps.setString(6, supplier.getDesignation());
		ps.setString(7, supplier.getMobile_no());
		ps.setString(8, supplier.getGst_number());
		
		System.out.println("\n ps = "+ps+"\n"+supplier);
		ps.executeUpdate();
		ps.close();
	}

}
