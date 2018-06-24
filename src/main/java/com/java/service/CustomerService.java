package com.java.service;

import com.java.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(Integer customerId);
}
