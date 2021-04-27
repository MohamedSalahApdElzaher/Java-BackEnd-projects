package com.webTracker.springdemo.dao;

import java.util.List;

import com.webTracker.springdemo.entity.Customer;

public interface customerDAO {
	
	// return list of customers
	public List <Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
