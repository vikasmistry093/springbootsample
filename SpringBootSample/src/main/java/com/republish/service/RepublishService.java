package com.republish.service;

import java.util.List;

import com.republish.model.Order;
import com.republish.model.Product;
import com.republish.model.User;

public interface RepublishService {
	
	List<Product> getAllProductsBySearchCriteria(int pageNumber);
	
	Product getProductById(long id);
	
	User getUserByUserNameAndPassword();
	
	void saveOrUpdateUser();
	
	List<Order> getOrdersByUser();
	
	Order getOrderById();
	
	void saveOrUpdateOrder();

}
