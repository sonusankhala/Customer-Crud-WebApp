package com.customer.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.crud.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
    // add a method to sort by last name
    public List<Customer> findAllByOrderByLastNameAsc();

}
