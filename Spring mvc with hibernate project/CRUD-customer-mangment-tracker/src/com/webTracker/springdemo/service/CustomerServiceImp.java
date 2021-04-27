package com.webTracker.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.webTracker.springdemo.dao.customerDAO;
import com.webTracker.springdemo.entity.Customer;

public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private customerDAO customerdao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerdao.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		customerdao.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerdao.getCustomer(theId);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerdao.deleteCustomer(theId);
	}
}



