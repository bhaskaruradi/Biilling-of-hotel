package com.capgemini.bill;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Product;
import com.capgemini.salesmanagement.exception.custom;
import com.capgemini.salesmanagement.exception.custom1;
import com.capgemini.salesmanagement.service.IProductService;
import com.capgemini.salesmanagement.service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc =new Scanner(System.in);
		IProductService ps = new ProductService();
		
		System.out.println("Enter Product details");
		System.out.println("Enter the product code");
		int productcode = sc.nextInt();
		Product p = ps.getProductDetails(productcode);
		
		

			
		
		if(p!=null)
		System.out.println(p.getProductname()+" " +p.getProductcategory()+ " " + p.getProductdescription()+" "+ p.getProductprice());
		
		try {
			throw new custom();
			}catch(custom e) {System.exit(0);};
		
		System.out.println("enter the quantity");
		int product = sc.nextInt();
		
		try {
			throw new custom1();
			}catch(custom1 e) {System.exit(0);};
		
		int update = p.getProductprice() * product;
		System.out.println(update);
		
		
		p.setProductcode(productcode);
		p.setQuantity(product);
		p.setLinetotal(update);
		boolean p1 = ps.insertSalesDetails(p);
}
}
