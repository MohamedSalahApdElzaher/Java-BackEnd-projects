package com.webTracker.springdemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webTracker.springdemo.entity.Customer;

@Repository
public class CustomerDaoImp implements customerDAO {
	
	// inject session factory to talk to db

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {    
		return sessionFactory.getCurrentSession()
				.createQuery("from customer order by lastName", Customer.class)
				.getResultList();		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		sessionFactory.getCurrentSession()
		.save(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				Customer theCustomer = currentSession.get(Customer.class, theId);
				
				return theCustomer;
			}

	@Override
	public void deleteCustomer(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();		
	}

}


