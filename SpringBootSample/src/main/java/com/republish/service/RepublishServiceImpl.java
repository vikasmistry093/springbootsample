package com.republish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.republish.dao.RepublishDAO;
import com.republish.model.Order;
import com.republish.model.Product;
import com.republish.model.User;

@Service
public class RepublishServiceImpl implements RepublishService {
	
	@Autowired
	RepublishDAO dao;

	@Override
	public List<Product> getAllProductsBySearchCriteria(int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserNameAndPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getOrdersByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateOrder() {
		// TODO Auto-generated method stub
		
	}

}
