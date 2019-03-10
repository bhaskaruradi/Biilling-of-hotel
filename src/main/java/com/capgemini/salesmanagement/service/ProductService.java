package com.capgemini.salesmanagement.service;

import com.capgemini.salesmanagement.bean.Product;
import com.capgemini.salesmanagement.dao.IProductDao;
import com.capgemini.salesmanagement.dao.ProductDao;

public class ProductService implements IProductService{
IProductDao pd = new ProductDao();
	public Product getProductDetails(int productcode) {
		Product p = pd.getProductDetails(productcode);
		return p;
	}

	public boolean insertSalesDetails(Product product) {
	
		return pd.insertSalesDetails(product);
	}

	
}
