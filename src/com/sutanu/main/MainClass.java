package com.sutanu.main;

import java.util.Scanner;

import com.sutanu.main.dao.SupplierDao;
import com.sutanu.main.model.Supplier;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		// driver load
		
		// connection establish
		
		// statement create
		
		// execute query
		
		// close connection
		
		// create supplier
		while(true) {
			System.out.println("\n Supplier management : ");
			System.out.println("Press 1 for entry, 2 for exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice!=1) break;
		switch(choice)
		{
		case 1 : {
			
			System.out.println("Enter supplier code : ");
			String supp_code = sc.nextLine();
			
			System.out.println("Enter supplier name : ");
			String supp_name = sc.nextLine();
			
			System.out.println("Enter supplier address : ");
			String address = sc.nextLine();
			
			System.out.println("Enter supplier contact number : ");
			String contact_number = sc.nextLine();
			
			System.out.println("Enter contact person : ");
			String contact_person = sc.nextLine();
			
			System.out.println("Enter contact person designation : ");
			String designation = sc.nextLine();
			
			System.out.println("Enter supplier mob no : ");
			String mobile_no = sc.nextLine();
			
			System.out.println("Enter supplier gst : ");
			String gst_number = sc.nextLine();
			
			Supplier supp = new Supplier(supp_code,supp_name,address,contact_number,contact_person,designation,mobile_no,gst_number);

			SupplierDao.createSupplier(supp);
			break;
			
		}
		case 2: {
			System.out.println("Enter supplier code : ");
			String supp_code = sc.nextLine();
			
			System.out.println("Enter supplier name : ");
			String supp_name = sc.nextLine();
			
			System.out.println("Enter supplier address : ");
			String address = sc.nextLine();
			
			System.out.println("Enter supplier contact number : ");
			String contact_number = sc.nextLine();
			
			System.out.println("Enter contact person : ");
			String contact_person = sc.nextLine();
			
			System.out.println("Enter contact person designation : ");
			String designation = sc.nextLine();
			
			System.out.println("Enter supplier mob no : ");
			String mobile_no = sc.nextLine();
			
			System.out.println("Enter supplier gst : ");
			String gst_number = sc.nextLine();
			
			Supplier supp = new Supplier(supp_code,supp_name,address,contact_number,contact_person,designation,mobile_no,gst_number);

			SupplierDao.createSupplier(supp);
			break;
		}
		}
		}	
	}

}
