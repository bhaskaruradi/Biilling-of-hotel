package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Product;
import com.capgemini.salesmanagement.service.IProductService;
import com.capgemini.salesmanagement.service.ProductService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		IProductService ps = new ProductService();
		
		System.out.println("Enter Product details");
		System.out.println("Enter the product code");
		int productcode = sc.nextInt();
		
		
		Product p = ps.getProductDetails(productcode);
		if(p!=null)
		System.out.println(p.getProductname()+" " +p.getProductcategory()+ " " + p.getProductdescription()+" "+ p.getProductprice());
		
		System.out.println("enter the quantity");
		int product = sc.nextInt();
		
		int update = p.getProductprice() * product;
		System.out.println(update);
		
		p.setProductcode(productcode);
		p.setQuantity(product);
		p.setLinetotal(update);
		boolean p1 = ps.insertSalesDetails(p);
	}

}
