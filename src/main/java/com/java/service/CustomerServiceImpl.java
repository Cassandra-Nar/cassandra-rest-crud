package com.java.service;

import com.google.common.collect.Lists;
import com.java.model.Customer;
import com.java.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {

        Iterable<Customer> customers =  customerRepository.findAll();
        return Lists.newArrayList(customers);
    }

    @Override
    public Customer getCustomerById(Integer customerId) {
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        Customer customer =  customerOptional.get();

        return customer;
    }
}
