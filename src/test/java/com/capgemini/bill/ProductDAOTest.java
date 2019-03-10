package com.capgemini.bill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.salesmanagement.bean.Product;
import com.capgemini.salesmanagement.dao.ProductDao;

class ProductDAOTest {
 static ProductDao ProductDAOTest;
 
 @Before
 public static void init() {
	 ProductDAOTest = new ProductDao();
 }
	@Test
	void testDetails() {
		Product p = new Product();
		//p.setSalesid(301);
		p.setProductcode(1001);
		//p.setQuantity(2);
		//p.setLinetotal(70000);
//Product p1 =  ProductDAOTest.getProductDetails(0);
		assertEquals(1001, p.getProductcode());
	}

	@Test
	void testInsert() {
		Product p = new Product();
		p.setLinetotal(70000);
		p.setQuantity(2);
		assertEquals(70000, p.getLinetotal());
		assertEquals(2, p.getQuantity());
		
	}
}
