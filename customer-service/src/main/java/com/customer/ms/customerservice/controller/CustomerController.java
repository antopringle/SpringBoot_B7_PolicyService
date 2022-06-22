package com.customer.ms.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.ms.customerservice.dao.CustomerDAO;
import com.customer.ms.customerservice.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO cusDAO;

	@RequestMapping("/hello")
	public String hello() {
		return "Welcome to SpringBoot Session";
	}
	
	//Get all Customers
	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Customer> getCustomers(){
		List<Customer> list = cusDAO.getCustomers();
		return list;
	}
	
	//Get customer based on his ID
	@RequestMapping(value = "/customerId/{cusId}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Customer getCustomerById(@PathVariable String cusId){
		return cusDAO.getCustomerById(cusId);
	}
	
	//Add a new customer
	@RequestMapping(value = "/customer", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public Customer addCustomer(@RequestBody Customer customer){
		return cusDAO.addCustomer(customer);
	}
	
	//Delete a customer
	
	
}
