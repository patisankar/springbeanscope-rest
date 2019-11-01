package com.service;

import java.util.List;

import com.domain.Customer;

public interface CustomerService {

	List<Customer> allCustomers();

	Customer getCustomerDetail(String customerId);

}
