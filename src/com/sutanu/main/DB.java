package com.sutanu.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	static Connection conn = null;
	public static Connection connect() {
		try {
			String url = "jdbc:mysql://localhost:3306/scube_project";
			String username = "root";
			String password = "root";
			
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
