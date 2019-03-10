package com.capgemini.salesmanagement.service;

import com.capgemini.salesmanagement.bean.Product;

public interface IProductService {
	Product getProductDetails(int productcode);
	boolean insertSalesDetails(Product product);
}
