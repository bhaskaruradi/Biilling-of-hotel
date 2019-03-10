package com.capgemini.salesmanagement.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;

import com.capgemini.salesmanagement.bean.Product;

public class ProductDao implements IProductDao {
	Product user = new Product();
	public Product getProductDetails(int productcode) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "root");
			
			Statement st = connection.createStatement();
			
			ResultSet rs = st.executeQuery("select * from product");
			int c =0;
			while(rs.next())
			{
				if(rs.getInt(1)==productcode)
				{
				user.setProductname(rs.getString(2));
				user.setProductcategory(rs.getString(3));
				user.setProductdescription(rs.getString(4));
				user.setProductprice(rs.getInt(5));
				}	
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;	
	}

	public boolean insertSalesDetails(Product product) {
		boolean user1 = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "root");
			Random r = new Random();
			int sales = Math.abs(r.nextInt());
			
			PreparedStatement pst = connection.prepareStatement("insert into sales  values(?,?,?,?,?)");
			pst.setInt(1,sales);
			pst.setInt(2,product.getProductcode());
			pst.setInt(3,product.getQuantity());
			pst.setDate(4,Date.valueOf(LocalDate.now()));
			pst.setInt(5,product.getLinetotal() );
			
			pst.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user1;
	}

}
