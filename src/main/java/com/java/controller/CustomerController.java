package com.java.controller;

import com.java.model.Customer;
import com.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping( value = "/getAllCustomers",method = RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        List<Customer> custList = customerService.getAllCustomers();
        return custList;
    }

    @RequestMapping( value = "/getCustomerById",method = RequestMethod.GET)
    public Customer getAllCustomers(@RequestParam("customerId") Integer customerId){
        Customer customer = customerService.getCustomerById(customerId);
        return customer;
    }
}
