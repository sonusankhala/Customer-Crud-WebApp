package com.customer.crud.service;

import java.util.List;

import com.customer.crud.entity.Customer;

public interface CustomerService {

	List<Customer> findAll();
	
	Customer findById(int theId);
	
	void save(Customer theCustomer);
	
	void deleteById(int theId);
	
}
